package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalTextFields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> textFields = driver.findElements(By.xpath("//input[@ type='text']"));
		System.out.println(textFields.size());
		
		//get value out of text field:
		
//		driver.get("https://app.hubspot.com/signup-hubspot/crm?hubs_signup-cta=login-signup-cta&hubs_signup-url=app.hubspot.com%2Flogin&uuid=656711d1-5393-47ff-8e29-363319b6f527&step=landing_page");
//		driver.findElement(By.id("UIFormControl-2")).sendKeys("Tom");
//		System.out.println(driver.findElement(By.id("UIFormControl-2")).getAttribute("value"));
		
	}

}
