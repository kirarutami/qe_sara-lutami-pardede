Feature: searchBar
  As User
  I want to search another user
  So I can connected to them

  Scenario: As a user I have be able to search user
    Given I am on the Home Page for Search User
    When I enter my keyword
    And I click on search button
    Then I find the user I search for