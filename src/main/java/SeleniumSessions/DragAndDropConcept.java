package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//web element to web element
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Actions action =new Actions(driver);
		WebElement sourceFile=driver.findElement(By.id("draggable"));
		WebElement targetFile=driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		action.clickAndHold(sourceFile).moveToElement(targetFile).release().build().perform();
//		action.dragAndDrop(sourceFile, targetFile);
	}

}
