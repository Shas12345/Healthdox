package administrativeRisk;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {

	public static void main(String[] args) throws IOException {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("AllTests.html");
		// creating object for extent report
	ExtentReports	extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.createTest("Tc001");
   
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		// TODO Auto-generated method stub

	}

}
