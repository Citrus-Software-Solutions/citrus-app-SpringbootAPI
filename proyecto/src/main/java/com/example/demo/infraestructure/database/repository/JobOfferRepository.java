package com.example.demo.infraestructure.database.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;


@Repository
public interface JobOfferRepository extends JpaRepository<JobOfferJPA, Long> {
	public List<JobOfferJPA> findByEmployerId(@Param("EmployerId") Long EmployerId);
	public List<JobOfferJPA> findByStatus(@Param("status") String status);
	public JobOfferJPA findByName(String name);
}