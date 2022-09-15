Feature: Life of a software tester and his boss
@smoke @All @good
Scenario: I am a good software tester and my boss loves me
Given I am a "good" software tester
When I go to work
And I "involve9" with it
Then My boss "loves##" me
@All @average
Scenario: I am a average software tester and my boss forgives me
Given I am a "average" software tester
When I go to work
And I "work4" with it
Then My boss "forgives%%" me
@All @bad @ignore
Scenario: I am a bad software tester and my boss hates me
Given I am a "bad" software tester
When I go to work
And I "mess" with it
Then My boss "hates##" me
