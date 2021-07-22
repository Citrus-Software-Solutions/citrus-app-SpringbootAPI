package com.example.demo.infraestructure.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;

@Repository
public interface JobApplicationRepository extends JpaRepository<ApplicationJPA, Integer>{
	public List<ApplicationJPA> findByEmployeeId(@Param("employee_id") Integer employee_id);
}
