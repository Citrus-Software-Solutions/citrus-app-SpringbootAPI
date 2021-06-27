package com.example.demo.application.port;

import java.util.List;


import com.example.demo.domain.User;

public interface IUser {
   
	int addUser(User user);
	
	List<User> selectAllUsers();
    
}
