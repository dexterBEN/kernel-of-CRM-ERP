package myPenelop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import myPenelop.dao.UserDaoImpl;

import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		
		System.out.println("What you want to do?");
		System.out.println("To see the list of user write 1");
		System.out.println("To get a specific user type 2");
		Scanner inputUser = new Scanner(System.in);
		
		int choiceUser = inputUser.nextInt();
		IUserDao userDao = new UserDaoImpl();
		
		switch(choiceUser) 
		{
			case 1:
				userDao.findAllUsers();
				break;
				
			case 2:
				int idToFind = inputUser.nextInt();
				userDao.findUserById(idToFind);
				break;
				
			default:
				System.out.println("the commande does not exist");
				break;
		}
	}
}
