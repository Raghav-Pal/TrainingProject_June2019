Feature: feature to test login functionality

  Scenario Outline: check login with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And Clicks login button
    Then User is navigated to home page

    Examples: 
      | username | password                 |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |
