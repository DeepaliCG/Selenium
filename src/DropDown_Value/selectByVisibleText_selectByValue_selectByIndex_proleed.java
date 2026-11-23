package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText_selectByValue_selectByIndex_proleed {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		//selecting prefix down down of full name 
		Select select = new Select(driver.findElement(By.id("prefix")));
		Thread.sleep(1000);
		
		select.selectByVisibleText("Mr.");
		Thread.sleep(1000);
		
		select.selectByValue("mrs.");
		Thread.sleep(1000);
		
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		

		driver.close();
	}

}
