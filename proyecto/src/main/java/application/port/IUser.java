package application.port;

import java.util.List;
import domain.User;

public interface IUser {
   
	int addUser(User user);
	
	List<User> selectAllUsers();
    
}
