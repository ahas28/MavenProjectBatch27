package Selenium_Login_Test;

public class MethodOverLoading {

	MethodOverLoading(int age){
		System.out.println("Special Method");
	}
	  
	MethodOverLoading(String name){
		System.out.println("Many different constructor");	
		}
	
	MethodOverLoading(){
		System.out.println("New Method");
	}
	
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading(5);
		
		
		MethodOverLoading obj1 = new MethodOverLoading("super");
		
		MethodOverLoading obj2 = new MethodOverLoading();
	}
	
}
