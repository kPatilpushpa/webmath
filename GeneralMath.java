package com.webmath.Objects;

//import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import bsh.This;

public class GeneralMath 
{
	WebDriver driver;
	//By url=By.linkText("webmath url");
	@FindBy(linkText ="webmath url")
	WebElement WebMATHURL;
	
	//By Gmath =By.xpath("Gmath button");
	@FindBy(xpath ="Gmath button")
	WebElement Gmath;
	
	
	//Identifications for Number section
	//By Factor=By.xpath("factor");
	@FindBy(xpath ="factor")
	WebElement Factor;
	
	//By GCF=By.xpath("gcf");
	@FindBy(xpath ="gcf")
	WebElement GCF;
	
	//By LCM=By.xpath("lcm");
	@FindBy(xpath ="lcm")
	WebElement LCM;
	
	//By Pronouncing=By.xpath("pronouncing");
	@FindBy(xpath ="pronouncing")
	WebElement Pronouncing;
	
	//Identifications for Decimals
	//By FractionToDecimal=By.xpath("fraction to decimal");
	@FindBy(xpath ="fraction to decimal")
	WebElement FractionToDecimal;
	
	//By DecimalToFraction=By.xpath("decimal to fraction");
	@FindBy(xpath ="decimal to fraction")
	WebElement DecimalToFraction;
	
	//Identification for Number Crunching
	//By NumbersOnly=By.xpath("numbers only");
	@FindBy(xpath ="numbers only")
	WebElement NumbersOnly;
	
	//By WithVariablesToo=By.xpath("with variables too");
	@FindBy(xpath ="with variables too")
	WebElement WithVariablesToo;
	
	//Identifications for fractions 
	//By Reduce=By.xpath("reduce");
	@FindBy(xpath ="reduce")
	WebElement Reduce;
	
	//By Add=By.xpath("add");
	@FindBy(xpath ="add")
	WebElement Add;
	
	//By Subtract=By.xpath("subtract");
	@FindBy(xpath ="subtract")
	WebElement Subtract;
	
	//By Multiply=By.xpath("multiply");
	@FindBy(xpath ="multiply")
	WebElement Multiply;
	
	//By Devide=By.xpath("devide");
	@FindBy(xpath ="devide")
	WebElement Devide;

	//By ConvertingF=By.xpath("convertingf");
	@FindBy(xpath ="converingf")
	WebElement ConvertingF;
	
	//Identifications for Scientific Notation
	//By MultiplyWith=By.xpath("multiply with");
	@FindBy(xpath ="multiply with")
	WebElement MultiplyWith;
	
	//By DevideWith=By.xpath("devide with");
	@FindBy(xpath ="devide with")
	WebElement DevideWith;
	
	//By Converting=By.xpath("converting");
	@FindBy(xpath ="converting")
	WebElement Converting;
	
	GeneralMath(WebDriver d)
	{
		//this.driver=driver
		driver=d;
		PageFactory.initElements((SearchContext) this,d);
	}
	public void clickURL()
	{
		WebMATHURL.click();
	}
	
	public void ClickGeneralmath()
	{
		Gmath.click();
	}

	//Methos of Number section
	public void ClickFactor()
	{
		Factor.click();
	}
	
	public void ClickGCF()
	{
		GCF.click();
	}
	
	public void ClickLCM()
	{
		LCM.click();
	}
	
	public void ClickPrououncing()
	{
		Pronouncing.click();
	}
	
	//Methods of Decimals
	public void ClickDeicimalToFraction()
	{
		FractionToDecimal.click();
	}
	
	public void ClickFractionToDecimal()
	{
		FractionToDecimal.click();
	}
	
	//Methods of Number Crunching
	public void ClickNumbersOnly()
	{
		NumbersOnly.click();
	}
	
	public void ClickwithVariablesToo()
	{
		WithVariablesToo.click();
	}
	
	//Methods of Fractions
	public void ClickReduce()
	{
		Reduce.click();
	}
	
	public void ClickAdd()
	{
		Add.click();
	}
	
	public void ClickSubtract()
	{
		Subtract.click();
	}
	
	
	public void ClickMultiply()
	{
		Multiply.click();
	}
	
	public void ClickDevide()
	{
		Devide.click();
	}
	
	
	public void ClickConvertingF()
	{
		ConvertingF.click();
	}
	
	//Methods of Scientific Notation
	public void ClickMultiplyWith()
	{
		MultiplyWith.click();
	}
	
	public void ClickDevideWith()
	{
		DevideWith.click();
	}
	
	public void ClickConverting()
	{
		Converting.click();
	}
	
	
	
	
	
}
