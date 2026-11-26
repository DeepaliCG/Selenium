package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_practice {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		
//		action.keyDown(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
		
		WebElement img_a = driver.findElement(By.id("column-a"));
		Thread.sleep(2000);
		
		WebElement img_b = driver.findElement(By.id("column-b"));
		Thread.sleep(2000);
		
		
		action.dragAndDrop(img_a, img_b).perform();
		Thread.sleep(2000);
		

	}

}
