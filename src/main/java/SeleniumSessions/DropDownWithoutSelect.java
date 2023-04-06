package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");

		List<WebElement> daysList = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		
		for(int i=0; i< daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);
			
			if(text.equals("3")) {
				daysList.get(i).click();
				break;
			}
		}
		
		//Main code 'DropDownUtil' class:
		
//		String day = "//select[@id='day']/option";
//		String month = "//select[@id='month']/option";
//		String year = "//select[@id='year']/option";
//		
//		DropDownUtil.selectDropDownWithoutSelect(driver, day, "27");
//		DropDownUtil.selectDropDownWithoutSelect(driver, month, "Nov");
//		DropDownUtil.selectDropDownWithoutSelect(driver, year, "1993");
	}

}
