package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Facebook_Inputs_ByClassName {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(500);
		
		driver.findElement(By.className("inputtext")).sendKeys("ABC");
		Thread.sleep(500);
		
		driver.findElement(By.name("pass")).sendKeys("ABC");
		Thread.sleep(500);
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(500);
		
		driver.close();

	}

}
