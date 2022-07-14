package com.Flipkart_selenium_pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	WebDriver driver;

	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]")
	public WebElement sellerButton;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter 10 digit phone number here']")
	public WebElement sellerNumber;
	
	@FindBy(how = How.XPATH, using = "//button[@class='styles__RegisterButton-r412un-12 fvJXKb']")
	public WebElement RegisterButton;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Payments']")
	public WebElement paymentbutton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement cancel;
	
    @FindBy(how = How.XPATH, using = "//img[@title='Flipkart']")
	public WebElement img;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for products, brands and more']")
	public WebElement search;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Flipkart Wholesale']")
	public WebElement wholesaleButton;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='BUY NOW']")
	public WebElement Buy_now;
		
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Popularity']")
	public WebElement SortByPopularity;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Shipping']")
	public WebElement Shipping;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Cart']")
	public WebElement cart;
	

	public void SearchBox(String value) {
		cancel.click();
		search.sendKeys(value);
		search.submit();
		
	}
	
	public void Payment()
	{
		cancel.click();
		paymentbutton.click();
	}
	
	public void cart()
	{
		cart.click();
	}
	
	public void ship()
	{
		Shipping.click();
	}
	
	public void sortbypopularity()
	{
		SortByPopularity.click();
	}
	public void display() {
		cancel.click();
		System.out.println(img.isDisplayed());
	}
	
	public void cancel() {
		cancel.click();
	}
	
	
	
	public void buyNow() throws InterruptedException
	{
		Buy_now.click();
		Thread.sleep(2000);
	}
	
	public void SellerRegister(String number)
	{
		cancel.click();
		sellerButton.click();
		sellerNumber.sendKeys(number);
		//RegisterButton.click();
	}

	public void wholesale() {
		// TODO Auto-generated method stub
		cancel.click();
		wholesaleButton.click();
		Set<String> h = driver.getWindowHandles();
        System.out.println(h);
        for(String string : h)
        {
            driver.switchTo().window(string);
        }
	}
	
}
