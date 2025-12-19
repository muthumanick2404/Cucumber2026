@Login
Feature: Validate login functionality in sauce labs app

Scenario Outline: login with valid creds
Given User is on the sauce labs login page
When User enters "<userName>" and "<password>" and clicks on login
Then HomePage screen should be displayed

Examples: 
|userName|password|
|kingmaker2404@gmail.com|Muthu$24049|
