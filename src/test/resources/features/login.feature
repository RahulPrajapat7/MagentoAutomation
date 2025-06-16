Feature: Login to Magento Website

  Scenario: User logs in with valid credentials
    Given User navigates to login page
    When User enters valid email and password
    And User clicks on sign in button
    Then User should be logged in successfully
