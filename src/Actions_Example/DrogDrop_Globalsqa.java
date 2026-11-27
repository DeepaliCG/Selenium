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
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("maximized window");
		Thread.sleep(5000);
		
		//????????? how o select image
		WebElement source_ele = driver.findElement(By.linkText("High Tatras"));
		Thread.sleep(5000);
		
		System.out.println("selected source image");
		
		WebElement dest_ele = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Thread.sleep(5000);
		
		System.out.println("selected destination image");
		
//		source_ele.click();
//		Thread.sleep(5000);
		
		Actions action = new Actions(driver);

//		action.doubleClick(source_ele);
//		Thread.sleep(5000);
		
		System.out.println("double click on source image");
		
		action.dragAndDrop(source_ele, dest_ele).build().perform();
		Thread.sleep(1000);
		
		System.out.println("drag drop action");
		Thread.sleep(1000);
		

	}

}
