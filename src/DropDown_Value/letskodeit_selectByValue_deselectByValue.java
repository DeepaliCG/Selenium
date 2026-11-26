package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class letskodeit_selectByValue_deselectByValue {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement list = driver.findElement(By.id("multiple-select-example"));
		
		Select select = new Select(list);
		
		select.selectByValue("apple");
		Thread.sleep(500);
		
		select.selectByValue("peach");
		Thread.sleep(500);
		
		select.selectByValue("orange");
		Thread.sleep(500);
		
		select.deselectByValue("peach");
		Thread.sleep(500);
		
		driver.close();

	}

}
