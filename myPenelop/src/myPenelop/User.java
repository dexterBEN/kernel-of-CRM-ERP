package myPenelop;

import java.util.ArrayList;
import java.util.List;

public class User {
	int id;
	String name;
	List<String> contactUser;//Stock� tous les contacts des user
	
	//contructor:
	public User(int id, String name, ArrayList<String> contactUser) {
		this.id = id ;
		this.name = name;
		this.contactUser = contactUser;
	}
}
