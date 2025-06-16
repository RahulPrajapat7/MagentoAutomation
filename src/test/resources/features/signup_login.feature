Feature: Sign up and Login on Magento Website

  Scenario: User signs up with a new account
    Given User launches the Magento signup page
    When User enters first name, last name, email and password
    And User clicks on create an account
    Then User account should be created successfully

  Scenario: User logs in with created account
    Given User navigates to login page
    When User enters email and password
    And User clicks on sign in button
    Then User should be logged in successfully
