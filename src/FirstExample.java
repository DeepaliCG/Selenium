import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstExample {

	public static void main(String[] args) throws InterruptedException {

		// reference created to open chrome browser
		WebDriver driver = new ChromeDriver();
		//to open webURL
		driver.get("https://www.myntra.com");
		String stitle = driver.getTitle();
		System.out.println("Title : "+stitle);
		
		System.out.println("Page URL : "+driver.getCurrentUrl());
		// to add delay
		Thread.sleep(1000);
		// to close web browser
		driver.close();
	}

}
