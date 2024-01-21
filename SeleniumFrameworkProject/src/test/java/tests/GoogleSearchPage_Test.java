package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpages.GoogleSearchPageObjects;

public class GoogleSearchPage_Test {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() { //this function is a test for a basic google search
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObjs = new GoogleSearchPageObjects(driver); //?
		
		
		driver.get("https://www.google.ie");
		searchPageObjs.clickOnReject();
		searchPageObjs.setSearchboxText("Oldtown Woods");
		searchPageObjs.clickSearchButton();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait
		//driver.close();
	}
}
