package DropDown_Value;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText_selectByValue_selectByIndex_Demo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);

		//selecting skills drop down
		Select select = new Select(driver.findElement(By.id("Skills")));
		Thread.sleep(1000);
		
		select.selectByVisibleText("Certifications");
		Thread.sleep(1000);
		
		select.selectByValue("Backup Management");
		Thread.sleep(1000);
		
		select.selectByIndex(26);
		Thread.sleep(1000);
		
		driver.close();
	}

}
