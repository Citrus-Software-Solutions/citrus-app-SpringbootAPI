package com.example.demo.application.port;

import com.example.demo.adapter.out.persistance.StaffMemberJpaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStaffMemberJPA extends JpaRepository<StaffMemberJpaEntity, Long>{
    
}
