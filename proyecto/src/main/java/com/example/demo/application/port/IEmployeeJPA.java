package com.example.demo.application.port;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.adapter.out.persistance.EmployeeJpaEntity;

public interface IEmployeeJPA extends JpaRepository<EmployeeJpaEntity, Long>{

}
