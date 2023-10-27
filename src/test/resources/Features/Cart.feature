Feature: Cart feature

  @Regression @Positive
  Scenario: Add Product to cart
    Given user on login page
    When user input username
    And user input valid password
    And user click login button
    Then user is on Homepage
    When user click add to cart
    And user go to shopping cart
    Then user success add product to cart

  @Regression @Positive
  Scenario: Remove products from cart
    Given user on login page
    When user input username
    And user input valid password
    And user click login button
    Then user is on Homepage
    When user click add to cart
    And user go to shopping cart
    And user click remove button
    Then user success remove product from cart


