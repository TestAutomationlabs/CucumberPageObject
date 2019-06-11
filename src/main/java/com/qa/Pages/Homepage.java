package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Homepage extends TestBase{

	@FindBy(name="tripType")
	WebElement oneWay;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passenger_dropdown;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departing_from;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verify_Oneway_Checkbox()
	{
		if(!oneWay.isSelected())
		{
			System.out.println("One way button is not clicked");
		}
		else
		{
			oneWay.click();
			System.out.println("One way button is clicked");
		}
	}
}
