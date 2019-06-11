package com.qa.StepDefinitions;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.qa.ExtentReportListner.ExtentFactory;
import com.qa.Pages.Homepage;
import com.qa.Pages.LandingPage;
import com.qa.TestBase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition extends TestBase{
	LandingPage landingpage;
	Homepage homepage;
	ExtentReports report;
	ExtentTest test;
	
	public HomePageStepDefinition()
	{
		super();
		
	}

	@Given("^user is already on HOme Page$")
	public void user_is_already_on_HOme_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is alerdady home page");
		initialization();
		report=ExtentFactory.Instance();
	   landingpage=new LandingPage(); 
	   homepage=new Homepage();
	   test=report.startTest("LandingPage-->VerifyNewProjectButton");
	   homepage=landingpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   landingpage.loginbutton();
	    System.out.println("user submitted succesfully");
	}

	@Then("^User clicks on One Way check box$")
	public void user_clicks_on_One_Way_check_box()  {
	    // Write code here that turns the phrase above into concrete actions
	   homepage.verify_Oneway_Checkbox();
	   System.out.println("Homepage check box is validated");
	   System.out.println("Close connection");
		driver.close();
			report.endTest(test);
			report.flush();
	}
	

	
	
}



