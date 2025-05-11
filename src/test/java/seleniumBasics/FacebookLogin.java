package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
//Create a object for Web driver
		
		WebDriver driver;
		
		//Open any browser
		driver=new ChromeDriver();
		
//		1.Type url of the application
		
		driver.get("https://www.facebook.com");
		//2.type invalid credentials
		driver.findElement(By.name("email")).sendKeys("nagrra123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Naga@122");
		driver.findElement(By.name("login")).click();
	}

}
