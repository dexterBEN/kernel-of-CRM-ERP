package myPenelop;

import java.util.ArrayList;
import java.util.List;

public class User {
	int id;
	String name;
	List<String> contactUser;//Stocké tous les contacts des user
	
	//Constructor:
	public User(int id, String name, ArrayList<String> contactUser) {
		this.id = id ;
		this.name = name;
		this.contactUser = contactUser;
	}
	
	public int getId() {
		return id;
	}
}
