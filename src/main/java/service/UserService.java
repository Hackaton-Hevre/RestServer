package service;
//package service;
//
//import java.util.LinkedList;
//
//import aaa.comunication.JsonUtil;
//import domain.BusinessController;
//import domain.LoginStatus;
//import domain.ProductController;
//import domain.UserController;
//
//
//public class UserService implements IService {
//
//
//
//	private UserController UserCont;
//	private static UserService Instance;
//	
//	private UserService()
//	{
//		UserCont = UserController.getInstance();
//	}
//	
//	public static UserService getInstance()
//	{
//		if(Instance == null)
//		{
//			Instance = new UserService();
//		}
//		return Instance;
//	}
//	
//	public LoginStatus login(String UserName, String Password){
//			
//		return UserCont.login(UserName, Password);
//	}
//	
//	public LoginStatus register(String UserName, String Password, String Email){
//		
//		return UserCont.register(UserName, Password, Email);
//	}
//	
//	public String getUserProductsList(String uName)
//	{
//		LinkedList<String> list = UserCont.getProductListByUserName(uName);
//		JsonProducs jsonParam= new JsonProducs(list);
//		String json = JsonUtil.toJson(jsonParam);
//		return json;
//	}
//
//}
