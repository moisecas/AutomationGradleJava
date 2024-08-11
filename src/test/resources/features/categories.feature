Feature: Choice categories

  Background:
    Given the user is one the Demoblaze login page
    When the user enters valid credentials
    And the user submits the login form
    Then the user should be logged in successfully

  Scenario: Visit categories
    When I click on the "Laptops" category
    Then I should see the laptops in the product list
    When I click on the "Monitors" category
    Then I should see the monitors in the product list