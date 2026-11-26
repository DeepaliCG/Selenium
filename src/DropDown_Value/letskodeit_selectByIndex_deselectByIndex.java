package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class letskodeit_selectByIndex_deselectByIndex {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement list = driver.findElement(By.id("multiple-select-example"));
		
		Select select = new Select(list);
		
		select.selectByIndex(0);
		Thread.sleep(500);
		
		select.selectByIndex(1);
		Thread.sleep(500);
		
		select.selectByIndex(2);
		Thread.sleep(500);
		
		select.deselectByIndex(0);
//		select.deselectAll();
		Thread.sleep(500);
		
		driver.close();
	}

}
