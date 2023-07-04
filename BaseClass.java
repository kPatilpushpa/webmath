package com.webmath.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.webmath.utilities.ReadConfig;

public class BaseClass
{
	ReadConfig readconfig=new ReadConfig();
	public String url=readconfig.navigate();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", readconfig.chromepath());
		driver=new ChromeDriver();
		logger=Logger.getLogger("WebMATH");
		PropertyConfigurator.configure("complete-log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
