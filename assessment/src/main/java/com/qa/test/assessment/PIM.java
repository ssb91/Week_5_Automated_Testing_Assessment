package com.qa.test.assessment;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class PIM {

//click on add employee
	
	@FindBy (xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	private WebElement clickAddEmployee;			
	
	public void pimAddEmployee () {
		
		clickAddEmployee.click();
				
	}

//check "add employee" was clicked

	public String pimAddEmployeeText() {
		
		return clickAddEmployee.getText();
				
	}
	
//create login, first stage
	
	@FindBy (xpath = "//*[@id=\"firstName\"]")
	private WebElement enterFirstName;
	
	
	@FindBy (xpath = "//*[@id=\"lastName\"]")
	private WebElement enterLastName;

	
	public void pimName (String firstname, String lastname) {
		
		enterFirstName.sendKeys();
		enterLastName.sendKeys();
							
	}

	@FindBy (xpath = "//*[@id=\"select-options-dd9e123b-d80e-12cc-af57-8dc4ed7b6d97\"]/li[1]/span")
	private WebElement clickLocation;
	
//	@FindBy (xpath = "//*[@id=\"select-options-dd9e123b-d80e-12cc-af57-8dc4ed7b6d97\"]/li[21]/span")
//	private WebElement clickLocation2;
//	click London Office option, will not work without scroll

	
	public void pimLocation (Actions action1, Actions action2) {
		
		clickLocation.click();
//		clickLocation2.click();

		
//press down key 12 times to select London office

		int i = 1;
		while (i <= 12) {
		action1.sendKeys(Keys.DOWN).perform(); 
		i++;
		}
		
		action2.sendKeys(Keys.ENTER).perform(); 
							
	}
	
//create login, second stage
	
	@FindBy (xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement clickCreateLogin;

	
	public void pimCreateLogin () {
		
		clickCreateLogin.click();
							
	}
	
	@FindBy (xpath = "//*[@id=\"username\"]")
	private WebElement enterUserName;


	@FindBy (xpath = "//*[@id=\"password\"]")
	private WebElement enterPassword;
	
	@FindBy (xpath = "//*[@id=\"confirmPassword\"]")
	private WebElement enterConfirmPassword;

	
	@FindBy (xpath = "//*[@id=\"select-options-8e2ff698-55ef-588c-0e40-538247b80d94\"]/li[1]/span")
	private WebElement clickESSRole;
	
	public void pimEnterLogin (String username, String password, String confirmpassword, Actions action1, Actions action2) {
		
		enterUserName.sendKeys(username);			
		enterPassword.sendKeys(password);			
		enterConfirmPassword.sendKeys(confirmpassword);

		clickESSRole.click();
		action1.sendKeys(Keys.DOWN).perform(); 
		action2.sendKeys(Keys.ENTER).perform(); 

	}


//save new login
	
	@FindBy (xpath = "//*[@id=\"systemUserSaveBtn\"]")
	private WebElement clickSave;
	
	public void pimSave() {
		
		clickSave.click();
							
	}

	
//check "save" was clicked	

	
	public String pimSaveText() {
		
		return clickSave.getText();
							
	}
	

//click employee list while on pim page
	
	@FindBy (xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	private WebElement clickEmployeesList;
	
	public void pimEmployeesList() {
		
		clickEmployeesList.click();
							
	}
	
//check "employee list" was clicked	
	
	public String pimEmployeesListText() {
		
		return clickEmployeesList.getText();
							
	}
		
		
}
