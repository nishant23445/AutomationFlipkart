package com.Flipkart_selenium_tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart_selenium_pages.Home_page;
import com.Flipkart_selenium_pages.MoreOptions_page;
import com.Flipkart_selenium_utils.CommonUtils;
import com.Flipkart_selenium_utils.ExpicitWait;



public class MoreOptions_test extends Base_Test {
	
	
	// Worksheet Name used by all tests
	private String sheetName = prop.getProperty("MoreTestSheetName");
	
	
	@Test(priority=18, groups = {"more"})
	public void NotificationPreference() throws InterruptedException {
		String testname = "notification";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		MoreOptions_page more = new MoreOptions_page(driver);
		more.clickMoreoption();
		more.clickNotificationPrefernces();
		Thread.sleep(2000);

		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	@Test(priority=19, groups = {"more"})
	public void customercare() throws InterruptedException {
		String testname = "customer";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		MoreOptions_page more = new MoreOptions_page(driver);
		more.clickMoreoption();
		more.clickcustomercare();
		Thread.sleep(2000);

		
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
}
