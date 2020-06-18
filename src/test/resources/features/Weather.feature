Feature: Verify Maximum temperature on Thursdays is always above 10 degrees on Bondi Beach

  Scenario: A hotline Thursday tempreture check
    Given I like to holiday on "Bondi Beach"
    When I look up the weather forecast for the next 14 days
    Then The response is valid and contains "Bondi Beach" as city name
    And I can see the max temperature on "Thursday" is always above 10 degrees
    And There is no snow forecast for any day
