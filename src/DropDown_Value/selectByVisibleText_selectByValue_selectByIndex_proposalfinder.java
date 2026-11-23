package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText_selectByValue_selectByIndex_proposalfinder {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://proposalfinder.com/create-wedding-profile");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//select city value for mobile number
		Select select = new Select(driver.findElement(By.id("reg-mobile-ctry")));
		Thread.sleep(2000);
		
		select.selectByVisibleText("Australia");
		Thread.sleep(2000);
		
		select.selectByValue("91");
		Thread.sleep(2000);
		
		select.selectByIndex(5);
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
