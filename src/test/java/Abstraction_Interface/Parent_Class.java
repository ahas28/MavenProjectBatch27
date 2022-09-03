package Abstraction_Interface;

 

public class Parent_Class extends My_First_Abstraction{

	@Override
	public void myNewCar1() {
		 System.out.println("my new car is 2015");
		
	}
	public static void main(String[] args) {
		
	//	My_First_Abstraction = new My_First_Abstraction();
		
	//	 System.out.println("myNewCar + myNewCar1");
		 
		 Parent_Class obj = new Parent_Class();
		 obj.myNewCar();
		 
		// obj.myNewCar1(); 
	}
	
	

}
