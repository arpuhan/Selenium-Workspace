package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.utils.commonUtilities;


public class LoginPage extends commonUtilities{
	
	public WebDriver driver;
	By userInput = By.name("uid");
	By passwordInput = By.name("password");
	By loginButton = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	public void loginIntoApp(String url, String userId, String password) {
		this.navigateUrl(url);
		this.type(userInput, userId);
		this.type(passwordInput, password);
		this.clickElement(loginButton);
		
	}
}
