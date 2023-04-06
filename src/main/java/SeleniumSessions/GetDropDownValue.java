package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValue {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
			
		WebElement month =driver.findElement(By.id("month"));
		WebElement day =driver.findElement(By.id("day"));
		WebElement year =driver.findElement(By.id("year"));
		
		//1st way
		
//		Select select =new Select(month);
//		List<WebElement> monthList = select.getOptions();	
//		for(int i=0; i< monthList.size(); i++) {
//			String text = monthList.get(i).getText();
//			System.out.println(text);
//		}
		
		//2nd way:
		getDropDownValues(month);
		getDropDownValues(day);
		getDropDownValues(year);
		
	}
	
		//2nd way
	public static ArrayList<String> getDropDownValues(WebElement element) {
		System.out.println("-----------------");
		Select select =new Select(element);
		List<WebElement> monthList = select.getOptions();
		
		ArrayList<String> ar = new ArrayList<String>(); //3rd way:- add this line
		for(int i=0; i< monthList.size(); i++) {
			String text = monthList.get(i).getText();
//			System.out.println(text);
			ar.add(text);  //3rd way:- add this line
		}
		System.out.println(ar); //3rd way:- add this line
		return ar; ////3rd way:- add this line
}

}
