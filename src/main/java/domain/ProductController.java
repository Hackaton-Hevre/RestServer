package domain;

import aaa.comunication.JsonUtil;
import service.JsonProducs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ProductController implements IProductController{

	/* constants */
	private static final boolean DEMO_FLAG = true;

	/* statics */
	private static ProductController instance;

	/* data members */
	private HashMap<String,Product> productData;

	
	private ProductController()
	{
		productData = new HashMap<String, Product>();
		if (DEMO_FLAG) {
			createDemoData(productData);
		}
	}
	
	private static void createDemoData(HashMap demoData) {
		demoData.put("banana", new Product("banana"));
		demoData.put("milk", new Product("milk"));
		demoData.put("juice", new Product("juice"));
		demoData.put("cheese", new Product("cheese"));
		demoData.put("chicken", new Product("chicken"));
		demoData.put("tofu", new Product("tofu"));

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

	/**
	 *
	 * @return
     */
	public LinkedList<String> getAllProducts() {
		LinkedList<String> result = new LinkedList<>();
        result.addAll(productData.keySet());
		return result;
	}
}
