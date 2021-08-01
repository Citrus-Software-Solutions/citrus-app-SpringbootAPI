package com.citrus.api.infraestructure.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;

@Repository
public interface InterviewRepository extends JpaRepository<InterviewJPA, Integer>{

}
