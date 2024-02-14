Feature: navigation bar
  To see the subpages
  Without logging in
  I can click the navigation bar links

  Scenario: I can acces
    Given I navigate from https://www.demoblaze.com/
    When I try to acces the sections
    Then I am redictered to the page
