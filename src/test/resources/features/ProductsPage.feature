Feature: Purchase Test
  Scenario: Place an order and download the Invoice with Login Account
    Given I go to Login page
    When I try to login with username:"asmaqac@gmail.com" and password: "qaconsultants"
    Then I am logged in
    And I go to the Products Page
    Then I can see the Products page
    And I can search "tshirts"
    And I can add two tshirts to cart
    And I can go to Cart
    Then I can see all the Products I added
    And I can remove one I don't like
    And I can go to checkout page
    And I can proceed to place order
    And I can place an order with NameOnCard: "qac", CardNumber:0254, CVC: 111, ExpiryMonth: 01 and ExpiryYear: 2024
    Then I can download the Invoice



  Scenario: UnSuccessful Login
    Given I go to Login page
    When I try to login with wrong username:"asmaqa@gmail.com" and password: "qac"
    Then I am not logged in



