package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsTextBox { //Class to locate the objects on the page https://demoqa.com/text-box
	
	WebDriver driver = null;
	
	By fullNameTextbox = By.xpath("//input[@id='userName']");
	By emailTextbox = By.xpath("//input[@id='userEmail']");
	By currentAddressTextBox = By.xpath("//textarea[@id='currentAddress']");
	By permanentAddressTextBox = By.xpath("//textarea[@id='permanentAddress']");
	By submitButton = By.xpath("//button[@id='submit']");
			
	public DemoQAElementsTextBox(WebDriver driver) { //constructor
		this.driver = driver; //?
	}
	
	//Below are the actions to be taken on the above objects.
	public void fullName(String fullName) { 
		driver.findElement(fullNameTextbox).click();
		driver.findElement(fullNameTextbox).sendKeys(fullName);
	}
	
	public void emailTextbox(String emailAddress) {
		driver.findElement(emailTextbox).click();
		driver.findElement(emailTextbox).sendKeys(emailAddress);
	}
	
	public void currentAddress(String currentAddress) {
		driver.findElement(currentAddressTextBox).click();
		driver.findElement(currentAddressTextBox).sendKeys(currentAddress);
	}
	
	public void permanentAddress(String permanentAddress) {
		driver.findElement(permanentAddressTextBox).click();
		driver.findElement(permanentAddressTextBox).sendKeys(permanentAddress);
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
	
	
	
	
}
