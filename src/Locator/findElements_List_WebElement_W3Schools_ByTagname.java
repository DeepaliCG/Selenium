package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_List_WebElement_W3Schools_ByTagname {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//opening url
		driver.navigate().to("https://www.w3schools.com/");
		Thread.sleep(1000);
		
		
		//storing link info into array list 
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		// getting total texts on url
		System.out.println("Total Links : "+link.size());
		
		//iterating text links
		for (WebElement link_textname : link)
		{
			System.out.println(link_textname.getText());
		}
		
		//closing all windows
		driver.quit();

	}

}
