package com.example.demo.infraestucture.db;
import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.example.demo.domain.JobOffer;

@Component
@Mapper(componentModel = "spring")
public interface JobOfferJPAMapper {
	JobOffer toDomain(JobOfferJPA jobOffer);
	List<JobOffer> toDomain(List<JobOfferJPA> jobOffer); 
	JobOfferJPA toDbo(JobOffer jobOffer);
	List<JobOfferJPA> toDbo(List<JobOffer> jobOffer); 
	
}