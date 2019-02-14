package myPenelop;
import java.util.List;

public interface IUserDao {
	
	   public List<User> getAllUsers();
	   public User findUserById(int id);
	   public User findUserByName(String name);
	   public void updateUser(User user);
	   public void deleteUser(User user);
}
