package com.citrus.api.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.domain.Interview;
import com.citrus.api.domain.Review;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;
import com.citrus.api.infraestructure.api.DTO.ReviewDTO;
import com.citrus.api.infraestructure.http.mapper.EmployeeMapperHTTP;
import com.citrus.api.infraestructure.http.mapper.EmployerMapperHTTP;

@Service
public class ReviewMapperDTO {
	
	
	@Autowired
	JobApplicationMapperDTO applicationMapper;
	
	@Autowired
	EmployeeMapperHTTP employeeMapper;
	
	@Autowired
	EmployerMapperHTTP employerMapper;
	
	@Autowired
	QuestionMapperDTO questionMapper;
	
	public ReviewDTO toDTO(Review review) {
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setTotalScore((review.getTotalScore()== null)? null:review.getTotalScore().getValue());

		if(review.getEmployee()==(null) ) {
			reviewDTO.setEmployee(null);
	    }else {
	    	reviewDTO.setEmployee(employeeMapper.getById(1));
	    }
		
		if(review.getApplication()==(null) ) {
			reviewDTO.setApplication(null);
	    }else {
	    	reviewDTO.setApplication(applicationMapper.toDTOR(review.getApplication()));
	    }
		if(review.getEmployer()==(null) ) {
			reviewDTO.setEmployer(null);
	    }else {
	    	reviewDTO.setEmployer(employerMapper.getById(1));
	    }
		
		
		return reviewDTO;
	}
	public List<ReviewDTO> toDTO(List<Review> review) {
	List<ReviewDTO> dto = new ArrayList<ReviewDTO>();
	for (int i = 0; i < review.size(); i++) {
		dto.add(toDTO(review.get(i)));
    }
	return dto;
}
	

}
