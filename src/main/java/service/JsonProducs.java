package service;

import java.util.LinkedList;

public class JsonProducs {

	public String[] products;
	
	public JsonProducs(LinkedList<String> list)
	{
		products = new String[list.size()];
		for (int i=0; i< list.size(); i++)
		{
			products[i] = list.get(i);
		}
	}
}
