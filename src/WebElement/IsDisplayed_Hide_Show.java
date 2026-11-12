package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Hide_Show {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//storing address of hide/show textbar into WebElement
		WebElement hide_show_ele = driver.findElement(By.name("show-hide"));
		
		
		//displaying status of hide/show textbox : true(if it is displayed) or false(if it is hide)
		System.out.println("Status of Hide/Show Textbox : "+hide_show_ele.isDisplayed());

		//clicking on hide button
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(1000);
		
		//displaying status of hide/show textbox : true(if it is displayed) or false(if it is hide)
		System.out.println("Status of Hide/Show Textbox : "+hide_show_ele.isDisplayed());

		
		//clicking on show button
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(1000);
		
		//displaying status of hide/show textbox : true(if it is displayed) or false(if it is hide)
		System.out.println("Status of Hide/Show Textbox : "+hide_show_ele.isDisplayed());

	
		driver.close();
	}

}
