@Customer
Feature: Customer Login Functionality
  Description:
  As a customer
  I want to Login as customer
  So that I can see customer home page


  Scenario: Verify Customer Login Functionality
    Given I am in the landing page
    Then I click on the login menue
    Then I click on the customer login menue
    Then I enter user id
    Then I enter user password
    When I click on login button
    Then verify I am in the customer home page


