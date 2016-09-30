package service;

import domain.*;

public class Service implements IService {

	private BusinessController businessCont;
	private ProductController productCont;
	private static Service instance;
	
	private Service()
	{
		businessCont = BusinessController.getInstance();
		productCont = ProductController.getInstance();
	}
	
	public static Service getInstance()
	{
		if(instance == null)
		{
			instance = new Service();
		}
		return instance;
	}
	
}
