package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	/*Before - @BS, @BT, @BC, @BM
	 *Test -   @Test
	 *After -  @AM, @AC, @AT, @AS
	 */

	/* 
	 * Execution process:
	 * BS
	 * BT
	 * BC
	 * BM  
	 * T1 - Every test execute both annotation "@BeforeMethod" and "@AfterMethod"
	 * AM
	 * BM 
	 * T2
	 * AM
	 * AC
	 * AT
	 * AS
	 */
	
	@BeforeSuite
	public void setUp() {
		System.out.println("before suite -- prepare test data");
	}
	
	@BeforeTest
	public void connectDB() {
		System.out.println("before test -- DB connection");
	}
	
	@BeforeClass
	public void getValue() {
		System.out.println("before class -- get value from DB");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("before method -- login");
	}

	@Test
	public void googleTitleTest(){
		System.out.println("test -- google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("test -- search test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("after method -- logout");
	}
	
	@AfterClass
	public void deleteCookies() {
		System.out.println("after class -- delete all cookies");
	}
	
	@AfterTest
	public void disconnectDB() {
		System.out.println("after test -- DB disconnection");
	}
	
	@AfterSuite
	public void testReport() {
		System.out.println("after suite -- test report");
	}
}
