package com.sample.minnu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleWebDriver01 {
	ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/aabhesheke/git/CEIWC-Demo/DemoProject/src/test/resources/Browsers_Binaries/Chrome/chromedriver.exe");
	}
	
	@Test
	public void testcaseo1() throws InterruptedException  {
		
		 driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		By googlename = By.name("q");
		driver.findElement(googlename).sendKeys("testing");
		driver.findElement(By.name("btnG")).click();

		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Software testing - Wikipedia")).click();
		Assert.assertEquals("Software testing - Wikipedia-1", driver.getTitle());
		
		
		System.out.println("Added Space");
	//	System.out.println("Page Title "+driver.getTitle());

	}
	@Test
	public void testcase02() throws InterruptedException  {
		
		 driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		By googlename = By.name("q");
		driver.findElement(googlename).sendKeys("testing");
		driver.findElement(By.name("btnG")).click();

		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Software testing - Wikipedia")).click();
		Assert.assertEquals("Software testing - Wikipedia", driver.getTitle());
	//	System.out.println("Page Title "+driver.getTitle());

	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}