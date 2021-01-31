Feature: Ryan Air Itinerary - Return trip

  This feature covers test cases related to adding itineraries to the shopping list

  Scenario: Add itinerary for 2 adults and 1 child
    Given that I am on the 'landing' page
    And I have accepted the cookies
    When I enter 'Lisbon' as the 'Departure' airport
    And I enter 'Paris Beauvais' as the 'Destination' airport
    And I choose '06/10/2021' as the 'Depart' date
    And I choose '30/10/2021' as the 'Return' date
    And I add '2' 'adults' to the Passengers input
    And I add '1' 'child' to the Passengers input
    And I click the 'Search' button
    Then I verify I am on the 'Flight Selection' page
