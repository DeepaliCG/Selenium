package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_PartialLinktext_facebook {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//clicking on Forgotten Password link
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
