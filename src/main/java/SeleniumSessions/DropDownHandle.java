package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		
		//use select class for select html tag
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		
		// 1st way: selectByVisibleText
		WebElement month =driver.findElement(By.id("month"));
		WebElement day =driver.findElement(By.id("day"));
		WebElement year =driver.findElement(By.id("year"));
		
		//1st way: selectByVisibleText
		
//		Select select =new Select(month);
//		select.selectByVisibleText("Nov");
	
//		Select select1 =new Select(day);
//		select1.selectByVisibleText("11");

//		Select select2 =new Select(year);
//		select2.selectByVisibleText("1993");
		
		//2nd way: selectByValue
		
//		selectValueFromDropDownByText(month, "Nov");
//		selectValueFromDropDownByText(day, "11");
//		selectValueFromDropDownByText(year, "1993");
		
		
		//3rd way: selectByIndex
		
		selectValueFromDropDownByIndex(month, 11);
		selectValueFromDropDownByIndex(day, 27);
		selectValueFromDropDownByIndex(year, 2);
		
	}
	
		//2nd way: selectByValue
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select =new Select(element);
		select.selectByVisibleText(value);
	}
		//3rd way: selectByIndex
	public static void selectValueFromDropDownByIndex(WebElement element, int value) {
		Select select =new Select(element);
		select.selectByIndex(value);
	}

}

