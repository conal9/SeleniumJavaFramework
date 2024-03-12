package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webpages.DemoQAHomepage;
import webpages.DemoQAElementsPage;
import webpages.DemoQAElementsTextBox;

public class DemoQAElementsTextBox_Test {
	
	private static WebDriver driver = null;
		
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver(); //?
		DemoQAHomepage homepage = new DemoQAHomepage(driver);
		DemoQAElementsPage elementsPage = new DemoQAElementsPage(driver);
		
		driver.get("https://demoqa.com/");
		homepage.clickOnElements();
		elementsPage.clickOnTextBoxLink();
	}
	
	@Test
	public static void submitAllTextBoxesTest() { //This test is to verify that when all text boxes are correct, user can submit and user input will show in a new area at the bottom of the screen
		DemoQAElementsTextBox textboxPage = new DemoQAElementsTextBox(driver);
		
		textboxPage.fullName("Firstname Surname");
		textboxPage.emailTextbox("email@host.com");
		textboxPage.currentAddress("123 Street Name, City Name, County, Eircode");
		textboxPage.permanentAddress("123 Street Name, City Name, County, Eircode");
		textboxPage.clickSubmitButton();
	}
	
	@Test
	public static void verifyEmailAddressFormatIsWrong() { //This test is to test that the email text box does not allow erroneous email address formats.
		DemoQAElementsTextBox textboxPage = new DemoQAElementsTextBox(driver);
		
		textboxPage.emailTextbox("x@.com"); //planning later to read in this input from properties file. 
		textboxPage.clickSubmitButton();
	}
	
	@AfterTest
	public void tearDownTest () {
		//close
		driver.close();
		driver.quit();
		
	}
}


