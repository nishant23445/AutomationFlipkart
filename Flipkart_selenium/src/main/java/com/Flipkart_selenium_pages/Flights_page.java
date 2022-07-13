package com.Flipkart_selenium_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flights_page {
	WebDriver driver;
    Actions action;

	public Flights_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
        this.driver = driver;
        action= new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//img[@alt='Travel']")
	public WebElement TravelButton;
	
	@FindBy(how = How.XPATH, using = "//input[@name='0-departcity']")
	public WebElement DepartureFrom;
	
	@FindBy(how = How.XPATH, using = "//input[@name='0-arrivalcity']")
	public WebElement Arrival;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement cancel;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/button[1]")
	public WebElement returnDate;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='SEARCH']")
	public WebElement searchbutton;

	public void Travel()
	{
		cancel.click();
		TravelButton.click();
		
	}
	public void DepartureFrom(String Value) 
	{
		DepartureFrom.sendKeys(Value);
	}
	
	public void Arrival(String dest) 
	{
		Arrival.sendKeys(dest);
	}
	
	public void clickSearch()
	{
		
		searchbutton.click();
		
	}
	
}
