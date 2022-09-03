package XpathProjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAut_Automation {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
	
		 driver.get("http://ww12.demoaut.com/");

		WebElement myframe = driver.findElement(By.xpath("//iframe"));
       
		driver.switchTo().frame(myframe);
		
		    Thread.sleep(8000);
		    
		driver.findElement(By.id("e3")).click();
		
		driver.quit();
		
		
		
		 JOptionPane.showMessageDialog(null,"This was Easy");
		 System.out.println(" ha-ha this was easy :) + (Test case 2)");
		 
		  
	}
}   
