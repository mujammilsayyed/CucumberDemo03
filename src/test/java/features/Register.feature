#Scenario: Register an account with valid details
#	Given User navigates to Registration page
#When User provies the following details into the input fields
#|firstName|arun											|
#|lastName |motoori									|
#|email		|arun.motoori@yahoo.co.in	|
#|phone		|12345678									|
#|password	|SeleniumTester$					|
#And Selects the privacy policy option
#And Clicks on Continue button
#Then User should get successfully registered
@Register
Feature: Registratio Tests
Scenario: Register an account with valid details
Given User nanigates to Registration page
When User provies the following details into the input fields
|firstName|muzammil|
|lastName|sayyed|
|email|muz09@gmail.com|
|Phone|123456789|
|password|123@456|
And Selects the privacy policy option
