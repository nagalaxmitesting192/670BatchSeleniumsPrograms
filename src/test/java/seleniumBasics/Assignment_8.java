package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 8.1. https://us.megabus.com/account-management/login type any dummy values
		 * click on Login button
		 * 
		 * 8.2 OPEN BELOW url USING cHROME BROWSER https://www.pqe.io/go-signup/ TYPE
		 * ALL EDITBOXES VALUE(DUMMY VALUE) ClICK ON CUBMIT BUTTTON
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("emailAddress")).sendKeys("nagalaxmi78@gmail.com");
		driver.findElement(By.id("password")).sendKeys("LaKsc936");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.findElement(By.xpath("//button[@id='login']")).click();
		

	}

}
