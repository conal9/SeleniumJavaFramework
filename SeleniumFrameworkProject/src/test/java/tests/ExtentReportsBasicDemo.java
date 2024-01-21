//Selenium Framework for beginners 10
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo { //HTML Reporting library. Open Source API creating interactive HTML reports of your test session
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		//Create ExtentReports and attach reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//Defines a test. You can add logs, snapshots, assign author and categories to a test and its children.
		ExtentTest test1 = extent.createTest("Google Search Test 1","this is a basic google search functionality test");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.ie"); 
		test1.pass("Navigated to google.ie");
		
		driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click(); //click on reject
		test1.pass("Clicked on Reject on Cookies pop-up");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Automation"); //Find the searchbox //
		test1.pass("Entered text in the search box");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
		test1.pass("Clicked on Google Search button");
		
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		//calling flush writes everything to the log file 
		extent.flush();
		
	}

}
