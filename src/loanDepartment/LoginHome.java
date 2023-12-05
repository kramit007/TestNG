package loanDepartment;

import org.testng.annotations.Test;

public class LoginHome {

	@Test(groups = { "Smokes" }) // if we want to run random test cases in different class
	public void webLoginHomeLoan() {
		System.out.println("Web Login Home");
	}

	@Test(dependsOnMethods= {"webLoginHomeLoan()"})  // this method will execute after webLoginHome method and if depends on more then one method just separate by ,
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home");
	}

	@Test(groups = { "Smokes" }) // if we want to run random test cases in different class
	public void loginAPIHomeLoan() {
		System.out.println("API Login Home");
	}

}
