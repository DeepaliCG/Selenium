package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_TagName_List_WebElement {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//opening url
		driver.navigate().to("https://www.wikipedia.org/");

		Thread.sleep(1000);
		
		//getting link names in links array list
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		
		System.out.println("Total link size : "+links.size());
		
		
		//iterating array list links for getting name of web link
		for (WebElement link_textname : links)
		{
			System.out.println(link_textname.getText());
		}
		
		//closing all window
		driver.quit();
	}

}
