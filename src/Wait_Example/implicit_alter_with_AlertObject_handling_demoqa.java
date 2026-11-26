package Wait_Example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_alter_with_AlertObject_handling_demoqa {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(1000);
		
		//creating an object of alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		Thread.sleep(5000);
//		driver.quit();

	}

}
