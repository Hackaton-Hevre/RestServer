package aaa.aaa;

import java.util.LinkedList;
import java.util.List;

public class GreetingService {

	List<Greeting> greetings = new LinkedList<Greeting>();
	
	// returns a list of all users
	public List<Greeting> getAllUsers() { return greetings; }
	 
	// returns a single user by id
	public Greeting getUser(String id) { return greetings.get(0); }
	 
	// creates a new user
	public Greeting createUser(String name, int number) { 
		Greeting greeting = new Greeting(number, name);
		greetings.add(greeting); 
		return greeting;
	}
}
