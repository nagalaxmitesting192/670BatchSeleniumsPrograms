package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrammarCheckAlerts {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://www.grammarcheck.net/editor/ Click on Clear Editor icon (Delete icon)
		 * Get the confirmation ALert text then click Cancel button.
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(" https://www.grammarcheck.net/editor/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editor-area\"]/div[1]/div[3]/div[2]/p")).sendKeys("nakalsggeuov");
		Thread.sleep(2000);
		driver.findElement(By.id("clear-1")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

}
