Feature: BookStore

  Scenario: GET - As admin
  I have not be able to get detail book
  when I input wrong ISBN

    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail book


  Scenario: DELETE - As admin
  i have not be able to delete existing book
  when I input wrong UserId

    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 401