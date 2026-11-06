package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Partiallinketext_demoqa_Home {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//opening url
		driver.get("https://demoqa.com/links");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.partialLinkText("Home")).click();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
