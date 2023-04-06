package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
		
		//HashMap Concept
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login/");

//		Map<String, String> userMap = new HashMap<String, String>();
//		
//		userMap.put("admin", "admin_admin");
//		userMap.put("patient", "tom@gmail.com_test123");
//		userMap.put("doctor", "peter@gmail.com_test@123");
//		
//		driver.findElement(By.id("username")).sendKeys(userMap.get("admin").split("_")[0]);
//		driver.findElement(By.id("password")).sendKeys(userMap.get("admin").split("_")[1]);
		
//		userMap.get("admin").split("_")[0];
//		userMap.get("admin").split("_")[1];
		getUserMap();
		doLogin(driver, getUserMap(), "patient");
		doLogin(driver, getUserMap(), "doctor");
		doLogin(driver, getUserMap(), "admin");				
	}

	public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
		driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get(userKey).split("_")[1]);		
	}
	
	public static Map<String, String> getUserMap() {
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test123");
		userMap.put("doctor", "peter@gmail.com_test@123");
		return userMap;
	}
	
}
