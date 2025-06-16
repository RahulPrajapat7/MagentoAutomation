Feature: Sign up and Login on Magento Website

  @signup
  Scenario: User signs up with a new account
    Given User launches the Magento signup page
    When User enters first name, last name, email and password
    And User clicks on create an account
    Then User account should be created successfully


