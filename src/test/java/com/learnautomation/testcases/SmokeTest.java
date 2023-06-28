package com.learnautomation.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;

public class SmokeTest extends BaseClass {
	

	@Test
	public void verifyURL()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "URL does not contain login");
	}

}
