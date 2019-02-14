package myPenelop;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {
	
	//list is working as a database
	   List<User> users;
	
	//constructor:
	public UserDaoImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User findUserByName(String name) {
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
