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
	}
	
	public static void elementsTextBox() { //this function will test the Text Box of the 'Elements' section
		driver = new ChromeDriver();
		DemoQAHomepage homepage = new DemoQAHomepage(driver);
		DemoQAElementsPage elementsPage = new DemoQAElementsPage(driver);
		DemoQAElementsTextBox textBox = new DemoQAElementsTextBox(driver);
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click(); //Cookies pop-up - manage options button
		driver.findElement(By.xpath("(//p[@class='fc-button-label'][normalize-space()='Confirm choices'])[1]")).click();
		
		/*driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[9]")).click();
		driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[11]")).click();
		driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[13]")).click();
		driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[15]")).click();
		driver.findElement(By.xpath("(//span[@class='fc-slider-el'])[17]")).click();
		driver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
		//river.findElement(By.xpath("//p[@class='fc-navigation-button-label']")).click();
		System.out.println("click2");
		//List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox' and @ariaPressed='true']")); //doesn't work
		//List<WebElement> elements = driver.findElements(By.className("fc-slider-el")); 		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		for (WebElement element : elements) {
			element.click();
		} 
		*/  
		homepage.clickOnElements();
		elementsPage.clickOnTextBoxLink();
		textBox.enterFullName("Conal Honey");
		textBox.clickSubmitButton();
	} 
}


