package com.citrus.api.infraestructure.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewJPA, Integer>{

	public List<ReviewJPA> findByEmployerId(@Param("employer_id") Integer employer_id);
	
}
