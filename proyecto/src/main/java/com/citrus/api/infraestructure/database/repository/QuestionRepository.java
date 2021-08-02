package com.citrus.api.infraestructure.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;


public interface QuestionRepository extends JpaRepository<QuestionJPA, Integer>{

	public List<QuestionJPA> findByReviewId(@Param("review_id") Integer review_id);

}
