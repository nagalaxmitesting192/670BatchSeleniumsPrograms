package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 {

	public static void main(String[] args) {
		/*
		 * CLick on Login button on right top corner Type Email & Password then click on
		 * Login button
		 */
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://podfoods.co/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[4]/div/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[2]/div/div[1]/input")).sendKeys("naglaxmitesting192@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[3]/div/div[1]/input")).sendKeys("Lpv@72mhpt");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[4]/div/div/label[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[5]/div/button")).click();
}
}
