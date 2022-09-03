package Selenium_Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CVS_Xpath_Login_Function {
	
	public static void main(String[] args) throws InterruptedException {
		//main method
	
	System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
	//driver path
	
	WebDriver driver = new ChromeDriver(); //Up casting
	//driver interface
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("incognito");
  //  chrome options
    
    Thread.sleep(3000);
    
	driver.navigate().to("https://www.cvs.com/?icid=cvsheader:cvslogo");
	//driver URL
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	Thread.sleep(4000);
	//wait statement
	
	driver.findElement(By.id("signInBtn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("emailField")).sendKeys("loganbond977@yahoo.com");
	
	driver.findElement(By.xpath("//*[@class='continue-button primary']")).click();
	}

}
