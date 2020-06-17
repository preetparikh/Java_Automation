Scenario: A happy holidaymaker

  Given I like to holiday in Bondi Beach
  And I only like to holiday on Thursdays
  When I look up the the weather forecast for the next 14 days
  Then I can see the max temperature on Thursdays is always above 10 degrees in Bondi Beach
  And I can see that it won't be snowing for the next 14 days