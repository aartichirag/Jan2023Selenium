package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
	
		takePageScreenshot(driver, "LoginPage");
		email.sendKeys("test@gmail.com");
		pwd.sendKeys("test123");
		loginBtn.click();
		
		Thread.sleep(2000);
		takePageScreenshot(driver, "LoginPage1");
		takeElementScreenshot(email, "EmailId");
		takeElementScreenshot(pwd, "Password");
		takeElementScreenshot(loginBtn, "LoginButton");
	}
	
	public static void takePageScreenshot(WebDriver driver, String fileName) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //just took a screenshot
		try {
			//path: (.) dot means current project
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png")); 		
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void takeElementScreenshot(WebElement element, String fileName) {
		File srcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE); //just took a screenshot
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png")); 		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
