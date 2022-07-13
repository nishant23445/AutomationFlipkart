package com.Flipkart_selenium_tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart_selenium_pages.Account_page;
import com.Flipkart_selenium_pages.Home_page;
import com.Flipkart_selenium_pages.Login_page;
import com.Flipkart_selenium_utils.CommonUtils;
import com.Flipkart_selenium_utils.ExpicitWait;

public class Login_test extends Base_Test {
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("LoginTestSheetName");

    @Test(priority=0, groups = {"login"})
	public void Login() throws InterruptedException {
		String testname = "Login";

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
        
		Login_page login = new Login_page(driver);
		login.MobileNumber(number,password);
		login.LoginButton();
		Thread.sleep(2000);
//		String a = driver.getTitle();
//		System.out.println(a);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
    
    
	@Test(priority=1, groups = {"login"})
	public void Invalid_Login() throws InterruptedException {
		String testname = "InLogin";

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
        
        Login_page login = new Login_page(driver);
		login.MobileNumber(number,password);
		login.LoginButton();
		Thread.sleep(2000);
//		String a = driver.getTitle();
//		System.out.println(a);
		ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of search page.");

	}
	
	 @Test(priority=2, groups = {"login"})
		public void Otp_Login_button() throws InterruptedException {
			String testname = "Rs_Bln_Login";

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
	        
			Login_page login = new Login_page(driver);
			login.number(number);
			login.otp();
			Thread.sleep(2000);
//			String a = driver.getTitle();
//			System.out.println(a);
			ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
			
			String actualTitle = driver.getTitle().toLowerCase();
	        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
	                "Assertion on actual and expected title of search page.");

		}
	 
	 
	 @Test(priority=3, groups = {"login"})
	    public void Logout() throws InterruptedException {
			String testname = "logout";

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
	        
			Login_page login = new Login_page(driver);
			login.MobileNumber(number,password);
			login.LoginButton();
			Thread.sleep(2000);
			login.logout();
			Thread.sleep(2000);
			ExpicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
			
			String actualTitle = driver.getTitle().toLowerCase();
	        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
	                "Assertion on actual and expected title of search page.");

		}
	    
	


}
