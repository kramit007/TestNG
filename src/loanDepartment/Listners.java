package loanDepartment;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is a interface which implements TestNG listeners
public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started" + result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully Finished" + result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed" + result.getName());
		//Screenshot code here
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped" + result.getName());
	}

}
