package com.example.demo.application.port;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.adapter.out.persistance.Job_Offer;

@Repository
public interface IJob_OfferJPA extends JpaRepository<Job_Offer, Long> {

}
