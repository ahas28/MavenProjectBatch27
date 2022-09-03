package Selenium_Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginFunction {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver is an interface
		//driver is the instance of the WebDriver
		//new is a keyword from java
		//ChromeDriver is a class
		
		
		System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
		//Chrome Driver
		
		//System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/msedgedriver1.exe");
		//Edge Driver
		
		WebDriver driver = new ChromeDriver(); //Up casting
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        
        Thread.sleep(3000);
        
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("q")).sendKeys("Ps3");
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(2000);
		
		String myText = driver.findElement(By.id("result-stats")).getText();
		 System.out.println("My result for ps3 is " + myText);
		 
		 driver.quit();
		 
		
		 
	}

}
 