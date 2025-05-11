package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDetails {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Open any browserType URL: https://demo.automationtesting.in/Register.html
		 * Type First name & email address editboxes Click on Gender radiobutton Check
		 * any Hobbies checkboxes CLick on Submit button
		 */
		
		
		//Create an object for web driver
		WebDriver driver;
//open any browser
		driver=new ChromeDriver();
		//1.Type URL
		driver.get("https://demo.automationtesting.in/Register.html");
		//Maximize the window
		driver.manage().window().maximize();
		//wait
		Thread.sleep(3000);
		//Type First name & email address editboxes
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("NagaLakshmi");
		//driver.findElement(By.tagName("input")).sendKeys("Yadla");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("nagalaxmitesting192@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[2]/label")).click();
	
		
		
	}
}

