#Feature: Login to the omayo application 

#Scenario Outline: User should only be able to login with valid credentials
#Given I navigate to the omayo website
#When I enter Username as "<username>" and Password as "<password>" into the fields
#And I click on Login button 
#Then User should login based on expected "<loginstatus>" status
#Examples:
#|username		|password	|loginstatus	|
#|arun    		|pswd1    	|failure   	|
#|SeleniumByArun	|Test143$	|success	|
#|motoori		|pswd2		|failure 		|

Feature: Login to the omayo application
@All @Tut
Scenario Outline: User should only be able to login with valid credentials
Given I navigate to the tutorial website
When I enter Username as "<someusername>" and Password as "<somepassword>" into the fields
And I click on Login button
Then User should login based on expected "<loginstatus>" status
Examples:
|someusername   |somepassword  |loginstatus|
|sss@gmail.com  |123           |failure    |
|muz01@gmail.com|123@456       |success    |
|lll@gmail.com  |456           |failure    |