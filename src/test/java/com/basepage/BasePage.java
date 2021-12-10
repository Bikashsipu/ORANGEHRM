package com.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.generic.DriverUtils;



public class BasePage {
	WebDriver driver;
	public BasePage()
	{
driver=DriverUtils.getDriver();
	PageFactory.initElements(driver,this);
	}
}
