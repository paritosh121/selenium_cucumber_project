package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage {
	
	@Test
	public void loginPageCheck() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertTrue(driver.getTitle().contains("Login"));
		driver.findElement(By.id("Email")).sendKeys("askmail@email.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
