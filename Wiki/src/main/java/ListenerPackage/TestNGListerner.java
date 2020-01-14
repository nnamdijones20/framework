package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Started and details are "+ result.getName());
		//ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Passed and details are "+ result.getName());
		//ITestListener.super.onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are "+ result.getName());
		//ITestListener.super.onTestFailure(result);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and details are  "+ result.getName());
		//ITestListener.super.onTestSkipped(result);
	}

//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
 
	
}
