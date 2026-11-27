package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver_example_amazone {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement account_list_ele = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		action.moveToElement(account_list_ele).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.className("nav-text")).click();
		Thread.sleep(1000);
		

	}

}
