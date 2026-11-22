package Assignment_1_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_login {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//sending login ID
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		//sending password
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		
		//clicking on login button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(5000);
		
		//clicking on PIM
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstName")).sendKeys("Deepali");
		Thread.sleep(1000);
		
		driver.findElement(By.name("middleName")).sendKeys("Chetan");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys("Gaikwad");
		Thread.sleep(1000);
		
		//sending employee id
		//driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("123");
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(1000);
		
		
		
		//closing window open by selenium
		driver.close();

	}

}
