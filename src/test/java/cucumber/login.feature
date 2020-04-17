Feature: Reset functionality on login page of Application  

  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Reset the Username and Password

  Scenario: Verification of Reset button on mobile
    Given Open the Firefox and launch the application
    When Enter the Username "karthik" and Password "1234"
    Then Reset the Username and Password