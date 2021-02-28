@regression
Feature: Ebay Brand Outline Functionality

Scenario Outline: Search for items with Brand
    Given Open Ebay website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then Item list should have product of "<Brand>"
    
   Examples:
	  |Items	|Brand		|
	  |Shirts	|Adidas		|
	  |Pants 	|Nike			|
	  |Shoes	|Unbranded|
