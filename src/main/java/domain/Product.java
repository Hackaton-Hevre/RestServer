package domain;

public class Product {

	private Tag tag;
	private String name;
	private boolean active;
	
	public Product( String inName )
	{
		//tag = inTag;
		name = inName;
		setActive(true);
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
