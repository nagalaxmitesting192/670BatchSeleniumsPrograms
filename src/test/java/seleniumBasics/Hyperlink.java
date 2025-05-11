package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
	/*
	 * Go to URL https://autotestdata.com/ click on footer link 'Need Help?'
	 	 * #lastName
	 */
		 

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://autotestdata.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Need Help?")).click();
	}

}
