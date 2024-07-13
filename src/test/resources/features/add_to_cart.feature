Feature: Add product to cart

  Scenario: User adds a Samsung galaxy s6 to the cart
    Given the user is on the DemoBlaze home page
    When the user navigates to the Samsung galaxy s6 product page
    And the user adds the product to the cart
    Then the product should be added to the cart successfully
