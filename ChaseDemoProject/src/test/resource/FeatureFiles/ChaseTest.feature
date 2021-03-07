@regression
Feature: Car Loan Calculator
 

  @tag1
  Scenario: Car loan calculator
   Given open Chase website
    And click on autoloans 
    And click type new or used 
    And select year
    And select make
    And select state
    And select estimated credit rating 
    And select amount
    And click get info
    Then validate with results 
    