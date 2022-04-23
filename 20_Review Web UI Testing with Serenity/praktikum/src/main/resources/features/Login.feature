Feature:
  As user
  I want to see home page
  So that I can buy product

  Scenario:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click on login button
    Then I am on the home page