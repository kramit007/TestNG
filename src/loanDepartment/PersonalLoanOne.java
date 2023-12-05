package loanDepartment;

import org.testng.annotations.Test;

public class PersonalLoanOne {
//	To run test cases with TestNG we need to create method with annotation @test
	
	@Test(enabled = false)    // it is used when we already know that test case will fail and don't want to show in result as failed
	public void testOne(){
		System.out.println("Hello TestNG x page 1 personal loan");	
		}
	
//	no need to create another class for different test cases we can create in same class with annotation @Test
	@Test(groups = { "Smokes" }) // if we want to run random test cases in different class   
	public void testSecond() {
		System.out.println("Hello TestNG xx page 1 personal loan");	
	}
	

}
