package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText_selectByValue_selectByIndex_practice {

	public static <JavascritpExecutor> void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		Select select = new Select(driver.findElement(By.id("country")));
		Thread.sleep(1000);
		
		select.selectByVisibleText("India");
		Thread.sleep(1000);
		
		select.selectByValue("NP");
		Thread.sleep(1000);
		
		select.selectByIndex(37);
		Thread.sleep(1000);
		
		driver.close();

	}

}
