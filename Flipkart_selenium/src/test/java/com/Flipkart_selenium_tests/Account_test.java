package com.Flipkart_selenium_tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart_selenium_pages.Account_page;
import com.Flipkart_selenium_pages.Login_page;
import com.Flipkart_selenium_utils.CommonUtils;
import com.Flipkart_selenium_utils.ExpicitWait;

public class Account_test extends Base_Test{
	
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("AccountTestSheetName");
    
    
    
    
   
    
    
    @Test (priority=13, groups = {"Accandlogin"})
    public void Wishlist() throws InterruptedException {
		String testname = "wishlist";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String number = testData.get("number");
        String password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Account_page wish = new Account_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		wish.Wishlist();
		Thread.sleep(2000);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
    
    
    @Test (priority=14, groups = {"Accandlogin"})
    public void Mychats() throws InterruptedException {
		String testname = "Mychats";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String number = testData.get("number");
        String password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Account_page add = new Account_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		add.Mychats();
		
		Thread.sleep(2000);
	
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
    @Test (priority=15, groups = {"Accandlogin"})
    public void MobileButton() throws InterruptedException {
		String testname = "mobile";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Account_page mob = new Account_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		mob.MobileButton();
		
		Thread.sleep(2000);
		
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
    
    @Test (priority=16, groups = {"Accandlogin"})
    public void SuperCoin() throws InterruptedException {
		String testname = "coin";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String number = testData.get("number");
        String password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Account_page coin = new Account_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		coin.SupeCoinStore();
		
		Thread.sleep(2000);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
    
    @Test(priority=17, groups = {"Accandlogin"})
    public void Grocery() throws InterruptedException {
		String testname = "grocery";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String number = testData.get("number");

        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Account_page gros = new Account_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		gros.grocery(number);
		
		Thread.sleep(2000);
		
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
  
   
    
}
