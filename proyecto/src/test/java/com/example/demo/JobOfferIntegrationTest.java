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

import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@JsonFormat(pattern="yyyy-MM-dd")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobOfferIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JobOfferRepository repository;
    
    @Autowired
    protected WebApplicationContext webApplicationContext;
    
   @Before
    public void setUp() {
    	mvc = MockMvcBuilders
                .webAppContextSetup(this.webApplicationContext)
                .build();
    }
    
    @Test
    public void givenJobOffer_whenPostJobOffer_thenStatus200() throws Exception {
    	JobOfferJPA jobofferjpa = new JobOfferJPA("mariana", "Trabajo para una persona que quiere ampliar conocimientos", (long) 4L, Date.valueOf("2021-07-11"), Date.valueOf("2021-07-17"), "Published", "F", 300F, 18, 45, (long) 2, (long) 32);
    	
    	ObjectMapper mapper = new ObjectMapper();
  	  
    	String json = mapper.writerWithDefaultPrettyPrinter()
    	                    .writeValueAsString(jobofferjpa);
    	
        mvc.perform(post("/job-offer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk());

        // HACER FUNCION DEL OBJETO JPA Y SE PASA A JSON Y SE LLAMA LA FUNCION EN EL GET Y POST 
        //ESTO PARA JOBOFFER Y JOBAPPLICATION
        
    }
    
	@Test
    public void givenJobOffer_whenGetJobOffer_thenStatus200()
      throws Exception {
    	JobOfferJPA jobofferjpa = new JobOfferJPA("mariana", "Trabajo para una persona que quiere ampliar conocimientos", (long) 4L, Date.valueOf("2021-07-11"), Date.valueOf("2021-07-17"), "Published", "F", 300F, 18, 45, (long) 2, (long) 32);
    	
    	repository.save(jobofferjpa);
        long id = jobofferjpa.getId();
        
        ObjectMapper mapper = new ObjectMapper();
    	  
    	String json = mapper.writerWithDefaultPrettyPrinter()
    	                    .writeValueAsString(jobofferjpa);
    	
        mvc.perform(get("/job-offer/{id}", id)
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content()
          .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
          .andExpect(jsonPath("name", is(jobofferjpa.getName())))
          .andExpect(jsonPath("description", is(jobofferjpa.getDescription())))
          .andExpect(jsonPath("available_vacans", is(jobofferjpa.getAvailable_Vacans().intValue())))
          //.andExpect(jsonPath("date_begin", is(jobofferjpa.getDate_Begin())))
          //.andExpect(jsonPath("date_end", is(jobofferjpa.getDate_End())))
          .andExpect(jsonPath("status", is(jobofferjpa.getStatus())))
          .andExpect(jsonPath("gender", is(jobofferjpa.getGender())))
          //.andExpect(jsonPath("salary", is(jobofferjpa.getSalary().floatValue())))
          .andExpect(jsonPath("min_age", is(jobofferjpa.getMin_Age())))
          .andExpect(jsonPath("max_age", is(jobofferjpa.getMax_Age())));
          //.andExpect(jsonPath("employerId", is(jobofferjpa.getEmployer_Id().intValue())));
          //.andExpect(jsonPath("location_id", is(jobofferjpa.getLocation_Id().intValue())));
    }
	

}
