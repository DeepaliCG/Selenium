package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//opening URL
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(500);
		
		//selecting yes option
		driver.findElement(By.id("yes")).click();
		Thread.sleep(500);
		
		//clicking on check button
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(1000);
		
		//closing window
		driver.close();

	}

}
