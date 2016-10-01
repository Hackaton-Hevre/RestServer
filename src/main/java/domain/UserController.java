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
	
	
	public User GetUserByName(String UserName)
	{
		User currUser = Users.get(UserName);
		return currUser;
		
	}
	
	public void addProductToUser(User user, ActualProduct prod)
	{
		user.AddActProdToList(prod);
	}
	
	public LinkedList<String> getProductListByUserName(String uName)
	{
		User user = Users.get(uName);
		return productsToString(user.getProductList());
	}
	
	private LinkedList<String> productsToString(LinkedList<ActualProduct> list)
	{
		LinkedList<String> res = new LinkedList<String>();
		for(int i = 0; i< list.size(); i++)
		{
			ActualProduct p = list.get(i);
			if(p.isActive())
			{
				String str = p.getGenericProduct().getName();	
				res.add(str);
			}
			
		}
		
		return res;
	}

}
