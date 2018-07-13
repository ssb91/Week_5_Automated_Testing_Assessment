package com.qa.test.assessment;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.interactions.Actions;

public class Dashboard {
	
		@FindBy (xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
		private WebElement clickPIM;

		
		public void dashboardPIM () {
						
			clickPIM.click();				
			
		}
		
		public String dashboardPIMText () {
			
			return clickPIM.getText();				
			
		}
				
}
