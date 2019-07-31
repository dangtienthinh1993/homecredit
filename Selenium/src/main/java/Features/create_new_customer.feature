Feature: Create new customer feature

Scenario: Verify able to create new customer

Given user launch chrome browser to login page
Given user enter username
Given user enter password
Given user click on login button
When user click on new customer
Then new customer page displays
When user enter new customer information
When user click on submit button new customer page
Then customer registered page displays
Then close browser