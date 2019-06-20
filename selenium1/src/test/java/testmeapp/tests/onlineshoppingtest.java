package testmeapp.tests;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import testmeapp.utility.drivers;

public class onlineshoppingtest {
	WebDriver driver;
	ExtentTest logger;
	ExtentReports reports;
	
	//@AfterTest
	public void endreportaftertest()
	{
		reports.flush();
	}
	//@AfterMethod
	public void getresultaftermethod()
	{
		
	}
	//@BeforeTest
	public void startreportbeforetest()
	{
		
	}
	@Test(priority = 1)
	public void testregistration()
	{
		 driver= drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("userName")).sendKeys("askmail@email.com");
		driver.findElement(By.id("firstName")).sendKeys("paritosh");
		driver.findElement(By.id("lastName")).sendKeys("kapoor");
		driver.findElement(By.id("password")).sendKeys("uiuiuiuiui");
		driver.findElement(By.id("pass_confirmation")).sendKeys("uiuiuiuiui");
		driver.findElement(By.id("gender")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("paritosh121@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("8800000000");
		driver.findElement(By.id("dob")).sendKeys("25/12/1995");
		driver.findElement(By.id("address")).sendKeys("s-63 bhgugu");
		Select ddsecure=new Select(driver.findElement(By.name("securityQuestion")));
		ddsecure.selectByVisibleText("What is your favour color?");
		driver.findElement(By.id("answer")).sendKeys("yellow");
		
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		
		
		
		
	}
	@Test(priority = 2)
	public void testlogin()
	{
		
			driver.findElement(By.id("userName")).sendKeys("Arjunaaaaa");
			driver.findElement(By.id("password")).sendKeys("Arjun123");
			driver.findElement(By.cssSelector("input[value='Login']")).click();
	}
	@Test(priority = 3)
	public void testcart() throws InterruptedException
	{
		 
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.partialLinkText("All Categories"))).perform();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Electronics")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Head Phone")).click();
			Thread.sleep(3000);
			act.click(driver.findElement(By.partialLinkText("Add to cart"))).perform();
			act.click(driver.findElement(By.partialLinkText("Cart"))).perform();
			act.click(driver.findElement(By.partialLinkText("Checkout"))).perform();
			
			
			
			
		
	}
	@Test(priority = 4)
	public void testpayment() throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[value='Proceed to Pay']")).click();
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.click(driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i"))).perform();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		driver.findElement(By.cssSelector("input[value='PayNow']")).click();
		
		
		
		
		
		
		
		
	}

}
