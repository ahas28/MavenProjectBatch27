package GroupStudyBatch27;

public class MethodTestVehicle {
	
	public static void main(String[] args) { // main method
		MethodTestVehicle.logo();
		MethodTestVehicle obj = new MethodTestVehicle();
		System.out.println(" and it's " + obj.years() + " years old. "); 
		System.out.println(" Rim and tire size is " + obj.Tire() + " inches ");
		System.out.println(" The " + obj.black() + " stands for Black. ");
	}
	
	
	public int years() {  //return int method, non-void method
	return 7;
	
	}
	
	public String cars() { //return car names not numbers, non- void method
	return "Models";	
		
	}
	
     static void logo() { // non-return method
    	 String logo = "Honda.";
    	 System.out.println(" My Car is " + logo);
     }
	
   // void int tire size

	
	public boolean cars2() { //boolean true or false
		return false;
	}
	 
	public static double Tire() {  //double return with decimals 
		return 21.0;
	}
	
	public static char black() { //char return letter B for black.
		return 'B';
		
	}
	
	 
	  {
		
	}
		 
	
		
	}
	


