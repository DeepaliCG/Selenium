package Wait_Example;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit_hyrtutorials {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
		
		driver.findElement(By.id("btn1")).click();
//		Thread.sleep(5000);
		
		driver.findElement(By.id("txt1")).sendKeys("Test");
		
		
		driver.findElement(By.id("btn2")).click();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
		
		driver.findElement(By.id("txt2")).sendKeys("ABC");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
