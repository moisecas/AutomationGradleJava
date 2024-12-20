Feature: Shopping at San Angel
  As a user
  I want to add products to the shopping cart
  So that I can complete my purchase

  Scenario: Add 2 products with specific quantities to the shopping cart
    Given the user is on the San Angel homepage
    When the user selects the product "arreglo floral versalles medellin flores variadas"
    And the user clicks twice on the quantity button for the first product
    And the user clicks "Add to cart"
    And the user navigates back to the homepage
    And the user selects the product "cilindro con 24 rosas medellin"
    And the user clicks five times on the quantity button for the second product
    And the user clicks "Submit"
    Then the products should be added to the shopping cart successfully
