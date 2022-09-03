package Selenium_Login_Test;

public class MethodOverRidding2 extends MethodOverRidding1{

	public static void main(String[] args) {
		
		MethodOverRidding2 obj = new MethodOverRidding2();
		obj.getApple();
		obj.getCitiBank();
		obj.getVerizon();
		obj.getWellsFargo();
		obj.getSmartTech();
		//obj.getSmartTech1();
	}
	
	
	public void getSmartTech() {
		System.out.println("Smart tech is great school");
	}
	
	public void getWellsFargo() {
		System.out.println("I need home Mortgage");
	}
}
