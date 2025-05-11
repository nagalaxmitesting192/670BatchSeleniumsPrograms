package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Go to URL https://www.pqe.io/go-signup/ Click on 'terms & conditions' link on
		 * bottom of the page
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.pqe.io/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms and Conditions")).click();

	}

}
