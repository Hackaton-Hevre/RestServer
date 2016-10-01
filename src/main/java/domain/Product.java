package domain;

public class Product {

	private Tag tag;
	private String name;
	
	public Product( String inName )
	{
		//tag = inTag;
		name = inName;
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
}
