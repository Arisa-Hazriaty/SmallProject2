@registeraccount @development
Feature: Register Account
  User want to Register Account Application Booking Hotel Dominique Parks

  @PositiveCase
  Scenario Outline: Register Account Application Booking Hotel Dominique Parks
    Given User on the Homepage
    When User register "<email>" as Email Address
    And User set "<firstname>" as firstname, "<lastname>" as lastname, "<password>" as password
    Then User see my Account Page
    And User set the Address "<address>" as address, "<city>" as city, "<zipcode>" as zipcode, "<phone>" as phone
    Then User see His Address

    Examples: 
      | email | firstname | lastname | password    | address                       | city      | zipcode | phone      |
      | valid | valid     | valid    | P@ssw0rd123 | Jl. akasia Karawaci Tangerang | Tangerang |   15115 | 0812345678 |
