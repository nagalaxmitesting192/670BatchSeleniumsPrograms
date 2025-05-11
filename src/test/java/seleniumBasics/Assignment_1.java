package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Assignment-1 =============== 1.1
		 * https://practice.automationtesting.in/my-account/ Type your valid email
		 * address and password Then click on Register button
		 */	
		/*
		 * 2.2 https://practice.automationtesting.in/my-account/ Enter above
		 * credentials(Register details) in Username or email address * Password then
		 * click on Login button
		 */
	WebDriver driver;
	driver=new ChromeDriver();
	/*
	 * driver.get("https://practice.automationtesting.in/my-account/");
	 * driver.manage().window().maximize(); Thread.sleep(3000);
	 * driver.findElement(By.id("reg_email")).sendKeys("nagalax143@gmail.com");
	 * driver.findElement(By.id("reg_password")).sendKeys("Nagalaxmi@12345");
	 * driver.findElement(By.name("register")).click();
	 */	
	driver.get("https://practice.automationtesting.in/my-account/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nagalax143@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nagalaxmi@12345");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	}
	}
