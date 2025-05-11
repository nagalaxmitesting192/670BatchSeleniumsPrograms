package com.testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("browserName")
	 @BeforeClass
	  public void beforeClass(String browserName) {
		 if(browserName.equalsIgnoreCase("Chrome")) {
			 driver=new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("Firefox")) {
		  driver=new FirefoxDriver();
	  }
		 else if(browserName.equalsIgnoreCase("Edge")) {
			 driver=new EdgeDriver();
		 }
		 else {
			 System.out.println("Please give Browser name as Chrome/ firfox/edge");
		 }
		 driver.manage().window().maximize();
	 }
  @Test
  public void f() throws InterruptedException {
	  driver.get(" https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
//Click ok buttonon alert
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
  }
 

  @AfterClass
  public void afterClass() {
  }

}
