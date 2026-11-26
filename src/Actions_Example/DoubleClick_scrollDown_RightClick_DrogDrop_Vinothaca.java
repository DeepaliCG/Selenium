package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_scrollDown_RightClick_DrogDrop_Vinothaca {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		
		//double click
		WebElement dbl_clk_ele = driver.findElement(By.xpath("//button[@id='doubleBtn']"));
		action.doubleClick(dbl_clk_ele).perform();
		Thread.sleep(2000);
		
		//scroll down
		action.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		//right click
		WebElement right_click_ele = driver.findElement(By.xpath("//button[@id='rightBtn']"));
		Thread.sleep(1000);
		
		action.contextClick(right_click_ele).perform();
		Thread.sleep(1000);
		
		//drag drop
		WebElement source_box = driver.findElement(By.xpath("//div[@id='dragItem']"));
		Thread.sleep(1000);
		
		WebElement destination_box = driver.findElement(By.xpath("//div[@class='dropzone']"));
		Thread.sleep(1000);
		
		action.dragAndDrop(source_box, destination_box).perform();
		Thread.sleep(1000);
		
	}

}
