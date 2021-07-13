package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Payment_Gross_Pay;
import com.example.demo.domain.valueObjects.Payment_Id;
import com.example.demo.domain.valueObjects.Payment_Net_Payment;
import com.example.demo.domain.valueObjects.Payment_Status;

public class Payment {
	
	Payment_Id id;
	Employee employee;
	JobOffer[] jobOffer;
	Payment_Gross_Pay grossPay;
	Payment_Net_Payment netPayment;
	Date_Format startDate;
	Date_Format endDate;
	Payment_Status status;

}
