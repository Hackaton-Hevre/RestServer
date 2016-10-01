package domain;

import java.util.HashMap;
import java.util.LinkedList;



public class UserController {
	
  
	private HashMap<String, User> Users;
	private static UserController Instance;
	
	private UserController (){
		this.Users = new HashMap<String, User>(); 
	}

	public static UserController getInstance()
	{
		if(Instance == null)
		{
			Instance = new UserController();
		}
		return Instance;
	}
	
	public LoginStatus register(String UserName, String Password, String Email){
		
		if(Users.containsKey(UserName))
		{
			return LoginStatus.NAME_ALREADY_EXISTS;
		}
		else
		{
			User nUser = new User(UserName, Password, Email);
			Users.put(UserName, nUser);
			return LoginStatus.SUCCESS;
		}
	}
	
	public LoginStatus login(String UserName, String Password)
	{
		if(!Users.containsKey(UserName))
		{
			return LoginStatus.NAME_DOESNT_EXIST;
		}
		User currUser = Users.get(UserName);
		if(!currUser.getPassword().equals(Password))
		{
			return LoginStatus.INVALID_CREDENTIALS;
		}
		return LoginStatus.SUCCESS;
	}

}
