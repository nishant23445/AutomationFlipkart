package com.Flipkart_selenium_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Account_page {
	WebDriver driver;
    Actions action;

	public Account_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
        this.driver = driver;
        action= new Actions(driver);
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='exehdJ'][normalize-space()='Nishant']")
	public WebElement myname;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[6]/a[1]")
	public WebElement mychats;
	
	
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Manage Addresses']")
	public WebElement ManageAddress;
	
	@FindBy(how = How.XPATH, using = "//div[@class='_1QhEVk']")
	public WebElement AddAddress;
	
	
	@FindBy(how = How.XPATH, using = "//img[@alt='Mobiles']")
	public WebElement Mobile;
	
	@FindBy(how = How.CSS, using = "div[class='_331-kn _2tvxW'] div:nth-child(3) a:nth-child(1) div:nth-child(2)")
	public WebElement Mobilebycss;
	
	@FindBy(how = How.XPATH, using = "//div[@title='4★ & above']//div[@class='_24_Dny']")
	public WebElement StarFilter;
	
	@FindBy(how = How.XPATH, using = "//div[@title='POCO']//div[@class='_24_Dny']")
	public WebElement ComFilter;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Top Offers')]")
	public WebElement TopOffer;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter pincode']")
	public WebElement Pin;

	@FindBy(how = How.XPATH, using = "//img[@alt='Grocery']")
	public WebElement Grocery;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/a[1]/div[1]")
	public WebElement Wishlist;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement Supercoin;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]")
	public WebElement coinActivity;
	
	public void clickmyname()
	{
		
		myname.click();
		
	}
	
	
	public void Wishlist() throws InterruptedException
	{
		action.moveToElement(myname).perform();
        action.moveToElement(Wishlist).perform();
        Wishlist.click();
        Thread.sleep(2000);
	}
	public void Mychats() throws InterruptedException
	{
		action.moveToElement(myname).perform();
        action.moveToElement(mychats).perform();
        mychats.click();
        Thread.sleep(2000);
	}
	
	
	
	public void MobileButton()
	{
		Mobilebycss.click();
		
	}
	
	
	public void grocery(String number)
	{
		Grocery.click();
		Pin.sendKeys(number);
	}
	
	public void filter()
	{
		Mobile.click();
		StarFilter.click();
		ComFilter.click();
	}

	
	
	public void SupeCoinStore() throws InterruptedException
	{
		action.moveToElement(myname).perform();
		action.moveToElement(Supercoin).perform();
		Supercoin.click();
		Thread.sleep(2000);
		coinActivity.click();
		Thread.sleep(2000);
		
	}
	
	
	public void offer()
	{
		TopOffer.click();
	}
	
	
}