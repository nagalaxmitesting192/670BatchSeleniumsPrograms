package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assin10_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://blazedemo.com/ Choose first dropdown as Boston then second drodown
		 * value as London.. Click on FindFlights button
		 */

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement arrivaldd = driver.findElement(By.name("fromPort"));
		Select selectObject = new Select(arrivaldd);
		selectObject.selectByVisibleText("Boston");
		WebElement departuredd = driver.findElement(By.name("toPort"));
		Select selectObject1 = new Select(departuredd);
		selectObject1.selectByVisibleText("Dublin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
