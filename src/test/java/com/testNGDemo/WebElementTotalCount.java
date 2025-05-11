package com.testNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementTotalCount {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  //Get all the Radio buttons
	 List<WebElement> allRadioButtons= driver.findElements(By.xpath("//input[@type='radio']"));
	 System.out.println("AllRdio button count is:"+allRadioButtons.size());
	 //get allEditBoxes
	 List<WebElement> allEditBoxes= driver.findElements(By.xpath("//input"));
	 System.out.println("allEditBoxes count is:"+allEditBoxes.size());
	 //get allButtons
	 List<WebElement> allButtons= driver.findElements(By.xpath("//button"));
	 System.out.println("allButtons count is:"+allButtons.size());
	 //get allCheckBoxes
	 List<WebElement> allCheckBoxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("allCheckBoxes count is:"+allCheckBoxes.size());
	 //get allDropdowns
	 List<WebElement> allDropdowns= driver.findElements(By.xpath("//select"));
	 System.out.println("allDropdowns count is:"+allDropdowns.size());
	 //get allHyperLinks
	 List<WebElement> allHyperLinks= driver.findElements(By.xpath("//a"));
	 System.out.println("allHyperLinks is:"+allHyperLinks.size());
	 //get allImages
	 List<WebElement> allImages= driver.findElements(By.xpath("//img"));
	 System.out.println("allImages count is:"+allImages.size());
	 int TotalCount=allRadioButtons.size()+allEditBoxes.size()+allButtons.size()+allCheckBoxes.size()+allDropdowns.size()+allHyperLinks.size()+allImages.size();
	 System.out.println("WebElemets TotalCount is:"+TotalCount);
	 //
	  
  }
}
