package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign11Alerts {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 11.1 https://demoqa.com/alerts Practice first three Clik me buttons
		 */
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
//Get The alert text
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(7000);
		// driver.findElement(By.id("timerAlertButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", driver.findElement(By.id("confirmButton")));
		//driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000); 
		System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().dismiss();
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].click();",driver.findElement(By.id("promtButton")));
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 

	}

}
