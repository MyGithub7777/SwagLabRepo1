package com.sauceDemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//-----------obj repo ----------------
	private By username_txtbox = By.xpath("//input[@id='user-name']");
	private By password_txtbox = By.xpath("//input[@id='password']");
	private By login_btn = By.xpath("//input[@id='login-button']");
	
	// --------- Action methods ------------
	public void enterUsername(String username)
	{
		driver.findElement(username_txtbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
	
}
