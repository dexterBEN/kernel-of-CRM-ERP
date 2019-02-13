package myPenelop;
import java.util.List;

public interface IUserDao {
	
	   public List<User> getAllUsers();
	   public User getUser(int id);
	   public void updateUser(User user);
	   public void deleteUser(User user);
}
