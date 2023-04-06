package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {
	WebDriver driver;
	By username = By.id("username");
	By password = By.id("password");
	By signIn = By.xpath("//*[@id=\"login-form\"]/div/div[7]/button");
	By createAcount = By.linkText("Create account");
//	By account = By.xpath("//*[@id=\"myAccountLink\"]/li/span/div[2]");
	
	//This example use @Parameters 
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite -- prepare test data");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test -- DB connection");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class -- get value from DB");
	}
	
	@BeforeMethod
	@Parameters({"url", "browserName"})
	public void setUp(String url, String browser) throws InterruptedException {
		System.out.println("before method -- setup");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		//Cross browser use
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else {
			System.out.println("Enter a valid Browser name");
		}
		
		driver.get(url);
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void signUpLinkTest(){
		System.out.println("test1");
		Assert.assertTrue(driver.findElement(createAcount).isDisplayed());	
	}
	
	@Test(priority = 1, dependsOnMethods = "signUpLinkTest")
	public void pageTitleTest() {
		System.out.println("test2");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Walmart Canada");
	}
	
	@Test(priority = 3)
	@Parameters ({"username", "password"})
	public void loginTest(String un, String pwd) throws InterruptedException {
		System.out.println("test3");
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signIn).click();
		Thread.sleep(5000);
//		String accountValue = driver.findElement(account).getText();
//		Thread.sleep(3000);
//		Assert.assertEquals(accountValue, "Welcome Arati Patel");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("after method -- tear down");
		driver.quit();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class -- delete all users");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test -- DB disconnection");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite -- test report");
	}

}
