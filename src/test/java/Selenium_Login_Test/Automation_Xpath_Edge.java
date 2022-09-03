package Selenium_Login_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation_Xpath_Edge {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.edge.driver","./SeleniumDrivers/msedgedriver1.exe");
	
	WebDriver driver = new EdgeDriver();
	
	
	driver.navigate().to("https://phptravels.com/demo/");
	//driver URL
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	
	
	}
}
