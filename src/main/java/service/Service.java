package service;

import java.util.LinkedList;

import aaa.comunication.JsonUtil;
import domain.*;

public class Service implements IService {

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
	
	public void addProductToUser(String pName, String uName)
	{
		User user = UserCont.GetUserByName(uName);
		Product product  = ProductCont.getProductByName(pName);
		if (product == null)
		{
			System.out.println("product doesnt exist");
		}
		else{
			System.out.println("adding product " + product.getName() + " to user " + user.getUserName());
			ActualProduct act = new ActualProduct(product, true);
			UserCont.addProductToUser(user, act);
		}
	}
	
	public void createDemoProduct(String name)
	{
		ProductCont.addProduct(name);
	}
	
	
	public LoginStatus login(String UserName, String Password){
			
		return UserCont.login(UserName, Password);
	}
	
	public LoginStatus register(String UserName, String Password, String Email){
		
		return UserCont.register(UserName, Password, Email);
	}

	public String ll2Json(LinkedList list) {
		JsonProducs jsonParam= new JsonProducs(list);
		String json = JsonUtil.toJson(jsonParam);
		return json;
	}

	public String getUserProductsList(String uName)
	{
		LinkedList<String> list = UserCont.getProductListByUserName(uName);
		return ll2Json(list);
	}

	public String getAllProducts() {
		LinkedList<String> allProducts = ProductCont.getAllProducts();
		return ll2Json(allProducts);

	}
	
}
