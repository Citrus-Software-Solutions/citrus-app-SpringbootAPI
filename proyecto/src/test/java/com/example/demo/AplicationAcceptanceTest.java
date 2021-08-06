package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes={com.citrus.api.ProyectoApplication.class})
public class AplicationAcceptanceTest {

	@Autowired
    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext webApplicationContext;
    
    @Autowired
    private JobApplicationRepository repository;
    
    @Before
    public void setUp() {
    	mvc = MockMvcBuilders
                .webAppContextSetup(this.webApplicationContext)
                .build();
    }
    
    @Test
    public void GetJobOfferOfDatabaseFromController()
      throws Exception {
    	ApplicationJPA jobofferjpa = new ApplicationJPA(null, 2, Date.valueOf("2021-08-06"), 2, 1);
    	
    	
        mvc.perform(get("/job-application/"))
          .andExpect(status().isOk())
          .andReturn();

    }
    
    @Test
    public void PostJobOfferOfDatabaseFromController()
      throws Exception {
		ApplicationJPA jobofferjpa = new ApplicationJPA(null, 2, Date.valueOf("2021-08-06"), 2, 1);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	  
    	String json = mapper.writerWithDefaultPrettyPrinter()
    	                    .writeValueAsString(jobofferjpa);
    	
    	mvc.perform(post("/job-application/")
    	        .content(json)
    	        .contentType(MediaType.APPLICATION_JSON))
    	        .andExpect(status().isOk());

    }
}
