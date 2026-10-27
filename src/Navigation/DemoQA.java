package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/");
		
		//2. Open DemoQA.com website 
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		//Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		//3. Click on Registration link using 
		driver.findElement(By.xpath("//a[text()='Go To Registration ']")).click();
		Thread.sleep(1000);
		
		//4.. Come back to Home page (Use ‘Back’ command)
		driver.navigate().back();
		Thread.sleep(1000);
		
		//5. Again go back to Registration page 
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//6. Again come back to Home page 
		driver.navigate().back();
		Thread.sleep(1000);
		
		//7. Refresh the Browser 
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//8. Close the Browser
		driver.close();
	}

}
