package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Linktext_Facebook {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//clicking on Forgotten password? link
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		

	}

}
