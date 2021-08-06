package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.repository.JobApplicationRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@JsonFormat(pattern="yyyy-MM-dd")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SpringBootTest(classes={com.citrus.api.ProyectoApplication.class})
public class ApplicationIntegrationTest {

	@Autowired
    private MockMvc mvc;
	
    @Autowired
    private JobApplicationRepository repository;
    
    @Autowired
    protected WebApplicationContext webApplicationContext;
    
    @Before
    public void setUp() {
    	mvc = MockMvcBuilders
                .webAppContextSetup(this.webApplicationContext)
                .build();
    }
    
    @Test
    public void givenJobApplication_whenGetJobApplication_thenStatus200()
      throws Exception {
 	  	ApplicationJPA jobapplicationjpa = new ApplicationJPA(null, 2, Date.valueOf("2021-08-06"), 2, 1);
    	
    	repository.save(jobapplicationjpa);
        long id = jobapplicationjpa.getId();
        
        ObjectMapper mapper = new ObjectMapper();
    	  
    	String json = mapper.writerWithDefaultPrettyPrinter()
    	                    .writeValueAsString(jobapplicationjpa);
    	
        mvc.perform(get("/job-application/{id}", id)
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content()
          .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
          .andExpect(jsonPath("id", is(jobapplicationjpa.getId())))
          //.andExpect(jsonPath("date_application", is(jobapplicationjpa.getDate_application())))
          .andExpect(jsonPath("status", is(jobapplicationjpa.getStatus())));
          //.andExpect(jsonPath("employee_id", is(jobapplicationjpa.getEmployee_id())))
          //.andExpect(jsonPath("job_offer_id", is(jobapplicationjpa.getJob_offer_id())));
        System.out.println(json);
    }
}
