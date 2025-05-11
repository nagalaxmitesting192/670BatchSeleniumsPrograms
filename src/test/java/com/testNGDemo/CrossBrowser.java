package com.testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowser {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//select[@name='fromPort'])/option[6]")).click();
		driver.findElement(By.xpath("(//select[@name='toPort'])/option[2]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("NagaLakshmi");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("6275 Redcanyon");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("HighlandsRanch");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Colorado");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("80130");
		driver.findElement(By.xpath("(//select[@id='cardType'])/option[3]")).click();
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("78945624694");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("9");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2016");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).clear();
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("yadla");
		driver.findElement(By.xpath("//input[@id='rememberMe' ]")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		WebElement wb=driver.findElement(By.xpath("(//div[contains(@class,'container')])[3]"));	
	    String text=wb.getText();
	    System.out.println(text);
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver=new EdgeDriver();
	  driver=new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
