package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.popupcheck.com/advanced-pop-up-test.asp");
		driver.findElement(By.linkText("(2) “onUnLoad” Pop Up Stopper Test")).click();
		Thread.sleep(3000);
		
		//window handle
		Set<String> handler = driver.getWindowHandles();
		
		//set doesn't store values on basis of index number
		//to get those value from set obj -- Iterator is used
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parentWindowId:" + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("childWindowId:" + childWindowId);
//		driver.close(); //close the child window
		
		driver.switchTo().window(parentWindowId);
		driver.getTitle();

		
	}

}
