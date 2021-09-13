@loginemailnegative
Feature: Login Negative
  		User login with invalid email format

  @negativecase
  Scenario Outline: Login Application Booking Room Hotel with invalid email format
    Given The User on the Home Page
    When User login "<email>" as email and "P@ssw0rd123" as password
    Then Error notification should displayed

    Examples: 
      | email              |
      | QA-Admin1          |
      | QA-Admin1@         |
      | QA-Admin1@getnada  |
      | QA-Admin1@getnada. |
