package com.qa.test.assessment;

import cucumber.api.java.Before;
import cucumber.api.java.After;
//import org.junit.Test;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class WebTest {

	ChromeDriver driver;
	ExtentReports extent;
	ExtentTest test;

	Actions action1 = new Actions(driver);
	Actions action2 = new Actions(driver);

	
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");

		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true);
		test = extent.startTest("verify user account creation for employee");

		driver = new ChromeDriver();
	}

	@After
	public void teardown() {

	}

//Scenario: Browse the items available on the website	
		
	
		@Given("^the login page$")
		public void the_correct_web_address() {
			
			driver.get("https://qa-trials641.orangehrmlive.com/auth/login");				
			
		}
		
		
		@When("^I login$") 
		
		public void I_login() {
			
			Home homePage = PageFactory.initElements(driver, Home.class);
			homePage.home("Admin", "AdminAdmin");
			
			test.log(LogStatus.PASS, "admin login successfull");			
			
		}
				
		@And("^I click the PIM tab$") 
		public void I_click_the_PIM_tab() {

		//dashboardON = dashboard object name
		Dashboard dashboardON = PageFactory.initElements(driver, Dashboard.class);
		dashboardON.dashboardPIM();
		
		assertEquals("PIM", dashboardON.dashboardPIMText());
		
		test.log(LogStatus.PASS, "PIM tab click successful");
		
		}


	@And("^then the Add Employee Tab$")

	public void then_the_Add_Employee_Tab() {

		//pimON = pim object name
		PIM pimON1 = PageFactory.initElements(driver, PIM.class);
		pimON1.pimAddEmployee();

		assertEquals("Add Employee", pimON1.pimAddEmployeeText());
		
		test.log(LogStatus.PASS, "employee added successfully");
		
	}

	@And("^I fill out the Employee Details correctly$")
	public void I_fill_out_the_Employee_Details_correctly() {

		PIM pimON2 = PageFactory.initElements(driver, PIM.class);
		pimON2.pimName("Cucumber", "Nimda");
		pimON2.pimLocation(action1, action2);
		//Nimda = admiN in reverse		
		
		test.log(LogStatus.PASS, "user login details filled in successful");

	}
	
	@And("^I choose to create Login Details by clicking the appropriate button$")
	public void I_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {

		PIM pimON3 = PageFactory.initElements(driver, PIM.class);
		pimON3.pimCreateLogin();		
		
		test.log(LogStatus.PASS, "user login details created successfully");

	}
	
	@And("^I fill out the Login Details correctly$")
	public void I_fill_out_the_Login_Details_correctly() {

		PIM pimON4 = PageFactory.initElements(driver, PIM.class);
		pimON4.pimEnterLogin("Cucumber", "selenium321", "selenium321", action1, action2);

		test.log(LogStatus.PASS, "user login details entered correctly");
		
	}
	
	@And("^I click the Save button$")
	public void I_click_the_Save_button() {
		
		PIM pimON5 = PageFactory.initElements(driver, PIM.class);
		pimON5.pimSave();		
		
		assertEquals("SAVE", pimON5.pimSaveText());

		test.log(LogStatus.PASS, "user save successful");

	}
	
	
	@Then("^I can search for the Employee I have just created$")
	public void I_can_search_for_the_Employee_I_have_just_created() {

		PIM pimON6 = PageFactory.initElements(driver, PIM.class);
		pimON6.pimEmployeesList();		
		
		assertEquals("Employee List", pimON6.pimEmployeesListText());

		test.log(LogStatus.PASS, "user found in list successfully");
		
	}
	

	@And("^select them for inspection$")
	public void select_them_for_inspection() {

		EmployeeList listON = PageFactory.initElements(driver, EmployeeList.class);
		listON.listNewEmployee();						

		test.log(LogStatus.PASS, "user inspection successful");
		extent.endTest(test);
		extent.flush();
		
	}

	
}