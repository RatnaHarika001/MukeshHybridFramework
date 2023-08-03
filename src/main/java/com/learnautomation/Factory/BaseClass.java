package com.learnautomation.Factory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.dataProvider.ConfigReader;
import com.learnautomation.dataProvider.ConfigReader2;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		System.out.println("LOG:INFO - Running Before Class - Setting up application");
		driver = BrowserFactory.startbrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}
	
//	@AfterClass
	public void teardown()
	{
		System.out.println("LOG:INFO - Running After Class -Terminating the session");
		driver.quit();
	}

}
