Feature: Login functionality

  Scenario: Successfull Login
    Given Open browser 
    And navigate to url
    When enter username,password 
    And click on login button
    Then sucessfully login into application
   	Then user logout from applcation.