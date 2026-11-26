package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_testautomationcental {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement drag_me_box = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		
		WebElement drag_here_box = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		
		action.dragAndDrop(drag_me_box, drag_here_box).perform();
		Thread.sleep(1000);
		
		

	}

}
