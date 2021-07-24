package com.example.demo.cqrs.classes;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> store = new HashMap<>();

	public void addUser(String userId, User user) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(String userId) {
		for (String i: store.keySet()) {
			if(userId == i) {
				return store.get(i);
			}
		}
		 
		return store.get(1);
	}
}
