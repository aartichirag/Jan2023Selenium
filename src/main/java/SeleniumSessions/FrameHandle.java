package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement freameElement = driver.findElement(By.name("main"));
		driver.switchTo().frame(freameElement); //webelement used
//		driver.switchTo().frame("main"); //string name used
//		driver.switchTo().frame(2); //index used
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
	}

}
