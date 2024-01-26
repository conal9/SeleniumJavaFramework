package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAHomepage { //Class to locate the objects on the page
	
	WebDriver driver = null;
	
	By elements = By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']");
	By forms = By.xpath("//h5[normalize-space()='Forms']");
	By alertsFrameAndWindows = By.xpath("//div[3]//div[1]//div[2]//*[name()='svg']");
	By widgets = By.xpath("//div[4]//div[1]//div[1]");
	By interations = By.xpath("//div[5]//div[1]//div[3]");
	By bookStoreApplication = By.xpath("//div[6]//div[1]//div[1]");

		
	public DemoQAHomepage(WebDriver driver) { //constructor
		this.driver = driver; //?
	}
	
	//Below are the actions to be taken on the above objects.
	public void clickOnElements() {
		driver.findElement(elements).click();
	}
	
	public void clickOnForms() {
		driver.findElement(forms).click();
	}
	
	public void clickOnAlertsFrameWindows() {
		driver.findElement(alertsFrameAndWindows).click();
	}
	
	public void clickOnWidgets() {
		driver.findElement(widgets).click();
	}
	
	public void clickOnInteractions() {
		driver.findElement(interations).click();
	}
	
	public void clickOnBookStoreApplication() {
		driver.findElement(bookStoreApplication).click();
	}
	
	
	
}
