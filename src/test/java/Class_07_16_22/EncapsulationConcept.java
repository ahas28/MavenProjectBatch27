package Class_07_16_22;

public class EncapsulationConcept {
	
	
	//Need the access modifier as private
	private String courseName = "Automation engineer (SDET)";
	
	private int courseName = 4000;
	
	
	//need to create Return Method to access the variable in other class
	public String getCourseName() {
		
	}
	
	public int getCourseFee() {
		return courseFee;
	}
	
	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
	System.out.println(obj.courseName());
	System.out.println(obj.courseName());
	}

}
