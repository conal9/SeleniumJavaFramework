package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsPage { //Class to locate the objects on the page
	
	WebDriver driver = null;
	
	By textBox = By.xpath("//span[normalize-space()='Text Box']");
	By checkBox = By.xpath("//span[normalize-space()='Check Box']");
	By radioButton = By.xpath("//span[normalize-space()='Radio Button']");
	By webTables = By.xpath("//span[normalize-space()='Web Tables']");
	By buttons = By.xpath("//span[normalize-space()='Buttons']");
	By links = By.xpath("//span[normalize-space()='Links']");
	By brokenLinks = By.xpath("//span[normalize-space()='Broken Links - Images']");
	By uploadAndDownload = By.xpath("//span[normalize-space()='Upload and Download']");
	By dynamicProperties = By.xpath("//span[normalize-space()='Dynamic Properties']");

		
	public DemoQAElementsPage(WebDriver driver) { //constructor
		this.driver = driver; //?
	}
	
	//Below are the actions to be taken on the above objects.
	public void clickOnTextBoxLink() {
		driver.findElement(textBox).click();
	}
	
	public void clickOnCheckBoxLink() {
		driver.findElement(checkBox);
	}
	
	public void clickOnRadioButtonLink() {
		driver.findElement(radioButton);
	}
	
	public void ClickOnwebTablesLink() {
		driver.findElement(webTables);
	}
	
	public void clickOnButtonsLink() {
		driver.findElement(buttons);
	}
	
	public void clickOnLinksLink() {
		driver.findElement(links);
	}
	
	public void clickOnBrokenLinksLink() {
		driver.findElement(brokenLinks);
	}
	
	public void clickOnUploadAndDownloadsLink() {
		driver.findElement(uploadAndDownload);
	}
	
	public void clickOnDynamicPropertiesLink() {
		driver.findElement(dynamicProperties);
	}
	
	
	
	
}
