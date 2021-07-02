package com.example.demo.infraestructure.database.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;


@Repository
public interface EmployerRepository extends JpaRepository<EmployerJPA, Long> {
	

}