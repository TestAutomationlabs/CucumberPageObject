package com.qa.StepDefinitions;

import com.qa.ExtentReportListner.ExtentFactory;
import com.qa.Pages.Homepage;
import com.qa.Pages.LandingPage;
import com.qa.TestBase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LandingPageStepDefinition extends TestBase {
LandingPage landingpage;
Homepage homepage;
ExtentReports report;
ExtentTest test;

public LandingPageStepDefinition() {
	// TODO Auto-generated constructor stub
	super();
}

	
	@Given("^User Enters the Valid Url$")
	public void user_Enters_the_Valid_Url() throws InterruptedException {
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	   initialization();
	   report=ExtentFactory.Instance();
	}

	@Then("^User Enters the username and Password$")
	public void user_Enters_the_username_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	   landingpage=new LandingPage();
	   test=report.startTest("LandingPage-->VerifyNewProjectButton");
	   System.out.println("Browser launched ");
	   String title=landingpage.validateLoginPageTitle();
	   Assert.assertEquals("Welcome: Mercury Tours", title);
	   homepage=landingpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    landingpage.loginbutton();
	    System.out.println("user submitted succesfully");
	}
	
	@Then("^User Navigates to the Home Page$")
	public void user_Navigates_to_the_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("User navigates ot the home page successuflly");
	}


}



