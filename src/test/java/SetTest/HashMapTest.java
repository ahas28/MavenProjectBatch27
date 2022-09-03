package SetTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	
	//map is an interface which implement many classes
	//example HashMap, LinkedhashMap, Tree Map and more
	//map store values by key and values pair
	//map key will be unique and only one null value.
	//map value could be duplicate and as many as null values
	//for printing the map we need  to use inside the loop instead of data types
	//we have to use entry class and help of the map instance
	//we can call the entrySet()method
	//print out the key by instance then getKey() method
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "Iphone");
		map.put(2, "Samsung");
		map.put(3, "Google");
		map.put(4, "Iphone13");
		map.put(5, "Android");
		map.put(8, "Apple");
		map.put(11, null);
		
		for(Entry<Integer,String> info :map.entrySet()) {
			
//			System.out.println(info.getKey() +" "+ info.getValue());
			   for ( Integer s: map.keySet()) {
				   
				   if(s.equals("2")) {
				   System.out.println(s+"===>"+map.get(s));
			   
				   }   
			   }
			   }
			   }
		
	
}
