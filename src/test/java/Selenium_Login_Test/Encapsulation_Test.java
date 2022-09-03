package Selenium_Login_Test;

public class Encapsulation_Test {
	
	private int Age = 25;
	
    private static String school = "SamrtTech";

    
    public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Encapsulation_Test.school = school;
	}

    
    public void SmartTechscool(){
    	
    	
    }
    public static void main(String[] args) {
    	
    	Encapsulation_Test obj = new Encapsulation_Test();
    	System.out.println(" My new school " + obj.school);
    	System.out.println(" my age is " + obj.Age);
    }
}
