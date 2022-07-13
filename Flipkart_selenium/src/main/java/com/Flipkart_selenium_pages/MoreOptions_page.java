package com.Flipkart_selenium_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MoreOptions_page {
	WebDriver driver;
    Actions action;

	public MoreOptions_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
        this.driver = driver;
        action= new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='exehdJ'][normalize-space()='More']")
	public WebElement MoreOptions;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement NotificationPreferences;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]/div[1]")
	public WebElement CustomerSupport;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement cancel;

	public void clickMoreoption()
	{
		cancel.click();
		MoreOptions.click();
		
	}
	public void clickNotificationPrefernces() throws InterruptedException
	{
		action.moveToElement(MoreOptions).perform();
        action.moveToElement(NotificationPreferences).perform();
        NotificationPreferences.click();
        Thread.sleep(2000);
	}
	
	public void clickcustomercare() throws InterruptedException
	{
		action.moveToElement(MoreOptions).perform();
        action.moveToElement(CustomerSupport).perform();
        CustomerSupport.click();
        Thread.sleep(2000);
	}
}
