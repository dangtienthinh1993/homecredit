Feature: Deposit feature

Scenario: Verify able to deposit with new account

Given user launch chrome browser to login page
Given user enter username
Given user enter password
Given user click on login button
When user click on new customer
When user enter new customer information
When user click on submit button new customer page
When user click on new account
When user enter new account information
When user click on submit button new account page
When user click on deposit
Then deposit page displays
When user enter deposit information
When user click on submit button deposit page
Then deposit successfully table displays
Then close browser