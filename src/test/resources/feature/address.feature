Feature: Address
  Background:
    Given I visit the "login" page
    When I fill the form with "email" and "password"

  Scenario: Edit the address as registered user
    Given I go to update "address" form
    When I update a "field" of the address
