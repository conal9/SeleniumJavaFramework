//Selenium Framework for beginners 9 & added to in Selenium Framework for Beginners 13 when adding testng.xml file. 
package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webpages.GoogleSearchPageObjects;

public class GoogleSearchPage_TestNG_Demo2 {
	
	private static WebDriver driver = null;
	
	@BeforeTest 
	
	public void setUpTest() { //Settinh up test. Note: https://stackoverflow.com/questions/76477186/selenium-not-requiring-chromedriver
		WebDriver driver = null;
	}
	
	@Test
	public static void googleSearchTest2() { //this function is a test for a basic google search
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObjs = new GoogleSearchPageObjects(driver); //Creating new object of the GoogleSearchPageObjects class. 
		
		
		driver.get("https://www.google.ie");
		searchPageObjs.clickOnReject();
		searchPageObjs.setSearchboxText("Oldtown Woods");
		searchPageObjs.clickSearchButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait
		//driver.close();
	}
	
	@Test
	public static void googleSearchTest3() { //this function is a test for a basic google search
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
