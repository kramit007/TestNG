package loanDepartment;

import org.testng.annotations.Test;

public class PersonalLoanOne {
//	To run test cases with TestNG we need to create method with annotation @test
	
	@Test
	public void testOne(){
		System.out.println("Hello TestNG x page 1 personal loan");	
		}
	
//	no need to create another class for different test cases we can create in same class with annotation @Test
	@Test
	public void testSecond() {
		System.out.println("Hello TestNG xx page 1 personal loan");	
	}
	

}
