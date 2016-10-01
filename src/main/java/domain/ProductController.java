package domain;

import java.util.HashMap;
import java.util.List;

public class ProductController implements IProductController{
	
	private HashMap<String,Product> productData;
	private static ProductController instance;
	
	private ProductController()
	{
		productData = new HashMap<String, Product>();
	}
	

	public static ProductController getInstance()
	{
		if(instance == null)
		{
			instance = new ProductController();
		}
		return instance;
	}
	
	public Product getProductByName(String name)
	{
		return productData.get(name);
	}
	
	public void addProduct(String name)
	{
		Product p = new Product(name);
		productData.put(name, p);
	}
	
}
