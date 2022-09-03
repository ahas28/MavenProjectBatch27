package JavaArrays;

import java.util.Arrays;

public class ArrayClass {
	static String names;
	
  
	public static void getNames() {

	 names = "Honda";
	 names = "Acura";
	 names = "Mercedes";
	 names = "Lexus";
	 names = "Ford";
	 System.out.println(names);
	  
}
	public static void main(String[] args) {
	String names [] = {"Honda","Acura","Mercedes","Lexus","Ford"};
	for(String value : names)
	System.out.println(value);
	
	System.out.println(Arrays.toString(names));
	System.out.println(names[0]);
	
	String dataSet[][] = {{"Honda","Acura","Mercedes","Lexus","Ford"},
	                      {"Honda1","Acura1","Mercedes1","Lexus1","Ford1"}};
	
	System.out.println(dataSet[0]);
	}
	}
	

	
	
