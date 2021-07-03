package com.example.demo.infraestructure.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplicationJPA, Long>{
	public List<JobApplicationJPA> findByEmployeeId(@Param("employee_id") Long employee_id);
}
