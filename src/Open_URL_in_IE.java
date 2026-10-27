import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class Open_URL_in_IE {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println("IE : Title : "+driver.getTitle());
		
		System.out.println("IE : URL : "+driver.getCurrentUrl());
		
		Thread.sleep(1000);
		driver.close();

	}

}
