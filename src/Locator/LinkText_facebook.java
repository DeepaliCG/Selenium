package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_facebook {

	public static void main(String[] args)  throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//opening face book
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(1000); 		
		
		//maximizing window
		driver.manage().window().maximize();
		
		//clicking on Forgotten password? link
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		
		
		System.out.println("Navigated to forgot Password Page");
		
		
		System.out.println("Page Title : "+driver.getTitle());
		
		driver.close();
	}		

}
