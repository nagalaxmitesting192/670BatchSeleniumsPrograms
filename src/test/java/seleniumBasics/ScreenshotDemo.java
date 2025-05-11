package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.pqe.io/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		File abc=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//C:\Users\nagal\eclipse-workspace\seleniumBasics\screenshots     we can use
		//.\\screenshots
		//FileHandler.copy(abc,new File(".\\screenshots\\pqeTest.png"));
	Date d=new Date();
	System.out.println(d);
	DateFormat df;
	df=new SimpleDateFormat("MMMddyyyy-HHmmss");
	String timestamp=df.format(d);
	System.out.println(timestamp);
	FileHandler.copy(abc,new File(".\\screenshots\\pqeTest_"+timestamp+".png"));
	

	
		
	}

}
