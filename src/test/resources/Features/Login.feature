@LoginTest
Feature: Login Test

  @Regression @Positive
  Scenario: User login with valid account
    Given user on login page
    Then user input username
    And user input valid password
    And user click login button
    Then user is on Homepage

  @Regression @Negative
  Scenario: User login with invalid account
    Given user on login page
    Then user input username
    And user input invalid password
    And user click login button
    Then user get error message