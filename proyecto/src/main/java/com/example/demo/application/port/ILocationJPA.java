package com.example.demo.application.port;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.adapter.out.persistance.LocationJpaEntity;

@Repository
public interface ILocationJPA extends JpaRepository<LocationJpaEntity, Long> {

}
