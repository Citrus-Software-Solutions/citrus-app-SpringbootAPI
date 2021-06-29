package com.example.demo.application.port;

import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import javax.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.adapter.out.persistance.Job_OfferJpa;

@Repository
public interface IJob_OfferJPA extends JpaRepository<Job_OfferJpa, Long> {

	public List<Job_OfferJpa> findByEmployerId(@Param("EmployerId") Long EmployerId);
	public List<Job_OfferJpa> findByStatus(@Param("status") String status);
	
}
