package com.myTrip.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightsSearchPageLocators {
	
	@FindBy(xpath="//ul[@class='navGroup productNav withArrows']/a[@href='/flights']")
	public WebElement searchPage_FlightsBtn;
	
	@FindBy(how=How.ID,using="RoundTrip")
	public WebElement searchPage_RoundTripRadioBtn;
	
	@FindBy(id="fromCity")
	public WebElement searchPage_FromTag;
		
	@FindBy(id="toCity")
	public WebElement searchPage_ToTag;
	
	@FindBy(id="departure")
	public WebElement searchPage_DepartDate;
	
	@FindBy(id="return")
	public WebElement searchPage_ReturnDate;

	@FindBy(xpath="//a[contains(@class,'widgetSearchBtn') and text()='Search")
	public WebElement searchPage_SearchBtn;
	

}
