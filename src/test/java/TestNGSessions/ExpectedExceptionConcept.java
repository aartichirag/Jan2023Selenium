package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

//	@Test(expectedExceptions = ArithmeticException.class)
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class}) //Multiple Exception class
//	@Test(expectedExceptions = {Exception.class}) //exception class parent to other exception class handling
//	@Test(expectedExceptions = {Throwable.class}) //Super class
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
		System.out.println("after test");
	}
}
