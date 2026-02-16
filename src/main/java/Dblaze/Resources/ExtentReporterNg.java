package Dblaze.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {
	public static ExtentReports getReportObject()
	{
		//Step1 -Create string path
		String path = System.getProperty("user.dir")+"\\reports+\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Web Results");
		reporter.config().setReportName("TestResults");
		ExtentReports extent = new ExtentReports();
		extent.setSystemInfo("Testter", "Vinay");
		extent.attachReporter(reporter);
		return extent;
	}

}
