package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");
		
		/*Implicit wait: 
		 * for web elements only
		 * Title of the url is not a web element
		 * It's a global wait
		 * 
		 * Dyanamic Wait:
		 */
		
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Implicitly wait
		System.out.println(driver.getTitle());
		
		//wait for each and every element wait for 3 seconds
		
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); 
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		

	}

}
