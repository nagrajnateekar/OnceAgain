package com.loginpage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners1 extends LoginPage implements ITestListener{

	@Override//will execute before main test start i.e. @Test
	public void onTestStart(ITestResult result) {
		System.out.println("start test method ..."+result.getName());

		
	}

	@Override//will execute as test succeed
	public void onTestSuccess(ITestResult result) {
		System.out.println("passed test method..."+result.getName());

	}

	@Override//will execute as test fails
	public void onTestFailure(ITestResult result) {
		System.out.println("failed test method..."+result.getName());
		TakesScreenshot ss=(TakesScreenshot) driver;
		File file=ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(".//Screenshot//"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override//will execute as test skipped
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped test..."+result.getName());

	
	}

	@Override//will start before starting of test set
	public void onStart(ITestContext context) {
		System.out.println("start test execution(group of classes)..."+context.getName());
	
	}

	@Override//will start after completion of test set
	public void onFinish(ITestContext context) {
		System.out.println("finish test execution(group of classes)..."+context.getName());


	}
	
	

}
