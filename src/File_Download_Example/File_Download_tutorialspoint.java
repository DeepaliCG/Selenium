package File_Download_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download_tutorialspoint {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		Thread.sleep(1000);
		
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(1000);
		
		

	}

}
