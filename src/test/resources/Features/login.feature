Feature: Login
  Scenario: Login as registered user
    Given I visit the login page
    When I fill the form with "username" and "password"
    Then Username should appear in the left panel