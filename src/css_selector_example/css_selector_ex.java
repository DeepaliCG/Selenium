package css_selector_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_ex {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//CSS Selector = tagname#idvalue
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		Thread.sleep(5000);
		
		//CSSSelector = tagname.classvalue
//		driver.findElement(By.cssSelector("input_error form_input")).sendKeys("secret_sauce");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[data-test=login-button]")).click();
		
	Thread.sleep(1000);
	
	driver.close();
	
		
		

	}

}
