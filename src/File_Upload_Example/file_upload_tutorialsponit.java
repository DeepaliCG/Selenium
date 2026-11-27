package File_Upload_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload_tutorialsponit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		Thread.sleep(1000);
		
		driver.findElement(By.id("uploadFile")).sendKeys("E:\\data\\Desktop\\Deepali\\Testing_docs\\Github_Steps.txt");
		Thread.sleep(1000);
		
		
	}

}
