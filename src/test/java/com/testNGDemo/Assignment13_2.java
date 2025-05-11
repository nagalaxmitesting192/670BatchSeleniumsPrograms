package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment13_2 {
	@Test
	public void f() throws Exception {
		/*
		 * 11.2 https://crontab.guru/ Prepare the xpath for '(non-standard)' near
		 * to @weekly element next
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://crontab.guru/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
WebElement wb=driver.findElement(By.xpath("//*[text()='@weekly']"));
String st=wb.getText();
System.out.println(st);
WebElement wb1=driver.findElement(By.xpath(" //*[text()='(non-standard)']"));
String st1=wb1.getText();
System.out.println(st1);

	}

}
