@orderhistory
Feature: See Order History
  The User want to see Order History

  @positivecase
  Scenario: See Order History
    Given The User Logged "<username>"  as email, "<pass>" as password
    When The User choose Order History and Details
    Then The User verified order history
    And The User put "<comments>" comment order
    Then The user see Notification Message successfully sent

			Examples: 
      | username              |     pass        |comments						                         |
      | QA-Admin1@getnada.com |     P@ssw0rd123 |"Property was Amazing, Beautifully designed"|
