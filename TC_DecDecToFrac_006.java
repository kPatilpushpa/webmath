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
public class TC_DecDecToFrac_006 
{
	public static WebDriver driver;
	public Workbook wb; 
	public Sheet sh;
	@BeforeTest 	
	public void launchApp()  {					
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
			HSSFSheet s1 = wb1.getSheet("Sheet1");	
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		Thread.sleep(3000);	
		WebElement dtof = driver.findElement(By.xpath(s1.getRow(1).getCell(2).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(dtof).click().perform();
		WebElement dtf = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
		dtf.sendKeys("2.32");	
		Thread.sleep(3000);	
		WebElement covit = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		covit.click();
		}
			Thread.sleep(10000);
		}
	catch (Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\DecimaltoFraction.png"));	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}	
	}
}