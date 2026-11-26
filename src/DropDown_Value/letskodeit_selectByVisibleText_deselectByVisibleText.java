package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class letskodeit_selectByVisibleText_deselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement list = driver.findElement(By.id("multiple-select-example"));
		
		Select select = new Select(list);
		
		select.selectByVisibleText("Apple");
		Thread.sleep(1000);
		
		select.selectByVisibleText("Orange");
		Thread.sleep(1000);
		
		select.deselectByVisibleText("Apple");
		Thread.sleep(1000);
		
		driver.close();
	}

}
