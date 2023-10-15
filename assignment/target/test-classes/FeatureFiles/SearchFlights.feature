@Book_MyTrip
Feature: Acceptance testing.
  In order to book the tickets verify that cleartrip page is loading and able to book the tickets
  

  @MyTrip
  Scenario Outline: Validate ticketBooking
    Given I am on the Home Page "https://www.makemytrip.com/" of makemytrip Website
    Then I click on Flights Button
    Then I select RoundTrip radioButton
    Then I enter <From> and <To> values 
    Then I enter <Departure> and <ReturnDate>
    Then I click on Search Flights
    Then I wait For Results to Appear on the Screen


    
    
    
    Examples:  
    |  From    			|  To   			 |Departure 	|ReturnDate  |
    | "Hyderabad"     	| "Chennai"        |"25/10/2023"  |"27/12/2023"|
   
    