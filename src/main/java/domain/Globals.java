package domain;

public class Globals {
	
	private static int nextProductId = 0;
	
	
	public static int getNextProductId()
	{
		nextProductId = nextProductId  +1;
		return nextProductId;
		
	}

}
