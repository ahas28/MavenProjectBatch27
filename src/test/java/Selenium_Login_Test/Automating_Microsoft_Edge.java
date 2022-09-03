package Selenium_Login_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 

public class Automating_Microsoft_Edge {
	
	//WebDriver is an interface
			//driver is the instance of the WebDriver
			//new is a keyword from java
			//EdgeDriver is a class
			
			public static void main(String[] args) throws InterruptedException {
				
			
			System.setProperty("webdriver.edge.driver","./SeleniumDrivers/msedgedriver1.exe");
			
			WebDriver driver = new EdgeDriver();
	        
	  
	        
			driver.get("https://www.gamestop.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(8000);
			driver.quit();
			
			}

}
