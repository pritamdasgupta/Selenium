Feature: Test the login functionality on PhpTravels website

Scenario: The user should be able to login providing correct Username and correct password
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation message


Scenario Outline: the user should login
Given user is on the login page
When user enters correct email<username> 
And user enters password<password>
And user clicks login button
Then user gets confirmation message

Examples:

| username | password|
| Phptravels@gmail.com | Password12# |
| Phptravels@yahoo.in | Password123# |
| Phptravels@hotmail.com | Password1234# |