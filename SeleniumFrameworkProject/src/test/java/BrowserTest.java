import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Initialising the webdriver instance
		
		driver.get("https://www.google.ie");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		//driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchbox.sendKeys("Celbridge");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		
		//driver.close();
		
	}

}
//