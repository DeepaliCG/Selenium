package Radio_Button_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_Button_letskodeit {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver()
;
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
		Thread.sleep(1000);
		
		driver.close();
	}

}
