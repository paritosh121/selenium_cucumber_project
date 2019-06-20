package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class register {
	@Test
	public void registerPage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		Assert.assertTrue(driver.getTitle().contains("Register"));
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("poorna");
			driver.findElement(By.id("LastName")).sendKeys("Hegde");
			driver.findElement(By.id("Email")).sendKeys("poorna1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("poorna000");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("poorna000");
			driver.findElement(By.id("register-button")).click();
			Assert.assertTrue(driver.findElement(By.className("button-1")).isDisplayed());
				driver.findElement(By.className("register-continue-button")).click();
				Assert.assertTrue(driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed());
					driver.findElement(By.id("newsletter-email")).sendKeys("poorna1234@gmail.com");
					driver.findElement(By.id("newsletter-subscribe-button")).click();
					driver.findElement(By.linkText("Log out")).click();
		}
}
