package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_demo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		
		action.keyDown(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		
		//?????how to select image
		WebElement source_img = driver.findElement(By.id("mongo"));
		Thread.sleep(2000);
		
		WebElement dest_img = driver.findElement(By.id("droparea"));
		Thread.sleep(2000);
		
		action.dragAndDrop(source_img, dest_img).perform();
		Thread.sleep(2000);
		
	}

}
