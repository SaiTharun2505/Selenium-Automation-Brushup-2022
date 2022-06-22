package j.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Base_Page_Hashmap 
{
	public void hashmap_method()
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();	
		
		hm.put(101, "Sai Tharun");
		hm.put(102, "Shriamsh");
		hm.put(103, "Rahul");
		hm.put(104, "Bhargav");
		hm.put(105, "Mahesh");
		
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey());
			
			System.out.println(m.getValue());
			
			
			
		}
	}

}
