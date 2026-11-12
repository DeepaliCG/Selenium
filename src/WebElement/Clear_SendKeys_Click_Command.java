package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_SendKeys_Click_Command {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		//maximizing window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//scrolling down web page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//storing addres of hide/show text box
		WebElement hide_show_ele = driver.findElement(By.id("displayed-text"));
		Thread.sleep(1000);
		
		//clicking on hide/show textbox
		hide_show_ele.sendKeys("ABC");
		Thread.sleep(1000);
		
		//clearing input value from hide/show textbox
		hide_show_ele.clear();
		Thread.sleep(1000);
		
		//clicking on hide button
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
