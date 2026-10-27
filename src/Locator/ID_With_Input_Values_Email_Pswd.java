package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_With_Input_Values_Email_Pswd {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//opening URL
		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(500);
		
		//maximize window
		driver.manage().window().maximize();
		
		//enter value of Email ID
		driver.findElement(By.id("email")).sendKeys("ABC");
		Thread.sleep(1000);
		
		//enter Password
		driver.findElement(By.id("pass")).sendKeys("ABC");
		Thread.sleep(1000);
		
		//Click on login
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(1000);
		
		//closing window
		driver.close();

	}

}
