package com.sauceDemo.testLayer;

import org.testng.annotations.Test;

import com.sauceDemo.pageLayer.LoginPage;
import com.sauceDemo.testBase.TestBase;

public class LoginTest extends TestBase{

	@Test
	public void logintestwithValidCred()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickOnLoginButton();
	}
}
