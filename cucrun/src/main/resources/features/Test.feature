@Linkedin
Feature: Linkedin website 

@tc01
Scenario: 
Login 
	
	Given the user launched the chrome browser 
	When the user click signin 
	Then verify username and password 
	And click the submit button 
	
	
	
@tc02 
Scenario: 
sign

	Given launch an chrome browser 
	When the user clicks join me
	Then enters values in field
	And click the join button 
	