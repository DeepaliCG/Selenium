package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/login?ret=/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.id("1")).sendKeys("9876543219");
		Thread.sleep(500);
		
//		driver.findElement(By.xpath("//button[@class='xqOMQN FFO0ui']")).click();
//		Thread.sleep(500);
		
		driver.close();

	}

}
