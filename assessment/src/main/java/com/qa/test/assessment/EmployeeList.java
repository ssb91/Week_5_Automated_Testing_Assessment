package com.qa.test.assessment;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.interactions.Actions;

public class EmployeeList {

	@FindBy (xpath = "//*[@id=\"employeeListTable\"]/tbody/tr[29]/td[3]")
	private WebElement clickNewEmployee;
	
	public void listNewEmployee() {
		
		clickNewEmployee.click();
							
	}

	
}
