Feature: Carting
  Scenario: Add book to cart
    Given I'm on the home page
    When I search and select book
    And I add book to cart
    Then i verify the correct book is added

