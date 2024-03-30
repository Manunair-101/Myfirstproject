package day4_18032024;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	   System.out.println("On Test Execution Start: "+result.getName());
	  }

	 
	public void onTestSuccess(ITestResult result) {
		 System.out.println("On Test Succesfully Passed: "+result.getName());
	  }

	public void onTestFailure(ITestResult result) {
		 System.out.println("On Test Failed : "+result.getName());
	  }

	 
	public void onTestSkipped(ITestResult result) {
		 System.out.println("When Test got Skipped: "+result.getName());
	  }

	 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	 
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	public void onStart(ITestContext context) {
		 System.out.println("On Execution Start: ");
	  }

	  
	public void onFinish(ITestContext context) {
		 System.out.println("On Execution Ends: ");
	  }

}
