package domain;

import java.util.List;

public class ProductController implements IProductController{
	
	private List<Product> productData;
	private static ProductController instance;
	
	private ProductController()
	{
		createData();
	}
	

	public static ProductController getInstance()
	{
		if(instance == null)
		{
			instance = new ProductController();
		}
		return instance;
	}
	
	private void createData() {
		// TODO Auto-generated method stub
		
	}
	
}
