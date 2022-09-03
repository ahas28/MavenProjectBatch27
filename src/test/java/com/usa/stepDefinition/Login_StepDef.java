package com.usa.stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.us.base.SuperClass;

import io.cucumber.java.en.*;

public class Login_StepDef extends SuperClass{
	
 
	
	@Given("^User able to open any browsers\\.$")
	public void user_able_to_open_any_browsers() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./SeleniumDrivers/chromedriver.exe");
	    driver = new ChromeDriver(); //Up casting
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.shoprite.com/sm/planning/rsid/218/");
		 
	    
	    
	}

	@Given("^User able enter the https://www\\.shoprite\\.com/sm/planning/rsid/(\\d+)/$")
	public void user_able_enter_the_https_www_shoprite_com_sm_planning_rsid(int arg1) {
		
	    
	}

	@When("^user able to click sign in button$")
	public void user_able_to_click_sign_in_button() {
	    
	    
	}

	@When("^User able to enter username  <username>$")
	public void user_able_to_enter_username_username() {
	    
	    
	}

	@When("^User able to enter  SmartTech(\\d+)\\$\\$$")
	public void user_able_to_enter_SmartTech_$$(int arg1) {
	    
	    
	}

	@When("^User able to login in button$")
	public void user_able_to_login_in_button() {
	    
	    
	}

	@Then("^User able to verify the user information on the UI$")
	public void user_able_to_verify_the_user_information_on_the_UI() {
	    
	    
	}

	@When("^User able to enter  SmartTech(\\d+)\\$$")
	public void user_able_to_enter_SmartTech_$(int arg1) {
	    
	    
	}

	@Given("^User able enter the <URL>$")
	public void user_able_enter_the_URL() {
	    
	    
	}

	@When("^User able to enter  <password>$")
	public void user_able_to_enter_password() {
	    
	    
	}

	@Given("^User able enter the$")
	public void user_able_enter_the() {
	    
	    
	}

	@When("^User able to enter username$")
	public void user_able_to_enter_username() {
	    
	    
	}

	





}
