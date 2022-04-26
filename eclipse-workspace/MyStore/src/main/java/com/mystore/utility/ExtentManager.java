package com.mystore.utility;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//public static ExtentHtmlReporter htmlReporter; //htmlreporter is depreciated use in place sparkreporter or use 
// or downgrade to 4.0.9

public class ExtentManager {
	
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() throws IOException {
		//htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport_"+BaseClass.getCurrentTime()+".html");
		ExtentSparkReporter reporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport.html");
		//reporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("OrangeHRM Test Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "MyStoreProject");
		extent.setSystemInfo("Tester", "Hitendra");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	public static void endReport() {
		extent.flush();
	}
}
