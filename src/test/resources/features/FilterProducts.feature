Feature: Filter products
  Scenario: User validates error messages
    Given the user is logged in
    When the user filter the products by name
    Then the products are displayed filtered by the name


