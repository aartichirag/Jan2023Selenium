package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open source automation tool -- No license
		//Available in form of APIs
		//Java, c#, php, pearl, Ruby, .NET, Python, JavaScript
		//Windows or desktop application [Not use for test]
		//Supports only browser applications
		//Chrome, FF, Opera, IE, Safari
		//ThoughWorks is releasing upgrades
		
		
		
		WebDriverManager.chromedriver().setup(); //Setup chromedriver
		WebDriver driver = new ChromeDriver(); //Top casting 
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();  //sessionID = null
		
//		driver.close(); //sessionID = Invalid
		
		
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
	}

}
