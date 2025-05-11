package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {
  @Test
  public void f() throws InterruptedException {
	 
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(" https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
//Click ok buttonon alert
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
  }
}
