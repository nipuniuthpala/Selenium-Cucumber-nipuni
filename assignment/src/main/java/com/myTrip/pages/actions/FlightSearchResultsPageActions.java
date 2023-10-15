package com.myTrip.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.myTrip.pages.locators.FlightSearchResultsPageLocators;
import com.myTrip.utils.SeleniumDriver;
import org.testng.Assert;

public class FlightSearchResultsPageActions {
	
	static FlightSearchResultsPageLocators flightSearchResultsPageLoc=null;
	
	public  FlightSearchResultsPageActions()
	{
		flightSearchResultsPageLoc=new FlightSearchResultsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), flightSearchResultsPageLoc);
	}


	public static void getResults(){

		String ActualTitle=flightSearchResultsPageLoc.flightSearchResultsPage.getText();
		String ExpectedTitle="Flights from Hyderabad to Chennai";

		Assert.assertEquals(ExpectedTitle,ActualTitle);
	}
	

	

}
