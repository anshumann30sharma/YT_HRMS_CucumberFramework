#Author: your.email@your.domain.com
Feature: Login
#Scenario Outline:
#When user enters valid "<John>" and "<Mahady123>"
#And user click on login button
#Then "<FirstName>" is successfully logged in
#Examples:
#	|UserName| Password     |FirstName |
#	| Mahady    | Mahady123!|John         |          
#	| abd77       | Syntax123   |Abdullah   |   
#	 
	Scenario Outline: Error message validation while invalid login  
	When user enters valid"<username>"and "<Password>"
	And user click on login button
	Then user see "<error message >"             
	When I enter invalid username and password and see error message
   | UserName | Password  | ErrorMessage                      |
   | Admin       | Admin123 | Invalid Credentials               |
   | Hello          | Syntax123!| Invalid Credentials               |
   |                   |                   |   Password cannot be empty|  
   |Admin        |Syntax123!  |   Username cannot be empty|