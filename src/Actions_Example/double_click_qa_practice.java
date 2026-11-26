package Actions_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_qa_practice {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://qa-practice.netlify.app/double-click");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//double click
		WebElement double_click_ele = driver.findElement(By.xpath("//button[@id='double-click-btn']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		
		action.doubleClick(double_click_ele).perform();
		Thread.sleep(1000);

	}

}
