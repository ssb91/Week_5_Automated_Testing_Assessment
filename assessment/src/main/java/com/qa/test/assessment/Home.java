package com.qa.test.assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
		@FindBy (xpath = "//*[@id=\"txtUsername\"]")
		private WebElement enterUsername;

		@FindBy (xpath = "//*[@id=\"txtPassword\"]")
		private WebElement enterPassword;
		
		public void home (String username, String password) {
						
			enterUsername.sendKeys(username);			
			enterPassword.sendKeys(password);
			
		}
	
}
