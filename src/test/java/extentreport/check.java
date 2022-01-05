package extentreport;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extendReport.ExtentReportManager;

public class check {
	
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	
	@BeforeMethod
	public void startReport() {
		extent=ExtentReportManager.getReport();
		test=extent.createTest("Method Test2");
		//extent=new ExtentReports();//it is an subject //observer and subject are connected
		
		
	}
	@Test
	public void checktabs() 
	{
		test.log(Status.INFO, "Test checking");
		test.log(Status.INFO, "Validate all users");
		test.getStatus();
		test.log(Status.INFO, "Status code is");
		test.log(Status.FAIL, "Failed due to error 500");
	}
	
	@AfterMethod
	public void finish() {
		extent.flush();// it will instruct the Extentreport to write in html page 
	}
}
