package com.testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BOOKFlightTicket {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
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
		
		/*
		 * WebElement wb = driver.findElement(By.
		 * xpath("//h1[text()='Thank you for your purchase today!']")); String text1 =
		 * wb.getText(); System.out.println(text1); WebElement wb1 =
		 * driver.findElement(By.xpath("//*[text()='Id']")); String text2 =
		 * wb1.getText(); System.out.println(text2); WebElement wb2 =
		 * driver.findElement(By.xpath("//*[text()='1746652319679']")); String text3 =
		 * wb2.getText(); System.out.print(text2 + ":" + text3); WebElement second =
		 * driver.findElement(By.xpath("//*[text()='Status']")); String text4 =
		 * second.getText(); WebElement second2 =
		 * driver.findElement(By.xpath("//*[text()='PendingCapture']")); String text5 =
		 * second2.getText(); System.out.println(text4 + ":" + text5); WebElement third
		 * = driver.findElement(By.xpath("//*[text()='Amount']")); String text6 =
		 * third.getText(); WebElement third2 =
		 * driver.findElement(By.xpath("//*[text()='555 USD']")); String text7 =
		 * third2.getText(); System.out.println(text6 + ":" + text7); WebElement four =
		 * driver.findElement(By.xpath("//*[text()='Card Number']")); String text8 =
		 * four.getText(); WebElement four2 =
		 * driver.findElement(By.xpath("//*[text()='xxxxxxxxxxxx1111']")); String text9
		 * = four2.getText(); System.out.println(text8 + ":" + text9); WebElement five =
		 * driver.findElement(By.xpath("//*[text()='Expiration']")); String text10 =
		 * five.getText(); System.out.println(text10); //// *[text()='11/2018']
		 * WebElement six = driver.findElement(By.xpath("//*[text()='Auth Code']"));
		 * String text12 = six.getText(); WebElement six2 =
		 * driver.findElement(By.xpath("//*[text()='888888']")); String text13 =
		 * six.getText(); System.out.println(text12 + ":" + text13);
		 * 
		 * WebElement seven = driver.findElement(By.xpath("//*[text()='Date']")); String
		 * text14 = six.getText(); System.out.println(text12 + ":" + text13); WebElement
		 * seven2 =
		 * driver.findElement(By.xpath("//*[text()='Wed, 07 May 2025 22:35:19 +0000']"))
		 * ; String text15 = six.getText(); System.out.println(text14 + ":" + text15);
		 */
		
	}

}
