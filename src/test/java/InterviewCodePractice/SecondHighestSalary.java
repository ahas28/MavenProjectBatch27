package InterviewCodePractice;

import java.util.Arrays;

public class SecondHighestSalary {
	
	public static void main(String[] args) {
		
	
	int [] HorsePower = {456,654,345,987,564,1001};
	int size = HorsePower.length;
	
	 Arrays.sort(HorsePower);
	 int secondNum = HorsePower[size-2];
	 System.out.println(secondNum);
	 // how to find second Highest number 
	 
	}		 

}
