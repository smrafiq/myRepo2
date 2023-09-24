@Employee
Feature: Employee Login Functionality
  Description:
  As a employee
  I want to Login as employee
  So that I can see employee home page


  Scenario: Verify Employee Login Functionality
    Given I am in the landing page
    Then I click on the login menue
    Then I click on the employee login menue
    Then I enter employee user id
    Then I enter employee user password
    When I click on employee login button
    Then verify I am in the employee home page
