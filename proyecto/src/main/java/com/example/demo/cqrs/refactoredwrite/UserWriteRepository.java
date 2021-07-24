package com.example.demo.cqrs.refactoredwrite;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.cqrs.classes.User;

public class UserWriteRepository {
	private Map<String, User> store = new HashMap<>();

	public com.example.demo.cqrs.refactored.User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
