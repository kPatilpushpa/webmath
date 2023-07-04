package com.webmath.Objects;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.google.common.annotations.VisibleForTesting;

public class TestGeneralMath
{
	@Test
	public void VerifyGeneralMath()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pushpa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 GeneralMath gmath=new GeneralMath(driver);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit);
		 
		 driver.get("https://www.webmath.com/index.html");
		 
		 gmath.clickURL();
		 gmath.ClickGeneralmath();
//		 gmath.ClickFactor();
//		 gmath.ClickGCF();
//		 gmath.ClickLCM();
//		 gmath.ClickPrououncing();
//		 gmath.ClickDeicimalToFraction();
//		 gmath.ClickFractionToDecimal();
//		 gmath.ClickNumbersOnly();
//		 gmath.ClickwithVariablesToo();
//		 gmath.ClickReduce();
//		 gmath.ClickAdd();
//		 gmath.ClickSubtract();
//		 gmath.ClickMultiply();
//		 gmath.ClickDevide();
//		 gmath.ClickConvertingF();
//		 gmath.ClickMultiplyWith();
//		 gmath.ClickDevideWith();
//		 gmath.ClickConverting();
//		 
		 
	}
	
}
