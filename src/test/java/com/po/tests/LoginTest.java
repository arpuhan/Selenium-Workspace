package com.po.tests;

import org.testng.annotations.Test;

import com.pom.pages.LoginPage;
import com.pom.utils.Hooks;

public class LoginTest extends Hooks {
	@Test
	
	public void validLoginTest() {
		System.out.println("Login with credentials");
		 LoginPage loginPage = new LoginPage(driver);
		 loginPage.loginIntoApp("https://demo.guru99.com/V2/index.php", "mngr26593\r\n"
		 		+ "", "1234567@");
	}
	
}
