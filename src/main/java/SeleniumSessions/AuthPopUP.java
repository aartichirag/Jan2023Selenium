package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUP {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		//1st way: direct pass username and password to url [ex: admin:admin]
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		//2nd way:
		String username = "admin";
		String password = "admin";
		
		driver.get("https://" +username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
