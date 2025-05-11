package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_9 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 8.2 OPEN BELOW url USING cHROME BROWSER https://www.pqe.io/go-signup/ TYPE
		 * ALL EDITBOXES VALUE(DUMMY VALUE) ClICK ON CUBMIT BUTTTON
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(" https://www.pqe.io/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Naga");
		driver.findElement(By.id("lastName")).sendKeys("Yadla");
		driver.findElement(By.id("emailAddress")).sendKeys("nagalpst@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("9856349820");
		driver.findElement(By.id("password")).sendKeys("LaKs9053lo");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("LaKs9053lo");
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.id("country"));
		Select SelectObject = new Select(dropdown);
		/*
		 * SelectObject.selectByIndex(1); SelectObject.selectByValue("DZ");
		 * SelectObject.selectByVisibleText("ANDORRA"); SelectObject.deselectByIndex(2);
		 * 
		 */

		List<WebElement> allAvaliableCountries = SelectObject.getOptions();
		// List<WebElements> allOptions=driver.findElements(By.id("country"));//if we
		// dont want to create select object we can use this

		for (WebElement country : allAvaliableCountries) {
			System.out.println(country.getText());
			if (country.getText().equalsIgnoreCase("ZAMBIA")) {
				country.click();
				Thread.sleep(2000);

			}
		}
		WebElement AttendeeType = driver.findElement(By.name("attendeeType"));
		Select selectObject1 = new Select(AttendeeType);
		List<WebElement> allAvaliableAttendees = selectObject1.getOptions();
		// List<WebElement> allOptions = driver.findElements(By.name("attendeeType"));
		for (WebElement attendeeType : allAvaliableAttendees) {
			System.out.println(attendeeType.getText());
			if (attendeeType.getText().equalsIgnoreCase("Parent")) {
				attendeeType.click();
				Thread.sleep(2000);
			}
		}
		WebElement AnticipatedTerm = driver.findElement(By.id("questions[q_134]"));
		Select selectObject2 = new Select(AnticipatedTerm);
		List<WebElement> allAvalibleAnticipatedTerms = selectObject2.getOptions();
		for (WebElement anticipatedTerm : allAvalibleAnticipatedTerms) {
			System.out.println(anticipatedTerm.getText());
			if (anticipatedTerm.getText().equalsIgnoreCase("Spring 2024")) {
				anticipatedTerm.click();
				Thread.sleep(2000);
			}

		}
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		
		driver.findElement(By.id("submit")).click();;
	}
	
}
