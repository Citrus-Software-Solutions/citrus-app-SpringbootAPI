package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Bill_Amount;
import com.example.demo.domain.valueObjects.Bill_Id;
import com.example.demo.domain.valueObjects.Date_Format;

public class Bill {
	
	Bill_Id id;
	Employer employer;
	JobOffer[] jobOffer;
	Bill_Amount amount;
	Date_Format date;

}
