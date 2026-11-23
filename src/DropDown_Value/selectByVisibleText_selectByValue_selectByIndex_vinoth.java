package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText_selectByValue_selectByIndex_vinoth {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://vinothqaacademy.com/drop-down/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Select select = new Select(driver.findElement(By.id("simpleDropdown")));
		Thread.sleep(1000);
		
		select.selectByVisibleText("Tokyo");
		Thread.sleep(1000);
		
		select.selectByValue("LS");
		Thread.sleep(1000);
		
		select.selectByIndex(7);
		Thread.sleep(1000);
		
		driver.close();
	}

}
