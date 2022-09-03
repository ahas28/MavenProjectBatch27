package J_ProgramCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListPractice {
	
	public static void main(String[] args) {
	
		
		
		String [] Resturants = {"Mcdonalds","KFC","Burger King","5 Guys"};
		
		int [] number = {70,80,90,200,300,231};
		
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		for(int i = 0; i <  Resturants.length; i++) {
			System.out.println(Resturants[i]);
		}
		
		ArrayListPractice.INeedTheMaxMinNumber();
		ArrayListPractice.INeedTheMaxMinNumber();
		ArrayListPractice.EliminateDuplicateNumber();
		ArrayListPractice.getMyDefinationfromArrayLists();
		ArrayListPractice.OrganizeTheValue();
		ArrayListPractice.splitTheMessage();
		ArrayListPractice.InspectVectorTest();
		ArrayListPractice.InpectLinkList();

	}
	public static void ArrayListDef() {
	List obj = new ArrayList();
	obj.add(90);
	obj.add("KFC");
	
	ArrayList obj1 = new ArrayList();
	List<Integer> number = new ArrayList<Integer>();
	obj.add(10);
	obj.add("KFC");
	List<String> names = new ArrayList<String>();
	
	}
	
	public static void getMyDefinationfromArrayLists() {
		List<Integer> number = new ArrayList<Integer>();
		number.add(101);
		number.add(102);
		number.add(103);
		number.add(104);
		number.add(105);
		number.add(1);
		number.add(null);
		number.add(null);
		
		for(int i = 0; i<number.size(); i++);
		System.out.println(number.get(4));
	//	ArrayListPractice.printOutValueFromArrayList();
	}
	 public static void INeedTheMaxMinNumber() {
		 List<Integer> number = new ArrayList<Integer>();
		 
		    number.add(114);
			number.add(122);
			number.add(133);
			number.add(114);
			number.add(145);
			
			int max = Collections.max(number);
			System.out.println(" My max number is " + max);
			
			int min = Collections.min(number);
			System.out.println(" My min number is " + min);
			
	 }

	 
	 public static void EliminateDuplicateNumber() {
	 List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(114,122,133,114,145));
	 List<Integer>duplicate = numbers.stream().distinct().collect(Collectors.toList());
	 System.out.println(duplicate);
	 }
	 
	 public static void OrganizeTheValue() {
		 List<String> ClothesBrands = new ArrayList<>();
		 ClothesBrands.add("Gap");
		 ClothesBrands.add("Forever 21");
		 ClothesBrands.add("Macy");
		 ClothesBrands.add("Nike");
		 ClothesBrands.add("Addidas");
		 
		 Collections.sort(ClothesBrands);
		 for(String newClothesBrands :ClothesBrands);
		 System.out.println(ClothesBrands);
	 }
         public static void splitTheMessage() {
        	 String Auto = "2015 Honda Accord V6";
        	 String []words = Auto.split(" ", 4); 
        	 for(String newWords :words)
        	 System.out.println(newWords);
	
}
         
         public static void InspectVectorTest() {
        	 //Vector is synchronize/slower compared to arrayList takes too much data.
        	 Vector<Integer>obj = new Vector<>();
        	 obj.add(45);
        	 obj.add(90);
        	 obj.add(135);
        	 obj.add(225);
        	 obj.add(450);
         }
         
         public static void InpectLinkList() {
        	 LinkedList<String> ClothesBrands = new LinkedList<>();
    		 ClothesBrands.add("Gap");
    		 ClothesBrands.add("Forever 21");
    		 ClothesBrands.add("Macy");
    		 ClothesBrands.add("Nike");
    		 ClothesBrands.add("Addidas");
    		 ClothesBrands.add("A");
    		 ClothesBrands.add("B");
    		 ClothesBrands.add("C");
         }
	
	}
	
