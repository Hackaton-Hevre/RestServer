package domain;

import java.util.LinkedList;

public class User {
	
	private String UserName;
	private String Password;
	private String Email;
	private LinkedList<ActualProduct> products;
	
	
	public User (String UserName, String Password, String Email){
		
		this.setUserName(UserName);
		this.setPassword(Password);
		this.setEmail(Email);
		products = new LinkedList<ActualProduct>();
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public int AddActProdToList(Product p)
	{
		ActualProduct act = new ActualProduct(p, true);
		try
		{
			if (products.contains(new ActualProduct(p, true)))
			{
				return 0;
			}
			this.products.add(act);
			return 1;
		}
		catch (Exception e)
		{
			return 0;
		}
	}
	
	public LinkedList<ActualProduct> getProductList(){
		return products;
	}

}
