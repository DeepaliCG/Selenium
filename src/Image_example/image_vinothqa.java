package Image_example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_vinothqa {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@src='https://vinothqaacademy.com/wp-content/uploads/2025/06/VTechSolutions_Logo_Horizontal.png.webp']")).click();
		Thread.sleep(1000);

	}

}
