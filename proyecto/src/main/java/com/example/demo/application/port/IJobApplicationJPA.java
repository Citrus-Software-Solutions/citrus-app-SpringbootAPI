package com.example.demo.application.port;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.adapter.out.persistance.JobApplicationJpaEntity;

@Repository
public interface IJobApplicationJPA extends JpaRepository<JobApplicationJpaEntity, Long>{
    
}
