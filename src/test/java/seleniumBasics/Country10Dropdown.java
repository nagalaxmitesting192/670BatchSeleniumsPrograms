 package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country10Dropdown {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Go to URL https://www.pqe.io/go-signup/ select any country name from Country
		 * of Citizenship * select "Student Looking for Graduate Degree" option from the
		 * "I am a *" dropdwon select DOB "15Aug1947"
		 */
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement coutrtDd=driver.findElement(By.id("country"));
		Select selectObject=new Select(coutrtDd);
		selectObject.selectByVisibleText("ALGERIA");
		WebElement attendeeType=driver.findElement(By.name("attendeeType"));
		Select selectObject1=new Select(attendeeType);
		//Select iAma=new Select(driver.findElement(By.name("attendeeType"));
		//iAma.selectByVisibleText("High School Student/Future Undergraduate Student");
		selectObject1.selectByVisibleText("High School Student/Future Undergraduate Student");
		WebElement DobMonth=driver.findElement(By.id("questions_16_Month"));
		Select selectObject2=new Select( DobMonth);
		selectObject2.selectByVisibleText("June");
		WebElement DobDay=driver.findElement(By.id("questions_16_DayOfMonth"));
		Select selectObject3=new Select( DobDay);
		selectObject3.selectByVisibleText("10");
		WebElement DobYear=driver.findElement(By.id("questions_16_DOBYear"));
		Select selectObject4=new Select( DobYear);
		selectObject4.selectByVisibleText("1995");
		Thread.sleep(3000);
		//Click on multiselect
		driver.findElement(By.className("multiselect")).click();
		driver.findElement(By.id("questions[q_19][0]")).click();
		driver.findElement(By.id("questions[q_19][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("multiselect")).click();
		
		
		
		
		
		
	}

}
