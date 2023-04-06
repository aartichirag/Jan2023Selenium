package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/signup-hubspot/crm?hubs_signup-cta=login-signup-cta&hubs_signup-url=app.hubspot.com%2Flogin&uuid=656711d1-5393-47ff-8e29-363319b6f527&step=landing_page");
		
		Thread.sleep(2000);

		//1. id
		driver.findElement(By.id("UIFormControl-2")).sendKeys("Tom");
		
		//2.name
		driver.findElement(By.name("LAST_NAME")).sendKeys("Peter");
		driver.findElement(By.name("EMAIL")).sendKeys("test@gmail.com");
		
		//3. XPath: 1)Absolute Xpath 2)Relative Xpath
//		driver.findElement(By.xpath("//*[@id='UIFormControl-2']")).sendKeys("Tom");
		
		//4. CSS Selector:Id[.] dot and Class[#] 
//		driver.findElement(By.cssSelector(".uiButton")).click(); //id for .(dot) used
//		driver.findElement(By.cssSelector("#UIFormControl-2")).sendKeys("Tom"); //class for # used
		
		//5. ClassName
//		driver.findElement(By.className("uiButton")).click();
		
		//6. LinkText [<--->Sign in</--->]
//		driver.findElement(By.linkText("Sign in")).click();
		
		//7. PartialLinkText [means half text]
//		driver.findElement(By.partialLinkText("Privacy")).click();
		
		Thread.sleep(2000);
		String errorText = driver.findElement(By.xpath("//small[contains(@class,'is--text--error')]//i18n-string")).getText();
		System.out.println(errorText);
		
		if(errorText.equals("The email address you entered is still pending verification on an already existing HubSpot account.")){
			System.out.println("Correct err msg");
		}else {
			System.out.println("Incorrect err msg");
		}	
	}	
}

