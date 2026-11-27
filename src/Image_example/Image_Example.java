package Image_example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Example {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("Window maximize");
		driver.findElement(By.id("nav-logo-sprites")).click();
		
		Thread.sleep(5000);
		System.out.println("clicked on image");

	}

}
