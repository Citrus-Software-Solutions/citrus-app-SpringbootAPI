package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import application.port.IUser;
import domain.User;

public class UserService {
    private final IUser iuser; 
    
    @Autowired
    public UserService(@Qualifier("postgres") IUser iuser) {
    	this.iuser=iuser;
    }
    
    
    public int addUser(User user) {
    	return iuser.addUser(user);
    }
    
    public List<User> getAllUsers()
    {
    	return iuser.selectAllUsers();
    }
}
