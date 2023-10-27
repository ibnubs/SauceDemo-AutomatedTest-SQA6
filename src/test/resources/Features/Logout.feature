Feature: Logout  Test

  @Regression @Positive
  Scenario: User logout from website
    Given user on login page
    When user input username
    And user input valid password
    And user click login button
    And user click burger menu button
    And user click logout
    Then user on login page