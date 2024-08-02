Feature: Log out

  Background:
    Given the user is one the Demoblaze login page
    When the user enters valid credentials
    And the user submits the login form
    Then the user should be logged in successfully

  Scenario: User logs out
    Given the user is logged in
    When the user clicks on the logout button
    Then the user should be logged out successfully