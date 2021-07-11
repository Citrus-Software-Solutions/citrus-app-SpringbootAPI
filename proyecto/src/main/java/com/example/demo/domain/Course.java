package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Course_Code;
import com.example.demo.domain.valueObjects.Course_Cover_Image;
import com.example.demo.domain.valueObjects.Course_Id;
import com.example.demo.domain.valueObjects.Course_Status;
import com.example.demo.domain.valueObjects.Course_Title;

public class Course {
	
	Course_Id id;
	Course_Code code;
	Course_Title title;
	Course_Cover_Image coverImage;
	Skill[] skill;
	Course_Status Status;

}
