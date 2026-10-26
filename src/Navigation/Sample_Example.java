package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Example {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String surlname = "http://www.facebook.com";
		//opening url
		//driver.navigate().to(surlname);
		driver.get(surlname);
		Thread.sleep(500);
		//clicking on Forgot email? link
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(500);
		//refreshing page
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.close();
		

	}

}
