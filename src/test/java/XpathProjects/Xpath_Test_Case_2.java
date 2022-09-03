package XpathProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Xpath_Test_Case_2 {
	

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
    
	driver.navigate().to("https://www.saveritemedical.com/");
	//driver URL
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	driver.getTitle(); 
    System.out.println(" Page title is : " + driver.getTitle());
	
	Thread.sleep(4000);
	//wait statement
	
	driver.findElement(By.xpath("(//*[@class='icon-state__primary'])[2]")).click();
	
	}

}
