package steps;

import com.myTrip.pages.actions.FlightSearchResultsPageActions;

import cucumber.api.java.en.Then;

public class FlightsSearchResults {
	

	FlightSearchResultsPageActions searchActions=new FlightSearchResultsPageActions();
	
	@Then("^I wait For Results to Appear on the Screen$")
	public void i_wait_For_Results_to_Apper_on_the_Screen() throws Throwable {
		FlightSearchResultsPageActions.getResults();

	   
	}
	


	

	 

}
