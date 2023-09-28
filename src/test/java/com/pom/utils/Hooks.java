package com.pom.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Hooks {
	public Properties config;
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeAll() {
		config = new Properties();
		try {
			config.load (new FileInputStream("./src/test/resources/config-qa.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		if(config.getProperty("browser").equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",this.config.getProperty("browser.binary.path"));
			driver = new ChromeDriver();
		}
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	@AfterSuite
	public void afterAll() {
		System.out.println("After Suite");
	}


}
