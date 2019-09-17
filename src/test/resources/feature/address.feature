#Feature: Address
#
#  Background: Log in with valid credentials
#    Given The user goes to "login" page
#    When The user fills the form with "email" and "password"
#    Then Username should appear in the left panel
#
#  @DeleteAddress @signOut
#  Scenario: Create new address with the required fields
#    When The user goes to create "address" form
#    And The user fills the form with the following information
#      | firstname  | Juan          |
#      | lastname   | Perez         |
#      | address1   | abcStreet     |
#      | city       | Cochabamba    |
#      | id_state   | Alabama       |
#      | postcode   | 00000         |
#      | id_country | United States |
#      | phone      | 4578962       |
#      | alias      | Test1         |
#    Then The address information should be displayed in the Address page
#
#  @DeleteAddress @signOut
#  Scenario: Create new address with all the fields
#    When The user goes to create "address" form
#    And The user fills the form with the following information
#      | firstname    | Juan          |
#      | lastname     | Perez         |
#      | company      | AT10          |
#      | address1     | abcStreet     |
#      | address2     | defStreet     |
#      | city         | Cochabamba    |
#      | id_state     | Alabama       |
#      | postcode     | 00000         |
#      | id_country   | United States |
#      | phone        | 4578962       |
#      | phone_mobile | 4578962       |
#      | other        | New Address   |
#      | alias        | Test2         |
#    Then The address information should be displayed in the Address page
