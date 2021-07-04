package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.infraestructure.api.controller.JobApplicationRestController;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;
import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(JobApplicationRestController.class)
public class JobApplicationTest {
	
    @Test
    public void tessStatusJobApplication() {
    	JobApplicationJPA jobapplicationjpa = new JobApplicationJPA();
        jobapplicationjpa.setStatus("Pending");
        assertEquals(jobapplicationjpa.getStatus(), "Pending");
    }

}
