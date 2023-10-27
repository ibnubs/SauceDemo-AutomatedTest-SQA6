Feature: Checkout product

  @Regression @Positive
  Scenario: User can checkout the product with valid data
    Given user on login page
    When user input username
    And user input valid password
    And user click login button
    Then user is on Homepage
    When user click add to cart
    And user go to shopping cart
    And user click checkout
    And user fill the first name
    And user fill the last name
    And user fill the postal code
    And user click continue button
    And user click finish button
    Then user successfully checkout the product

  @Regression @Negative
  Scenario: User failed checkout the product because didnt fill the last name column
    Given user on login page
    When user input username
    And user input valid password
    And user click login button
    Then user is on Homepage
    When user click add to cart
    And user go to shopping cart
    And user click checkout
    And user fill the first name
    And user fill the postal code
    And user click continue button
    Then user get error message that must be filled column
