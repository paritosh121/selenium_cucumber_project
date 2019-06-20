package com.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumBasic {

	@Test
	public void testGoogleHomePage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
}
