package service;

import domain.BusinessController;
import domain.LoginStatus;
import domain.ProductController;
import domain.UserController;


public class UserService implements IService {



	private UserController UserCont;
	private static UserService Instance;
	
	private UserService()
	{
		UserCont = UserController.getInstance();
	}
	
	public static UserService getInstance()
	{
		if(Instance == null)
		{
			Instance = new UserService();
		}
		return Instance;
	}
	
	public LoginStatus login(String UserName, String Password){
			
		return UserCont.login(UserName, Password);
	}
	
	public LoginStatus register(String UserName, String Password, String Email){
		
		return UserCont.register(UserName, Password, Email);
	}

}
