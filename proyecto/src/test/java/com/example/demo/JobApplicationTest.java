package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.infraestructure.api.controller.JobApplicationRestController;
import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;

import static org.junit.Assert.assertNotNull;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(JobApplicationRestController.class)
public class JobApplicationTest {
	
    @Test
    public void tessStatusJobApplication() {
    	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA();
        jobapplicationjpa.setStatus("Pending");
        assertNotNull(jobapplicationjpa.getStatus());
    }
    
    @Test
    public void testIdJobApplication() {
    	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA();
        jobapplicationjpa.setId(1);
        assertNotNull(jobapplicationjpa.getId());
    }
    
    @Test
    public void testEmployeeIdJobApplication() {
    	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA();
        jobapplicationjpa.setEmployee_id((long) 2);
        assertNotNull(jobapplicationjpa.getEmployee_id());
    }
    
    @Test
    public void testJobOfferIdJobApplication() {
    	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA();
        jobapplicationjpa.setJob_offer_id((long) 2);;
        assertNotNull(jobapplicationjpa.getJob_offer_id());
    }

}
