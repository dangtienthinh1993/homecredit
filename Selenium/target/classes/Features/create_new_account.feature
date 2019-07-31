Feature: Create new account feature

Scenario: Verify able to create new account

Given user launch chrome browser to login page
Given user enter username
Given user enter password
Given user click on login button
When user click on new customer
When user enter new customer information
When user click on submit button new customer page
When user click on new account
Then new account page displays
When user enter new account information
When user click on submit button new account page
Then account generated successfully page displays
Then close browser