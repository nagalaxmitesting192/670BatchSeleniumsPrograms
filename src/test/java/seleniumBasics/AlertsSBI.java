package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSBI {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://retail.onlinesbi.sbi/retail/login.htm# 1 Clik on 'CONTINUE TO LOGIN'
		 * button click on LOGIN button without fill any test data fields Get the alert
		 * text then click on OK button on Alert
		 */
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(7000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		


	}

}
