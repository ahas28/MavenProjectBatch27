package J_ProgramCollections;

public class JavaForLoop_WhileLoop {
	
	
	public void basicLoop() {
		
	int num = 8;
	for(int i = 0; i < num; i++);{
	
	 System.out.println(i);
	
	 
	}
	}
	
	public void whileLoop() {
		while(true) {  //infinite amount of loop
			System.out.println("I drive lexus");
		
			
		}	
	}
	


	public void advanceLoop() {
		String []  vehicles = {"Honda","Lexus","Ford","Chevy","Kia"};
		for(String getVehicles : vehicles) {
			System.out.println(getVehicles);
		}	
		}
		public static void main(String[] args) {
			JavaForLoop_WhileLoop obj = new JavaForLoop_WhileLoop();
			obj.advanceLoop();
			//obj.whileLoop();
			
	}

}
