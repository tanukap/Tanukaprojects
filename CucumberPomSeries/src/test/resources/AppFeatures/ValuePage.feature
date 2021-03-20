Feature: Value page feature

Scenario: To count the values on the screen
Given user is on values page
When user counts the values on the screen
Then right count of values should appear on the screen

Scenario: To verify the values on the screen is greater than zero
Given user is on values page
When  user verifies the values on the screen
Then  values should be greater than zero on the screen

Scenario: To verify the correct total balance
Given user is on values page
When  user verifies the listed values on the screen with total balance
Then  values should be correct based on the listed values with the total balance on the screen

Scenario: To verify the format of values as currencies
Given user is on values page
When  user verifies the format of the value
Then  values should have format as currency

Scenario: To verify the total balance with sum of the value
Given user is on values page
When  user verifies the total balance with the sum of the values
Then  total balance should match the sum of all the values