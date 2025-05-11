package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10DOBDowns {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://demo.automationtesting.in/Register.html Date Of Birth choose any
		 * values
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement yearDrop = driver.findElement(By.id("yearbox"));
		Select selectObject = new Select(yearDrop);
		selectObject.selectByContainsVisibleText("1997");
		WebElement MonthDrop = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select selectObject1 = new Select(MonthDrop);
		selectObject1.selectByContainsVisibleText("June");
		WebElement dayrDrop = driver.findElement(By.id("daybox"));
		Select selectObject2 = new Select(dayrDrop);
		selectObject2.selectByContainsVisibleText("8");

	}

}
