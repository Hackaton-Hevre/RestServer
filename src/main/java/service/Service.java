package service;

import domain.*;

public class Service implements IService {
//avichay is a gay fucker

	private BusinessController BusinessCont;
	private ProductController ProductCont;
	private UserController UserCont;
	private static Service Instance;
	
	private Service()
	{
		BusinessCont = BusinessController.getInstance();
		ProductCont = ProductController.getInstance();
		UserCont = UserController.getInstance();
	}
	
	public static Service getInstance()
	{
		if(Instance == null)
		{
			Instance = new Service();
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
