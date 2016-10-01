package service;

import domain.*;

public class DataService implements IService {

	private BusinessController BusinessCont;
	private ProductController ProductCont;
	private UserController UserCont;
	private static DataService Instance;
	
	private DataService()
	{
		BusinessCont = BusinessController.getInstance();
		ProductCont = ProductController.getInstance();
		UserCont = UserController.getInstance();
	}
	
	public static DataService getInstance()
	{
		if(Instance == null)
		{
			Instance = new DataService();
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
	
}
