package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpages.DemoQAHomepage;

public class DemoQA_Elements_TextBox_Test {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) {
		elementsTextBox();
	}
	
	public static void elementsTextBox() { //this function is the actual test for a basic google search
		driver = new ChromeDriver();
		DemoQAHomepage homepage = new DemoQAHomepage(driver);
		
		
		driver.get("https://demoqa.com/");
		homepage.clickOnElements();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait
		//driver.close();
	}
}
