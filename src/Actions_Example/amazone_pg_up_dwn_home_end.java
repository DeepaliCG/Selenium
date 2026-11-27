package Actions_Example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazone_pg_up_dwn_home_end {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		
		action.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.END).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.HOME).perform();
		Thread.sleep(1000);
		

	}

}
