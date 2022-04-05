Feature: makePost
  As a user
  I want post a paragraph
  So I can update feed

  Scenario: As user i have be able to post a paragraph
    Given I am on the Home Page
    When I click on the 'Start a post' section
    And I enter my paragraph
    Then My paragraph will be posted