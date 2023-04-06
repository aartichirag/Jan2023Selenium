package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
        driver.findElement(By.name("proceed")).click();
        
        Thread.sleep(2000); //milliseconds
        
        //Handle JavaScript Alert class
        Alert alert = driver.switchTo().alert(); 
        System.out.println(alert.getText());
//      alert.accept(); // alert popup open and "Ok" button     
//      alert.dismiss(); // alert popup open and "cancel" button        
        
        //part of real testing:
        
        String text = alert.getText();
        if(text.equals("Please enter a valid user name")) {
        	System.out.println("It's a correct popup");
        } 
        else {
        	System.out.println("Incorrect popup");
        }
	}

}
