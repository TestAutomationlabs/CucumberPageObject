package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;
import com.qa.Pages.Homepage;

public class LandingPage extends TestBase{
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	//Initializing the Page Objects:
		public LandingPage(){
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
			//Welcome: Mercury Tours
		}
		
		public Homepage login(String un, String pwd)
		{
			userName.sendKeys(un);
			password.sendKeys(pwd);
			return new Homepage();
			
		}
		
		public void loginbutton()
		{
			login_button.click();
			System.out.println("User clicked the login button successfully");
		}
		
	

}
