package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Command {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(1000);
		
		//sending info to login text box
		driver.findElement(By.name("email")).sendKeys("Test");
		Thread.sleep(1000);
		
		//sending info to password textbox
		driver.findElement(By.name("pass")).sendKeys("Test");
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_b")).submit();
		Thread.sleep(1000);
		
		driver.close();
		
		

	}

}
