package domain;

import java.util.List;

public class BusinessController implements IBusinessController{
	
	private List<Business> businessData;
	private static BusinessController instance;
	
	private BusinessController()
	{
		createData();
	}
	

	public static BusinessController getInstance()
	{
		if(instance == null)
		{
			instance = new BusinessController();
		}
		return instance;
	}
	
	private void createData() {
		// TODO Auto-generated method stub
		
	}
	
}
