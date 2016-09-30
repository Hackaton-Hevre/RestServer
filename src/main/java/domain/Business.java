package domain;

import java.util.List;


public class Business {
	
	private String name;
	private List<Tag> tags;
	private Location location;
	public String getName() {
		return name;
	}
	
	public Business(String inName, List<Tag> inTags, Location inLocation)
	{
		name = inName;
		tags = inTags;
		location = inLocation;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	

}
