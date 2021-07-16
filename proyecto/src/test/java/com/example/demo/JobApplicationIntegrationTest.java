package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@JsonFormat(pattern="yyyy-MM-dd")
public class JobApplicationIntegrationTest {
	
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
   public void givenJobApplication_whenPostJobApplication_thenStatus200() throws Exception {
	   JobApplicationJPA jobapplicationjpa = new JobApplicationJPA("Pending", Date.valueOf("2021-07-14"), (long) 2, (long) 5);
   	
	ObjectMapper mapper = new ObjectMapper();
	  
	String json = mapper.writerWithDefaultPrettyPrinter()
	                    .writeValueAsString(jobapplicationjpa);
	
       mvc.perform(post("/job-application/")
               .contentType(MediaType.APPLICATION_JSON)
               .content(json))
               .andExpect(status().isOk());
       
   }
   
/*   @Test
   public void givenJobOffer_whenGetJobOffer_thenStatus200()
     throws Exception {
   	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA("Pending", Date.valueOf("2021-07-14"), (long) 2, (long) 5);
   	
   	repository.save(jobapplicationjpa);
       long id = jobapplicationjpa.getId();
   	
       mvc.perform(get("/job-application/{id}", id)
         .contentType(MediaType.APPLICATION_JSON))
         .andExpect(status().isOk())
         .andExpect(content()
         .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
         .andExpect(jsonPath("status", is(jobapplicationjpa.getStatus())));
         //.andExpect(jsonPath("dateApplication", is(jobapplicationjpa.getDate_application())))
         //.andExpect(jsonPath("employeeId", is(jobapplicationjpa.getEmployee_id().intValue())))
         //.andExpect(jsonPath("job_offer_id", is(jobapplicationjpa.getJob_offer_id().intValue())));

   }*/

}
