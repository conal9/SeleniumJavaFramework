package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects { //Class to locate the objects on the page
	
	WebDriver driver = null;
	
	By searchbox = By.xpath("//*[@id=\"APjFqb\"]"); //Find the searchbox
	By search_button = By.xpath("//*[@id=\"APjFqb\"]");	//Find the search button
	
	public GoogleSearchPageObjects(WebDriver driver) { //constructor
		this.driver = driver; //?
	}
	
	//Below are the actions to be taken on the above objects.
	public void clickOnReject() {
		driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click(); //click on reject
	}
	
	
	public void setSearchboxText(String searchText) { //Function to enter text into the search box 
		
		driver.findElement(searchbox).click();
		driver.findElement(searchbox).sendKeys(searchText); //finds the search box from the locator above
	}
	
	public void clickSearchButton() { //function to hit enter (on the search button)
		
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
	
}
