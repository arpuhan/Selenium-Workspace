package com.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
/**
 * <h1>This method includfes all commonly used UI insertion functions</h1>
 */
public class commonUtilities {
	
	public WebDriver driver;
	public commonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateUrl(String url) {
		driver.get(url);
	}
	public void type(By elementIdentifier, String keys) {
		driver.findElement(elementIdentifier).sendKeys(keys);
	}
	public void clickElement(By elementIdentifier) {
		driver.findElement(elementIdentifier).click();
	}

}
