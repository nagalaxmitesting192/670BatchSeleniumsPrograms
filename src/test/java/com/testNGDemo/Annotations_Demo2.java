package com.testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Annotations_Demo2 {
	
  @Test
  public void f() {
	System.out.println("@Test annotation f");
  }
  @Test
  public void a() {
	System.out.println("@Test annotation a");
  }
  @BeforeClass
  public void beforeClass() {
	 System.out.println("I am BeforeClass Annotation");
		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am AfterClass Annotation");
  }

}
