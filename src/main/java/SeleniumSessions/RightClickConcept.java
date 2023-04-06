package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickElement = driver.findElement(By.className("context-menu-one"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		
		//Custom XPath:  //ul/li[contains(@class,  'context-menu-icon-copy')]/span
		
		String text = driver.findElement(By.xpath("/html/body/ul/li[3]")).getText();
		System.out.println(text);
		
		
	}

}
