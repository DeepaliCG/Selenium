package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Command {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement reg_link = driver.findElement(By.xpath("//a[text()='Go To Registration ']"));
		Thread.sleep(1000);
		
		System.out.println("Text for Registration button is : "+reg_link.getText());
		
		driver.close();
	
	
	}

}
