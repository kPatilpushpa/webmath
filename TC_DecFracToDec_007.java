package com.webmath.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;
public class TC_DecFracToDec_007 
{
	public static WebDriver driver;
	public Workbook wb; 
	public Sheet sh;
	@BeforeTest 	
	public void launchApp() {					
		System.setProperty("webdriver.chrome.driver", "D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ChromeDriver\\chromedriver.exe"); 													
		driver = new ChromeDriver();													
		driver.get("https://www.webmath.com/index.html");													
		driver.manage().window().maximize();													
	}
	@AfterTest		
	public void closeApp() { 		
	driver.close();		
	}		
	@Test						
	public void validationApp() {		
		try {
			FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Decimal.xls");		
			try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
				HSSFSheet s1 = wb1.getSheet("Sheet2");
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		Thread.sleep(3000);	
		WebElement ftod = driver.findElement(By.xpath(s1.getRow(2).getCell(1).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(ftod).click().perform();
		WebElement ftdtop = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
		ftdtop.clear();
		Thread.sleep(3000);	
		ftdtop.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement ftdbtm = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		ftdbtm.clear();
		Thread.sleep(3000);	
		ftdbtm.sendKeys("32");	
		Thread.sleep(3000);
		WebElement ftd = driver.findElement(By.xpath(s1.getRow(5).getCell(1).getStringCellValue()));
		ftd.clear();
		Thread.sleep(3000);	
		ftd.sendKeys("3");	
		Thread.sleep(3000);
		WebElement covit = driver.findElement(By.xpath(s1.getRow(6).getCell(1).getStringCellValue()));
		covit.click();
			}
		Thread.sleep(10000);	
		}
		catch (Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\FractiontoDecimal.png"));	
		} catch (IOException e1) {
			e1.printStackTrace();										
}
}
	}
}