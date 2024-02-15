package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webpages.DemoQAHomepage;
import webpages.DemoQAElementsPage;
import webpages.DemoQAElementsTextBox;

public class DemoQAElementsTextBox_Test {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) {
		elementsTextBox();
		submitAllTextBoxesTest();
	}
	
	public static void elementsTextBox() { //this function will test the Text Box of the 'Elements' section
		driver = new ChromeDriver(); //?
		DemoQAHomepage homepage = new DemoQAHomepage(driver);
		DemoQAElementsPage elementsPage = new DemoQAElementsPage(driver);
		
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click(); //Cookies pop-up - manage options button
		driver.findElement(By.xpath("(//p[@class='fc-button-label'][normalize-space()='Confirm choices'])[1]")).click(); 
		
		homepage.clickOnElements();
		elementsPage.clickOnTextBoxLink();
	} 
	
	public static void submitAllTextBoxesTest() {
		DemoQAElementsTextBox textbox = new DemoQAElementsTextBox(driver);
		
		textbox.fullName("Firstname Surname");
		textbox.emailTextbox("email@host.com");
		textbox.currentAddress("123 Street Name, City Name, County, Eircode");
		textbox.permanentAddress("123 Street Name, City Name, County, Eircode");
		textbox.clickSubmitButton();
	}
}


