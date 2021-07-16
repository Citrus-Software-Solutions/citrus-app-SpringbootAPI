package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.infraestructure.api.controller.JobOfferRestController;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(JobOfferRestController.class)
public class JobOfferTest {
	
    @Test
    public void testIdJobOffer() {
    	JobOfferJPA jobofferjpa = new JobOfferJPA();
    	jobofferjpa.setId(2);
        assertNotNull(jobofferjpa.getId());
    }
    @Test
    public void tessNameJobOffer() {
    	JobOfferJPA jobofferjpa = new JobOfferJPA();
    	jobofferjpa.setName("Jose");;
        assertNotNull(jobofferjpa.getName());
    }
    @Test
    public void tessDescriptionJobOffer() {
    	JobOfferJPA jobofferjpa = new JobOfferJPA();
    	jobofferjpa.setDescription("Hola como estas esto es una prueba");;
        assertNotNull(jobofferjpa.getDescription());
    }
    @Test
    public void tessAvailable_vacansJobOffer() {
    	JobOfferJPA jobofferjpa = new JobOfferJPA();
    	jobofferjpa.setAvailable_Vacans((long) 3);;
        assertNotNull(jobofferjpa.getAvailable_Vacans());
    }

}
