package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogDrop_Globalsqa {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//????????? how o select image
		WebElement source_ele = driver.findElement(By.className("ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle"));
		Thread.sleep(1000);
		
		WebElement dest_ele = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source_ele, dest_ele).perform();
		Thread.sleep(1000);
		
		
		

	}

}
