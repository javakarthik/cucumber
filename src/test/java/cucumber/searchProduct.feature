Feature: Search vegetable product

@SeleniumTest
Scenario: Search vegetable product and validate the result
Given User is on the GreenKart landing page
When User search for "Cucumber" vegetable
Then "Cucumber" vegetable product is displayed