package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");
		
		Thread.sleep(2000);
		
		By email = By.id("username");
		By pwd = By.id("password");
		By loginBtn =By.id("loginBtn");
		
		LoginUtil util = new LoginUtil(driver);
		util.doSendKeys(email, "test@gmail.com");
		util.doSendKeys(pwd, "test@123");
		util.doClick(loginBtn);

	}

}
