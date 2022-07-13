package com.Flipkart_selenium_tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart_selenium_pages.Flights_page;
import com.Flipkart_selenium_pages.MoreOptions_page;
import com.Flipkart_selenium_utils.CommonUtils;
import com.Flipkart_selenium_utils.ExpicitWait;

public class Flights_test extends Base_Test {
	
	
	// Worksheet Name used by all tests
	private String sheetName = prop.getProperty("FlightTestSheetName");
	
	
	@Test(priority=20, groups = {"flight"})
	public void FlightTravel() throws InterruptedException {
		String testname = "Flight";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String FlightFrom = testData.get("FlightFrom");
        String FlightTo = testData.get("FlightTo");
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Flights_page travel = new Flights_page(driver);
		travel.Travel();
		travel.DepartureFrom(FlightFrom);
		Thread.sleep(2000);
		travel.Arrival(FlightTo);
		travel.clickSearch();
		Thread.sleep(2000);

		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	
	
}
