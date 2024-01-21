//Selenium Framework for beginners 11
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo_TestNG {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	
	WebDriver driver;

	@BeforeSuite //TestNG Annotation:  It will run only once, before all tests in the suite are executed.
	public void setUp() { //function to set up the test
		htmlReporter = new ExtentSparkReporter("extent.html"); //setting up the html reporter
		
		//Create ExtentReports and attach reporter
		extent = new ExtentReports(); //setting the new extent report 
		extent.attachReporter(htmlReporter);	//attaching the html reporter
		
	}
	
	@BeforeTest //TestNG Annotation: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
	public void beforeTest() { 
		
		driver = new ChromeDriver();
	}
	
	@Test  //TestNG Annotation
	public void test1() throws Exception {
		ExtentTest test1 = extent.createTest("Google Search Test 1","this is a basic google search functionality test");
		
		
		driver.get("https://www.google.ie");
		test1.pass("Navigated to google.ie");
		
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		test1.info("This step shows usage of info");
		test1.fail("Details", MediaEntityBuilder.createScreenCaptureFromPath("sreenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
				
	}
	
	@AfterTest //TestNG Annotation
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Done");
	}
	
	@AfterSuite
	public void tearDownSuite() {
		extent.flush();
	}
}
