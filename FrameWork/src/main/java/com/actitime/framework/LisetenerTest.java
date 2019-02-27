package com.actitime.framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisetenerTest implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult r) {
		
	 String testName=r.getMethod().getMethodName();
	 EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
	File srcFile= eDriver.getScreenshotAs(OutputType.FILE);
	File dstFile=new File("./ScreenShot/"+testName+".png");
	try {
		FileUtils.copyFile(srcFile, dstFile);
	} catch (IOException e) {
	System.out.println("Exception");
	}
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
