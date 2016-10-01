package domain;

public class User {
	
	private String UserName;
	private String Password;
	private String Email;
	
	public User (String UserName, String Password, String Email){
		
		this.setUserName(UserName);
		this.setPassword(Password);
		this.setEmail(Email);
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

}
