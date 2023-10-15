@Book_MyTrip
Feature: Assignment testing.
  My trip site assignment.
  

  @MyTrip
  Scenario Outline: Validate ticketBooking
    Given I am on the Home Page "https://www.makemytrip.com/" of makemytrip Website
    And I select RoundTrip radioButton
    When I enter <From> and <To> values
    And I enter <Departure> and <ReturnDate>
    And I click on Search Flights
    Then I wait For Results to Appear on the Screen


    
    
    
    Examples:  
    |  From    			|  To   			 |Departure 	|ReturnDate  |
    | "Hyderabad"     	| "Chennai"        |"25/10/2023"  |"27/12/2023"|
   
    