package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10) //it means run 10 times 
	public void loginTest() {
		System.out.println("login test");
	}
}
