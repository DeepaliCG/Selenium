package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/");
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//img[@class='banner-image']")).click();
		Thread.sleep(500);
		driver.close();
		
//		//back to home page
//		driver.navigate().back();
//		Thread.sleep(500);
				
		//navigate to home page
		//driver.navigate().to("https://demoqa.com/");
		driver.get("https://demoqa.com/");
		Thread.sleep(500);
		
		//registration page
		driver.navigate().forward();
		Thread.sleep(500);
		
		//back to home page
		driver.navigate().back();
		Thread.sleep(500);
		
		//refresh browser
		driver.navigate().refresh();
		Thread.sleep(500);
		
		driver.close();
	}

}
