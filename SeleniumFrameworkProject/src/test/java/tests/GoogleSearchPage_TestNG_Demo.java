//Selenium Framework for beginners 9
package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import webpages.GoogleSearchPageObjects;

public class GoogleSearchPage_TestNG_Demo {
	
	
	
	private static WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest 
	
	public void setUpTest() { //Setting up test. Note: https://stackoverflow.com/questions/76477186/selenium-not-requiring-chromedriver
		
		PropertiesFile.getProperties();
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public static void googleSearchTest() { //this function is a test for a basic google search
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObjs = new GoogleSearchPageObjects(driver); //Creating new object of the GoogleSearchPageObjects class. 
		
		
		driver.get("https://www.google.ie");
		searchPageObjs.clickOnReject();
		searchPageObjs.setSearchboxText("Oldtown Woods");
		searchPageObjs.clickSearchButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait
		//driver.close();
	}
	
	@AfterTest
	public void tearDownTest() {
		//Close the browser
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
