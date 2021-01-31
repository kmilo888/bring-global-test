Feature: Ryan Air Itinerary - Return trip

  This feature covers test cases related to adding itineraries to the shopping list

  Scenario: Add itinerary for 2 adults and 1 child
    Given that I am on the 'landing' page
    And I have accepted the cookies
    When I enter 'Lisbon' as the 'Departure' airport
    And I enter 'Paris Beauvais' as the 'Destination' airport
    And I choose '06/06/2021' as the 'Depart' date
    And I choose '30/10/2021' as the 'Return' date
    # And I add '2' 'adults' to the Passengers input
    # And I add '1' 'child' to the Passengers input
    # And I click the 'Search' button
    # Then I verify I am on the 'Flight Selection' page
    # When I change the 'Depart' date to '06/12/2021' on the lateral scroll
    # And I select the first option 'Depart' flight
    # And I select the 'Depart' 'Value' fare
    # And I change the 'Return' date to '12/12/2021' on the lateral scroll
    # And I select the first option 'Return' flight
    # And I select the 'Return' 'Value' fare
    # And I click the 'Log in later' button
    # And I fill the Adult Passenger '1' information with 'Title' : 'Ms', 'First Name' : 'Sónia' and 'Last Name' : 'Pereira'
    # And I fill the Adult Passenger '2' information with 'Title' : 'Mr', 'First Name' : 'Diogo' and 'Last Name' : 'Bettencourt'
    # And I fill the Child Passenger '3' information with 'First Name' : 'Inês' and 'Last Name' : 'Marçal'
    # And I click the 'Continue' button
    # Then I verify I am on the 'Seats' page
    # When I click the 'Family seating modal - Okay, got it' button
    # And I select '3' consecutive seats for each Passenger
    # And I click the 'Next flight' button
    # And I click the 'Pick these seats' button
    # And I click the 'Avoid the crowds and long queues modal - No, thanks' button
    # Then I verify I am on the 'Bags' page
    # When I check the 'Add for all passengers - 1 Small bag only' checkbox
    # And I click the 'Continue' button
    # Then I verify I am on the 'Extras' page
    # When I click the 'Continue' button
    # Then I verify I am on the 'Trip' page
    # And I verify my itinerary was added to the Shopping Cart
