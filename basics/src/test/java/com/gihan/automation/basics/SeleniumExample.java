package com.gihan.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Tharindu Gihan
 * Unit test for simple web application.
 */
public class SeleniumExample {

	public String baseUrl = "http://mynotes.co.nf/loginForm.php";
	public WebDriver driver;
	
	public String expected = null;
	public String actual = null;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "Homepage";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 1)
	public void loginTest() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tgihan");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello1234");
		driver.findElement(By.xpath("//input[@id='loginSubmit']")).click();
		
	}

	@AfterMethod
	public void goBackToHomepage() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}