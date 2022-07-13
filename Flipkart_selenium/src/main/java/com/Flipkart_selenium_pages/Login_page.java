package com.Flipkart_selenium_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_page {


	WebDriver driver;
	Actions action;

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
        this.driver = driver;
        action= new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='exehdJ'][normalize-space()='Nishant']")
	public WebElement myname;
	
	@FindBy(how = How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
	public WebElement MobileNumber;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement LoginButton;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[10]/a[1]/div[1]")
	public WebElement LogoutButton;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Request OTP']")
	public WebElement OTP;
	
	public void MobileNumber(String value,String password) {
		MobileNumber.sendKeys(value);
		Password.sendKeys(password);
	
	}

	public void otp()
	{
		OTP.click();
	}
	
	public void LoginButton() {
		LoginButton.click();
	}

	public void logout()
	{
		action.moveToElement(myname).perform();
		action.moveToElement(LogoutButton).perform();
		LogoutButton.click();
		
	}

	public void number(String number) {
		// TODO Auto-generated method stub
		MobileNumber.sendKeys(number);
		
	}
}
