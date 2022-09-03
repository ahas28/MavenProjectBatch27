package InterviewCodePractice;

import java.util.Arrays;
import java.util.Collections;

public class StringReverse {
	public static void main(String[] args) {
		
	
	
	String[] num = {"Five","Ten","Twelve","Fifty"};
	Collections.reverse(Arrays.asList(num));
//	System.out.println(Arrays.toString(num));
	//Reversing String

	
	String words ="Standard Notation";
    String rev = new StringBuffer(words).reverse().toString();
//	System.out.println(rev);
	//Reversing word
	
	String name = "Infosys", rev1="";
	for(int i=name.length()-1;i>=0;i--) {
		rev1=rev1+(name.charAt(i));
		//Doing string reverse with Infosys
		
	}
	
	System.out.println(rev1);
	//Doing string reverse with Infosys
	}
}
