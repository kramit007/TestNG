package loanDepartment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCar {

	@Test
	public void webLoginCarLoan() {
		System.out.println("Web Login Car");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car");
	}

	@Test
	public void loginAPICarLoan() {
		System.out.println("API Login Car");
	}

	@BeforeMethod // it will execute before any test case/method
	public void beforeEachMethod() {
		System.out.println("Execute before execution any method");
	}

	@BeforeClass // it will execute before any test case/method in this class
	public void beforeClass() {
		System.out.println("Execute before execution any method in this class");
	}

	@BeforeTest // it will execute before any test case inside test name = "Car Loan" (depends
				// on xml)
	public void executeBefore() {
		System.out.println("Execute before execution any test case here in test");
	}

	@AfterTest // it will execute after any test case inside test name = "Car Loan" (depends on
				// xml)
	public void executeAfter() {
		System.out.println("it will execute after all test cases are executed in test ");
	}

	@BeforeSuite // it will execute before any test case in the suite
	public void executeFirst() {
		System.out.println("it will execute befor all test cases are executed in test suite ");
	}

	@AfterSuite // it will execute after all test cases are executed form the test suite
	public void executeLast() {
		System.out.println("it will execute after all test cases are executed in the test suite ");
	}

}
