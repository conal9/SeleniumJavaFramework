package tests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click(); //Cookies pop-up
		
		List<WebElement> elements = driver.findElements(By.className("fc-slider-el"));
		//List<WebElement> elements2 = driver.findElements(By.xpath("//input[@aria-pressed='true']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		for (WebElement element : elements) {
			
			if (element.isDisplayed())
				if (element.isSelected())
				
				element.click();
		}
		
		homepage.clickOnElements();
		elementsPage.clickOnTextBoxLink();
		textBox.enterFullName("Conal Honey");
		textBox.clickSubmitButton();
	}
}
//