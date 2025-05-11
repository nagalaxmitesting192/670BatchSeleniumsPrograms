package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment_12AutoTestData {
	@Test
	public void f() throws Exception {
		/*
		 * https://autotestdata.com/ Add creditcard columm using Add More element click
		 * on Excel radio button Type Number of Rows as 100 Click on generate button
		 * Click on download button
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://autotestdata.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		//driver.findElement(By.className("filter-option-inner-inner")).click();
		driver.findElement(By.xpath("//button[@type='button'  and  @title='Select Data Type']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Credit Card']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add']")).click();
		driver.findElement(By.id("exampleRadios10")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='10' and  @placeholder='Enter number']")).clear();
		driver.findElement(By.xpath("//input[@value='10' and  @placeholder='Enter number']")).sendKeys("100");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[@class='btn btn-primary at-btn-background generate-data']")).click();
		driver.findElement(By.xpath("//button[@class='btn bt-primary at-btn-background download-btn']")).click();
		
		// driver.findElement(By.className("btn btn-primary at-btn-background
		// generate-datatotal-rows-gen")).click();

	}
}
