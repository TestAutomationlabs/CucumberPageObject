package com.qa.Runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Automate_Cucumber_PageObject\\src\\main\\java\\com\\qa\\Feature\\LandingPage.feature",
				"C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Automate_Cucumber_PageObject\\src\\main\\java\\com\\qa\\Feature\\HomePage.feature"}
		
		,glue= {"com/qa/StepDefinitions"}
		,format= {"pretty", "html:test-ouptputs", "json:json_outputs/cucumber.json", "junit:junit__xml/cucumber.xml"}
		,strict=true
		,dryRun=false
		,monochrome=true
		//,tags= {"~@SmokeTest", "~@RegressionTest", "~@	End2End"}
		)


public class TestRunner {
	
	
	
}

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTests
