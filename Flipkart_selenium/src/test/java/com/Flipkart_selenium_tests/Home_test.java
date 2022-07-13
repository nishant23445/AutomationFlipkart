package com.Flipkart_selenium_tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart_selenium_pages.Account_page;
import com.Flipkart_selenium_pages.Home_page;
import com.Flipkart_selenium_pages.Login_page;
import com.Flipkart_selenium_utils.CommonUtils;
import com.Flipkart_selenium_utils.ExpicitWait;

public class Home_test  extends Base_Test{
	
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("HomeTestSheetName");


    
	@Test(priority=4, groups = {"Home","login"})
	public void Logo() {
		
		String testname = "logo";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page logo = new Home_page(driver);
		logo.display();
	
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	
	@Test(priority=5, groups = {"Home","login"})
	public void ship() throws InterruptedException {
		
		String testname = "ship";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page ship = new Home_page(driver);
		Login_test login = new Login_test();
		login.Login();
		ship.ship();
	
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	
	@Test(priority=6, groups = {"Home"})
	public void cross_login_box() {
		String testname = "cross";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page cross = new Home_page(driver);
		
		cross.cancel();

		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");
		

	}
	
	@Test(priority=7)
	public void search() {
		String testname = "search";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page home = new Home_page(driver);
		home.SearchBox(prop.getProperty("searchValue"));
		String a = driver.getTitle();
		System.out.println(a);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");
		
	}
	
	@Test(priority=8)
	public void sort_by_popularity() throws InterruptedException {
		String testname = "sort";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page home = new Home_page(driver);
		home.SearchBox(prop.getProperty("searchValue"));
		Thread.sleep(2000);
		home.sortbypopularity();
		Thread.sleep(2000);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");
		
	}
	

	
//
	@Test(priority=9, groups = {"Home"})
	public void wholesale() throws InterruptedException {
		String testname = "wholesale";

        // Fetching all test data from excel file
		HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String expectedTitle = testData.get("Expected Title");

        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		Home_page whole = new Home_page(driver);
		whole.wholesale();
		Thread.sleep(2000);

		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");
		
	}

	

	
	
	@Test(priority=10, groups = {"Home"})
	public void Seller_Register() throws InterruptedException {
		String testname = "seller";

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
        
		Home_page sell = new Home_page(driver);
		
		sell.SellerRegister(number);
		Thread.sleep(2000);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	@Test(priority=11, groups = {"Accandlogin","login"})
    public void Cart() throws InterruptedException {
		String testname = "cart";

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
        
		Home_page prof = new Home_page(driver);
		Login_test login = new Login_test();
		login.Login();
		Thread.sleep(2000);
		prof.cart();
		Thread.sleep(2000);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	@Test (priority=12, groups = {"Accandlogin","login"})
  public void Payment() throws InterruptedException {
		String testname = "Payment";

      // Fetching all test data from excel file
      HashMap<String, String> testData = new HashMap<String, String>();
      testData = reader.getRowTestData(sheetName, testname);
      String executionRequired = testData.get("Execution Required").toLowerCase();
      String expectedTitle = testData.get("Expected Title");

      // log all data
      CommonUtils.logTestData(sheetName, testname);

      // if execution required field is no
      CommonUtils.toCheckExecutionRequired(executionRequired);
      
		Home_page mob = new Home_page(driver);
		mob.Payment();
		Thread.sleep(5000);
		
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
      Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
              "Assertion on actual and expected title of search page.");

	}
	
	
}
