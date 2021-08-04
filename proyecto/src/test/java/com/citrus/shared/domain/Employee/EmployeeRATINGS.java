package com.citrus.shared.domain.Employee;

import com.citrus.shared.domain.MotherCreator;

public class EmployeeRATINGS {
	
    public static Float random() {
    	return (float) MotherCreator.random().number().randomDigit();
    }

}
