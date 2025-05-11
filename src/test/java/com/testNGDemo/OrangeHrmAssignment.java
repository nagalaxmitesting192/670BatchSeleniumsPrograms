package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmAssignment {
	@Test
	public void f() throws InterruptedException {
		/*
		 * date the results using POI.
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login login with
		 * invalid/valid tes 12.2.Create a code to valit data logout (if credentials
		 * were valid)
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.name("username")).sendKeys("nagadrlg");
		 * driver.findElement(By.name("password")).sendKeys("mfkllwpk98");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		 * click();
		 */

		driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  Thread.sleep(3000); driver.findElement(By.xpath(
		 "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		  click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("oxd-userdropdown-name")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Logout")).click();
		 
	}
}
