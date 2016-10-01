package service;

import domain.*;

public class DataService implements IService {

	private BusinessController BusinessCont;
	private ProductController ProductCont;
	private static DataService Instance;
	
	private DataService()
	{
		BusinessCont = BusinessController.getInstance();
		ProductCont = ProductController.getInstance();
	}
	
	public static DataService getInstance()
	{
		if(Instance == null)
		{
			Instance = new DataService();
		}
		return Instance;
	}
	
	
}
