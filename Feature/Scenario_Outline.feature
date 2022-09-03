Feature: User able to Login and Logout from ShopRite Application #MyPlan
Discription: "User now able to login in and logout from ShopRite application with valid credentials" #This is the goal

@smokeTest
@sanityTest
@RegresssionTest
@BoundaryTest
Scenario Outline: User able to login in to shoprite application with valid username. 
User unable to login the application with more more than 9 chracters

	Given User able to open any browsers.
	And  User able enter the <URL>
	When user able to click sign in button
	And  User able to enter username  <username>
	And  User able to enter password <password>
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	 Examples:
	
	|URL                                                  |userName              |password|
	|https://www.shoprite.com/sm/planning/rsid/218/		  |loganbond977@yahoo.com|SmartTech21$$|
	|https://www.shoprite.com/sm/planning/rsid/218/		  |loganbond977@yahoo.com|SmartTech21$|
	|https://www.shoprite.com/sm/planning/rsid/218/		  |loganbond977@yahoo.com|SmartTech21$|
	|https://www.shoprite.com/sm/planning/rsid/218/		  |loganbond977@yahoo.com|SmartTech21$|
	|https://www.shoprite.com/sm/planning/rsid/218/		  |loganbond877@yahoo.com|SmartTech21$|