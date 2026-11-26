package Wait_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_before_dropdowm_click {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		
		//applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		
		
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();		
		
		//applying explicit wait on click of dropdown list
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='hideElement()']")));
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@onclick='hideElement()']")).click();
		
	
		
		

	}

}
