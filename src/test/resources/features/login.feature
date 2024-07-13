Feature: User login

  Scenario: Succesful login while using valid credentials
    Given the user is one the Demoblaze login page
    When the user enters valid credentials
    And the user submits the login form
    Then the user should be logged in successfully