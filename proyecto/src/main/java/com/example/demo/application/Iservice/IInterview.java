package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.Interview;
import com.example.demo.domain.valueObjects.Interview_Id;

public interface IInterview {

	List<Interview> findInterview();
	Interview findInterview(Interview_Id id);
	Interview saveInterview(Interview interview);
	
}
