Feature: followCompany
  As User
  I want to follow a company
  So I can updated about their information

  Scenario: As a user I have be able to follow a company
    Given I am on the Home Page for Follow a Company
    When I search for a company
    And I click on follow button
    Then The Company will be followed by Me