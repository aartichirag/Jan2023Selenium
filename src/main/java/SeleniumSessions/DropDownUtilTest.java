package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUtilTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
			
		WebElement month =driver.findElement(By.id("month"));
		WebElement day =driver.findElement(By.id("day"));
		WebElement year =driver.findElement(By.id("year"));
		
		DropDownUtil.getDropDownValues(month);
		DropDownUtil.getDropDownValues(day);
		DropDownUtil.getDropDownValues(year);
		
		String date ="27-Nov-1993";
		String dateVal[] = date.split("-");
		
		DropDownUtil.selectValueFromDropDownByText(day, dateVal[0]);
		DropDownUtil.selectValueFromDropDownByText(month, dateVal[1]);
		DropDownUtil.selectValueFromDropDownByText(year, dateVal[2]);
		
	}

}
