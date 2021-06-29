package com.example.demo.infraestucture.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJobOfferRepository extends JpaRepository<JobOfferJPA, Long> {

	public List<JobOfferJPA> findByEmployerId(@Param("EmployerId") Long EmployerId);
	public List<JobOfferJPA> findByStatus(@Param("status") String status);

	
}
