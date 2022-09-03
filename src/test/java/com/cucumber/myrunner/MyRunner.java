package com.cucumber.myrunner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		//help of the plugin we are creating the report like Jason, HTML
		//format = {"pretty","json:target/cucumber.json"},
		plugin = {"pretty","json:target/cucumber.json"},
		features = "./Feature",
		glue = "com.usa.stepDefinition",
		tags = "@smokeTest",
		//dryRun = true 
		monochrome = true
		)

public class MyRunner extends AbstractTestNGCucumberTests {
	
	@Before
	public void setUp() {
		//open browser
		//maximize the browser
		//delete all cookies
		//implicit wait
		//enter url
		
	}
	
	@After
	
	public void tesrDown() {

	}
}
