package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.ExtentreportsNG;
import resource.base;

public class Listeners extends base implements ITestListener {
	
	
     ExtentTest test;
	
	ExtentReports extent=ExtentreportsNG.getExtentreports();
	
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	@Override
     public void onTestStart(ITestResult result) {
	
	    test= extent.createTest(result.getMethod().getMethodName());
	    extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test passed");
	}

	


	@Override
	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		
		String testMethodName=result.getMethod().getMethodName();
		
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			
		}
		
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShot(testMethodName,driver),result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();

	
	}

}
