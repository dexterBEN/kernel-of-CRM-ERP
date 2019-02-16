package myPenelop.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import myPenelop.IUserDao;
import myPenelop.User;

public class UserDaoImpl implements IUserDao {
	
	//list is working as a database
	   List<User> users;
	
	//constructor:
	public UserDaoImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public List<User> findAllUsers() {
		
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("./././users.json"));
			JSONObject jsonObjectUser  = (JSONObject) obj;
			//System.out.println(jsonObjectUser);
			
			String name = (String) jsonObjectUser.get("name");
            //System.out.println(name);
            
            JSONArray usersList = (JSONArray) jsonObjectUser.get("users");
            Iterator<String> iterator = usersList.iterator();
            
            while(iterator.hasNext()) {
            	Object o = iterator.next();
            	System.out.println(o);
            }
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
            e.printStackTrace();
        }
		
		return null;
	}

	@Override
	public User findUserById(int idToFind) {
		
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Give an id: ");
		//idToFind = inputUser.nextInt();
				
		try {
			Object obj = parser.parse(new FileReader("./././users.json"));
			JSONObject jsonObjectUser  = (JSONObject) obj;
			//System.out.println(jsonObjectUser);
			
			int id = (Integer) jsonObjectUser.get("id");
            System.out.println("Voici id recup: "+id);
            
            JSONArray usersList = (JSONArray) jsonObjectUser.get("users");
            Iterator<String> iterator = usersList.iterator();
            
            while(iterator.hasNext()) {
            	Object o = iterator.next();
            	//System.out.println(o);
            	
            	if(idToFind == id) {
            		System.out.print("L'utilisateur à été trouver voici ces information: "+o);
            		return null;
            	}
            }
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
            e.printStackTrace();
        }
		
		return null;
	}
	
	@Override
	public int generateIdNewUser() {
		return 0;
	}
	
	@Override
	public User findUserByName(String name) {
		return null;
	}
	
	@Override
	public User createUser(User newUser) {
		return newUser;
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
