package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select =new Select(element);
		select.selectByVisibleText(value);
	}
		
	public static void selectValueFromDropDownByIndex(WebElement element, int value) {
		Select select =new Select(element);
		select.selectByIndex(value);
	}
	
	public static ArrayList<String> getDropDownValues(WebElement element) {
		System.out.println("-----------------");
		Select select =new Select(element);
		List<WebElement> monthList = select.getOptions();
		
		ArrayList<String> ar = new ArrayList<String>(); 
		for(int i=0; i< monthList.size(); i++) {
			String text = monthList.get(i).getText();
			ar.add(text);  
		}
		System.out.println(ar); 
		return ar; 
  }
	
	public static void selectDropDownWithoutSelect(WebDriver driver, String locator, String value) {
		List<WebElement> daysList = driver.findElements(By.xpath(locator));
		
		for(int i=0; i< daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				daysList.get(i).click();
				break;
			}
		}
	}
	
}
