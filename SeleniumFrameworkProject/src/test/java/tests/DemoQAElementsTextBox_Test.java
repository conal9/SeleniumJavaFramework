package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpages.DemoQAHomepage;
import webpages.DemoQAElementsPage;
import webpages.DemoQAElementsTextBox;

public class DemoQAElementsTextBox_Test {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) {
		elementsTextBox();
	}
	
	public static void elementsTextBox() { //this function will test the Text Box of the 'Elements' section
		driver = new ChromeDriver();
		DemoQAHomepage homepage = new DemoQAHomepage(driver);
		DemoQAElementsPage elementsPage = new DemoQAElementsPage(driver);
		DemoQAElementsTextBox textBox = new DemoQAElementsTextBox(driver);
		
		driver.get("https://demoqa.com/");
		homepage.clickOnElements();
		elementsPage.clickOnTextBoxLink();
		textBox.enterFullName("Conal Honey");
		textBox.clickSubmitButton();
	}
}
