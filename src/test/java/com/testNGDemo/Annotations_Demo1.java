package com.testNGDemo;

import org.testng.annotations.Test;

public class Annotations_Demo1 {
  @Test
  public void a() {
	  System.out.println("I am a test annotation");
  }
  @Test
	  public void f() {
		  System.out.println("I am f test annotation");
	  }
  @Test
		  public void b() {
			  System.out.println("I am b test annotation");
  }
}
