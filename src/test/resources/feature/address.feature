Feature: Address

  Background: I log in
    Given I visit the "login" page
    When I fill the form with "email" and "password"

  Scenario: Edit the address as registered user
    When I go to update "address" form
    And I create a new Address with the following information
      | firstname    | firstname     |
      | lastname     | lastname      |
      | company      | site          |
      | address1     | Prospect      |
      | address2     | Agriculture   |
      | city         | 1             |
      | id_state     | Alabama       |
      | postcode     | 00000         |
      | id_country   | United States |
      | phone        | 4578962       |
      | phone_mobile | 4578962       |
      | other        | Public        |
      | alias        | Nuevito999    |
    Then the address information should be displayed in the Address page
