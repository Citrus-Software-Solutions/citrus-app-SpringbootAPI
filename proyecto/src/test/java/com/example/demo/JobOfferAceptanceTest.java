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
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class JobOfferAceptanceTest {

    @Autowired
    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext webApplicationContext;
    
    @Autowired
    private JobOfferRepository repository;
    
   @Before
    public void setUp() {
    	mvc = MockMvcBuilders
                .webAppContextSetup(this.webApplicationContext)
                .build();
    }
   
	@Test
    public void GetJobOfferOfDatabaseFromController()
      throws Exception {
    	JobOfferJPA jobofferjpa = new JobOfferJPA("mariana", "Trabajo para una persona que quiere ampliar conocimientos", (long) 4L, Date.valueOf("2021-07-11"), Date.valueOf("2021-07-17"), "Published", "F", 300F, 18, 45, (long) 2, (long) 32);
    	
    	
        mvc.perform(get("/job-offer/"))
          .andExpect(status().isOk())
          .andReturn();

    }
	
	@Test
    public void PostJobOfferOfDatabaseFromController()
      throws Exception {
    	JobOfferJPA jobofferjpa = new JobOfferJPA("mariana", "Trabajo para una persona que quiere ampliar conocimientos", (long) 4L, Date.valueOf("2021-07-11"), Date.valueOf("2021-07-17"), "Published", "F", 300F, 18, 45, (long) 2, (long) 32);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	  
    	String json = mapper.writerWithDefaultPrettyPrinter()
    	                    .writeValueAsString(jobofferjpa);
    	
    	mvc.perform(post("/job-offer/")
    	        .content(json)
    	        .contentType(MediaType.APPLICATION_JSON))
    	        .andExpect(status().isOk());

    }
}
