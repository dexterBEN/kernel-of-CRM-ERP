package myPenelop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Application {

	public static void main(String[] args){
		
		JSONObject obj = new JSONObject();
		JSONObject user = new JSONObject();
		List<String> contactUser =  new ArrayList<String>();
		contactUser.add("geoffrey");
		contactUser.add("bart") ;
		contactUser.add("karl") ;
		
		user.put("name", "john");
		user.put("id", 123);
		user.put("contacts", contactUser);
		
		
		//List<String> li =new ArrayList();
		//JSONObject class creates a json object,
		//provides a put function to insert the details into json object
		/*obj.put("name", "Abhishek Sharma");
		obj.put("department","B.E");
		obj.put("branch", "C.S.E");
		obj.put("year", 3);*/

		JSONArray list = new JSONArray();
		
		//This is a JSON Array List , 
		//It creates an array and then add the values in it  
		list.add("user 1");
		list.add("nacer");
		list.add("user 3");

		obj.put("users", list);//adding the list to our JSON Object

		try (FileWriter file = new FileWriter("./././users.json")) {
			//File Writer creates a file in write mode at the given location 
			file.write(obj.toJSONString());

			//write function is use to write in file,
			//here we write the Json object in the file
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(obj);
		//to print our JSon object 
	}
}
