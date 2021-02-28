
@regression
Feature: Ebay Notification Functionality
  

  
  Scenario: View Notifications on Ebay
    Given Open Ebay Website
    When Click Sign In button 
    And Enter Username or valid email adress
    And Enter password
    When Scroll over notification icon
    Then All notifications for account holder are shown 
    

//xpath for notification icon on ebay - $x("//i[@id='gh-btn']")   // 

 