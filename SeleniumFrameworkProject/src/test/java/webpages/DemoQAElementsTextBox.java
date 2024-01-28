package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsTextBox { //Class to locate the objects on the page
	
	WebDriver driver = null;
	
	By fullNameTextBox = By.xpath("//input[@id='userName']");
	By submitButton = By.xpath("//button[@id='submit']");
			
	public DemoQAElementsTextBox(WebDriver driver) { //constructor
		this.driver = driver; //?
	}
	
	//Below are the actions to be taken on the above objects.
	public void enterFullName(String fullName) {
		driver.findElement(fullNameTextBox).click();
		driver.findElement(fullNameTextBox).sendKeys(fullName);
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
	
	
	
	
}
