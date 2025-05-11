package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9yperlink {

	public static void main(String[] args) throws Exception {

		/*
		 * 9.2. Go to https://phptravels.com/demo/ Click on About Us link on bottom of
		 * the page
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//Scroll the element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("About Us")));
		//without scrolling directly clicked
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.linkText("About Us")));
		Thread.sleep(3000);
		driver.findElement(By.linkText("About Us")).click();
		
			}

}
