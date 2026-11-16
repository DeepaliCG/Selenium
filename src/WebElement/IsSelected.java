package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//storing address of BMW radio button
		WebElement bmw_radio_btn = driver.findElement(By.id("bmwradio"));
		
		//displaying status of radio button
		System.out.println("Status of BMW Radio Button is "+bmw_radio_btn.isSelected());
		
		//clicking on BMW radio button
		bmw_radio_btn.click();
		Thread.sleep(1000);
		
		//checking status of BMW radio button
		System.out.println("Status of BMW Radio Button is "+bmw_radio_btn.isSelected());
		
		driver.close();
		
	}

}
