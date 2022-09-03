package Selenium_Login_Test;

public class OverLoadingTest {
	
	 public void getApple() {
		System.out.println("RED");
	 }
	 
	 public void getStrawBerry(int size) {
		// System.out.println("Crimson");
	 }
	 
	 public void getCherry() {
		 System.out.println("Deep RED");
	 }
	 
	  public void getorange(String Orange) {
		  System.out.println("Classic orange");
	  }
	  
	  public static void main(String[] args) {
		
	  OverLoadingTest obj = new OverLoadingTest();
	        obj.getApple();
	        obj.getCherry();
	  }
}


	 