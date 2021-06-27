package adapter;

import java.util.List;

import org.springframework.stereotype.Repository;

import application.port.IUser;
import domain.User;


@Repository("postgres")
public class UserPersistence implements IUser
{

	@Override
	public int addUser(User user) {
		return 0;
	}

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	}