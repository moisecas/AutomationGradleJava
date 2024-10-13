Feature: Confirm Navigation to DemoQA

  Scenario: Usernavigates to DemoQA homepage
    Given the user navigates to the DemoQA homepage
    Then the page title should be "ToolsQA"
    And  the URL should contain "demoqa.com"
