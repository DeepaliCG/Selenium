package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Linktext_demoqa {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new  ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/links");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//clicking on Created link
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
