package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class changePassword {

	@Test
	public void changePassword1() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Login"));
		driver.findElement(By.id("Email")).sendKeys("askmail@email.com");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		Assert.assertTrue(driver.findElement(By.className("password-recovery-button")).isDisplayed());
		driver.findElement(By.id("Email")).sendKeys("askmail@gmail.com");
		driver.findElement(By.className("password-recovery-button")).click();
	}
}
