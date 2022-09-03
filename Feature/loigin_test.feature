Feature: User able to Login and Logout from ShopRite Application #MyPlan

Discription: "User now able to login in and logout from ShopRite application with valid credentials" #This is the goal

@smokeTest
@sanityTest
@RegresssionTest
Scenario: User able to login in to shoprite application with valid username.

	Given User able to open any browsers.
	And User able enter the url on the browser
	When user able to click sign in button
	And  User able to enter username  
	And  User able to enter password
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	
	
@NegativeTest
@sanityTest
@RegresssionTest
Scenario: User unable to login in to shoprite application with valid username.

	Given User able to open any browsers.
	And  User able enter the 
	When user able to click sign in button
	And  User able to enter username 
	And  User able to enter password
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	


