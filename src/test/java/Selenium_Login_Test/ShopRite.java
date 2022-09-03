package Selenium_Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ShopRite {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
	//driver path
	
    WebDriver driver = new ChromeDriver(); //Up casting
    //driver interface
    
    Thread.sleep(3000);
    
	driver.navigate().to("https://www.shoprite.com/sm/planning/rsid/218/");
	//driver URL
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	driver.getTitle(); 
    System.out.println(" Page title is : " + driver.getTitle());
	
	Thread.sleep(4000);
	//wait statement
	
	driver.findElement(By.xpath("//*[@class='HeaderSubtitle--5xucaa gQDiRY']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("loganbond977@yahoo.com");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SmartTech21$");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@class='mwg-signin-button signInButton']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//*[@class='IconLoader--50gbdb cRgtNZ'])[3]")).click();
		
	 Thread.sleep(1000);
		
	// driver.findElement(By.xpath("//*[@class= 'ButtonLink--1caejb dxtAyt OptionButton--14sr6uk cffyZC']")).click();
	 
	 //driver.quit();
	 
	 String actual ="ShopRite";
	 Assert.assertEquals(actual,driver.getTitle());
	 driver.findElement(By.xpath("//*[@class= 'ButtonLink--1caejb dxtAyt OptionButton--14sr6uk cffyZC']")).click();
	 System.out.println(" my expected results is " + driver.getTitle());
	 
	 
	 driver.quit();
	 
	}
	
}


