package steps;

import com.myTrip.pages.actions.FlightsSearchPageActions;
import com.myTrip.utils.SeleniumDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchFlightSteps {
	
	FlightsSearchPageActions flightSearchPageActions=new FlightsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of makemytrip Website$")
	public void i_am_on_the_Home_Page_of_cleartrip_Website(String url) throws Throwable {
	    SeleniumDriver.openPage(url);
	}


	@Then("^I select RoundTrip radioButton$")
	public void i_select_RoundTrip_dropdown() throws Throwable {
		flightSearchPageActions.chooseToHaveRoundTripJourney();
	}
	
	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\" values$")
	public void i_enter_and_values(String from, String to) throws Throwable {
		flightSearchPageActions.enterSourceAs(from);
		flightSearchPageActions.selectTheFirstAvailableAutoCompleteOptionFromSource();
		flightSearchPageActions.enterDestinationAs(to);
		flightSearchPageActions.selectTheFirstAvailableAutoCompleteOptionFromDestination();
	}
	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String depart, String returndate) throws Throwable {
		flightSearchPageActions.enterDepartureDateAs(depart);
		flightSearchPageActions.enterReturnDateAs(returndate);
	}


	
	@Then("^I click on Search Flights$")
	public void i_click_on_Search_Flights() throws Throwable {

		flightSearchPageActions.clickSearchButton();
	 
	}
	
	

}
