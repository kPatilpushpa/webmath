package com.webmath.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Navigate_001 extends BaseClass
{
	@Test
	public void navigate()
	{
		driver.get(url);
		logger.info("url is opened");
		
		if(driver.getTitle().equals("WebMath - Solve your math problem today"))
		{
			Assert.assertTrue(true);
			logger.info("Navigating test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Navigating test failed");
		}
	}
}
