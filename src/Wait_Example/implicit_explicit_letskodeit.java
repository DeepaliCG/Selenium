package Wait_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_explicit_letskodeit {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		
		//clicking on hide button
		driver.findElement(By.id("hide-textbox")).click();
//		Thread.sleep(1000);
		
		//clicking on show button
		driver.findElement(By.id("show-textbox")).click();
//		Thread.sleep(1000);
		
		//applying explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("displayed-text")));
		
		
		// -- elementToBeClickable -- before click on button
		
		//sending value to text box when it appears
		driver.findElement(By.id("displayed-text")).sendKeys("Success");
		
		

	}

}
