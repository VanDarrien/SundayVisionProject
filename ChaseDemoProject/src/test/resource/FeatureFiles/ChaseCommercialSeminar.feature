@regression
Feature: Chase Commercial Seminar Feature

  Scenario: Watch Commercial Seminar
    Given open Chase website
     And click commercial 
     And click watch now 
     And click proceed
     And enter first name
     And enter last name 
     And enter company name 
     And enter email 
     And submit form 
     And press play
     Then validate that seminar is playing 
     
 
   Examples:
	  |forms	     |user input          |user input2 
	  |first name	 |pablo   	          |r4ver
	  |last name 	 |palacios	          |g3rL
	  |company name|Talent Tech         |!
    |email       |thesparkan@gmail.com|!