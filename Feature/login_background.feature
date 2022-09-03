Feature: User able to Login and Logout from ShopRite Application #MyPlan
Discription: "User now able to login in and logout from ShopRite application with valid credentials" #This is the goal

Background:
	 
	Given User able to open any browsers.
	And  User able enter the <URL>
	When user able to click sign in button
	And  User able to enter username  <username>
	And  User able to enter  <password>
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	
@smokeTest
@sanityTest
@RegresssionTest
@BoundaryTest
Scenario: User able to login in to shoprite application with valid username.

	Given User able to open any browsers.
	And  User able enter the <URL>
	When user able to click sign in button
	And  User able to enter username  <username>
	And  User able to enter password <password>
	And  User able to login in button
	Then User able to verify the user information on the UI
	
Scenario: User able to buy in to shoprite application with valid username.

	Given User able to open any browsers.
	And  User able enter the <URL>
	When user able to click sign in button
	And  User able to enter username  <username>
	And  User able to enter password <password>
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	Scenario: User able to return in to shoprite application with valid username.

	Given User able to open any browsers.
	And  User able enter the <URL>
	When user able to click sign in button
	And  User able to enter username  <username>
	And  User able to enter password <password>
	And  User able to login in button
	Then User able to verify the user information on the UI
	
	
	
	
	
	
	
		
	
	