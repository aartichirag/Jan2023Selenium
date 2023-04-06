package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtil {
	
	WebDriver driver;
	
	//use constructor
	public LoginUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element = driver.findElement(locator);
		} catch(Exception e) {
			System.out.println("Exception while finding element");
			e.printStackTrace();
		}
		return element;
	}
	
	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
			} catch(Exception e) {
				System.out.println("Exception while sending values to element");
				e.printStackTrace();
			}
	}
	
	public void doClick(By locator) {
		try {
			getElement(locator).click();
			} catch(Exception e) {
				System.out.println("Exception while clicking element");
				e.printStackTrace();
			}
	}

}
