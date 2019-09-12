Feature: WishList

  Background:
    Given I visit the "login" page
    When I fill the form with "email" and "password"

  Scenario: I create a wishlist
    Given I visit the "wishlist" page
    When I put a new wishlist name
    And I select save button
    Then

  Scenario: I search an item in the wishlist page
    Given I visit the "wishlist" page
    When I enter in the Wishlist
    And I search the specific item
    And I select the item
    Then I should see the name of the item
    And I should see "Send this fish list" button
    And I should see "delete" button
    And I should see "priority" button
    And I should see "save" button

