@regression
Feature: Ebay Search Functionality

  Scenario: search for shirts
    Given Open Ebay website
    When Search for shirts
    Then Item list should have only shirt related products