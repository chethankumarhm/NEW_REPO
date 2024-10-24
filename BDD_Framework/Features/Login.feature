Feature: Login

Background: Prequisite steps
Given open browser
When navigate to "https://www.facebook.com/" url
 
@Smoke 
Scenario Outline:
 Then enter "<username>" username and "<password>" in password field
 
Examples:
|username|password|
|chethan|chethu123|
|manoj|manoj123|



@Regression
Scenario Outline:
 Then enter "<username>" username and "<password>" in password field
 
Examples:
|username|password|
|Darshan|darshan123|
|Sudeep|sudeep123|