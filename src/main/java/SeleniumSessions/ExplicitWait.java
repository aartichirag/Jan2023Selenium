package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");

		//Explicit wait : All the elements on driver
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
//		
//		By email = By.id("username");
//		WebDriverWait wait = new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		driver.findElement(email).sendKeys("test@gmail.com");
	}

}
