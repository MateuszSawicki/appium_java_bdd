Feature: Purchase
  Scenario: User purchases the product
    Given the user is logged in
    When the user adds the product to the shopping cart
    And the user opens the shopping cart
    Then the added product is displayed
