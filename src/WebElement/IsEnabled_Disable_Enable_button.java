package WebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Disable_Enable_button {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//code for scrolling page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//storing address value for enable/disable text box
		WebElement disable_enable_ele = driver.findElement(By.id("enabled-example-input"));
		Thread.sleep(1000);
		
		//displaying value of disable/enable button 
		System.out.println("Status of Disable/Enable Button : "+disable_enable_ele.isEnabled());

		//clicking on disable/enable textbox
		disable_enable_ele.click();
		
		//sending input key for checking it is enabled
		driver.findElement(By.id("enabled-example-input")).sendKeys("ABC");
		Thread.sleep(1000);

		//clearing text
		disable_enable_ele.clear();
		Thread.sleep(1000);
		
		//click on disable button
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(1000);
		
		//displaying value of disable/enable button 
		System.out.println("Status of Disable/Enable Button : "+disable_enable_ele.isEnabled());

		
		//clicking on text box to check it is disabled
		disable_enable_ele.click();
		Thread.sleep(1000);
		
		//clicking on enable button
		driver.findElement(By.id("enabled-button")).click();
		Thread.sleep(1000);
		
		//displaying value of disable/enable button 
		System.out.println("Status of Disable/Enable Button : "+disable_enable_ele.isEnabled());

		//clicking on disable/enable textbox for sending values for verification
		disable_enable_ele.click();
		Thread.sleep(1000);
		
		//sending input key for checking it is enabled
		driver.findElement(By.id("enabled-example-input")).sendKeys("PQR");
		Thread.sleep(1000);
		
		driver.close();
		
		
		driver.close();
		
	}

}
