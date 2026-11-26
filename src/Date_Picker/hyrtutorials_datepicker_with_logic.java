package Date_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hyrtutorials_datepicker_with_logic {

	static String input_year = "2026";
	static String input_month = "November";
	static String input_day = "2";
	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(600));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='hasDatepicker']")));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		Thread.sleep(1000);
		
		String actual_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		System.out.println("Acyual Year : "+actual_year);
		
		String actual_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		System.out.println("Actual Month : "+actual_month);
		
		do
		{
			if((input_year.equalsIgnoreCase(actual_year)) && (input_month.equalsIgnoreCase(actual_month)))
			
			{
				List<WebElement> list_day = driver.findElements(By.xpath("//table//tbody//tr//td"));
				Thread.sleep(1000);
				
				for(WebElement all_day_val : list_day)
				{
					String Actual_day = all_day_val.getText();
					Thread.sleep(1000);
					
					if(input_day.equalsIgnoreCase(Actual_day))
					{
						// if matched then click on the day
						all_day_val.click();
						Thread.sleep(1000);
						break;
					}
					
				}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				Thread.sleep(1000);
			}
			}
		while(true);

	}

}
