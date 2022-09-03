package XpathProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

public class Xpath_Test_Automation {
	public static void main(String[] args) throws InterruptedException {
		//main method
	
	System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
	//driver path
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    DesiredCapabilities cap = new DesiredCapabilities ();
    cap.setCapability(ChromeOptions.CAPABILITY, options);
    options.merge(cap);
    // chrome options for incognito/private mode
    
    WebDriver driver = new ChromeDriver(options); //Up casting
    //driver interface
    
    Thread.sleep(3000);
    
	driver.navigate().to("https://www.bestbuy.com/");
	//driver URL
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	driver.getTitle(); 
    System.out.println(" This is my Page title : " + driver.getTitle() + " : And this is laptop I Need. ");
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//*[@class='v-p-right-xxs line-clamp']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@class='c-button c-button-secondary c-button-sm sign-in-btn']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//*[@class='tb-input '])[1]")).sendKeys("loganbond977@yahoo.com");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//*[@class='tb-input '])[2]")).sendKeys("SmartTech21$$");
	
	Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//button[contains(@class,'c-button')])[1]")).click();
	 
	Thread.sleep(2000);
	 

	String myText = driver.findElement(By.xpath("(//*[@class='popular-picks-item-title clamp lines-2'])[1]")).getText();
	System.out.println("I need this laptop for Smart tech" + myText);
		
	Thread.sleep(2000);
		
	driver.findElement(By.xpath("(//*[@class='v-p-top-xxs'])[3]")).click();
	
	Thread.sleep(2000);
	 
	driver.findElement(By.xpath("//*[@id='logout-button']")).click();
	
	driver.quit();
     
	Thread.sleep(1000);
	
	//From here it will open a new browser
	WebDriver driver1 = new ChromeDriver(options); //Up casting
  
    Thread.sleep(3000);
    
	driver1.navigate().to("https://www.amazon.com/");

	driver1.manage().window().maximize();
	
	driver1.quit();
	
	 
	}
}
