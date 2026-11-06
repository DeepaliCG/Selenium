package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Xpath_With_ID_demo_guru99_email_pswrd_login {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//finding email basis on name attribute
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("XYZ");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("XYZ");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
