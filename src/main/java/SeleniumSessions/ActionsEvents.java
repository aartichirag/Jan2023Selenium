package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(email, "test@gmail.com").build().perform();
		action.sendKeys(pwd, "test23").build().perform();
		action.click(loginBtn).build().perform();
		
		
	}

}
