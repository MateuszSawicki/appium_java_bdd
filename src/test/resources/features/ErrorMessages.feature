Feature: Error messages
  Scenario: User validates error messages
    When user tries to login with username field empty
    Then error message is displayed

