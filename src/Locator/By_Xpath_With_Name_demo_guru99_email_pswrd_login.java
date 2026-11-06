package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Xpath_With_Name_demo_guru99_email_pswrd_login {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//finding xpath for email and sending input value
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ABC");
		Thread.sleep(1000);
		
		//finding xpath for password and sending input keys
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("ABC");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
