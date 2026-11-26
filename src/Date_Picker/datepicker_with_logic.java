package Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker_with_logic {

	// declaring input values of day month and year which will be selected from page
	static String input_year = "2026";
	static String input_month = "November";
	static String input_day = "2";

	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
//		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(1000);
		
		//fetching actual year which is getting displayed on web page
		String actual_yr = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		System.out.println("Actual Year : "+actual_yr);
		
		//fetching actual month which is displayed on web page
		String actual_mnth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println("Actual Month : "+actual_mnth);
		Thread.sleep(1000);

		
		do
		{
			if((input_year.equalsIgnoreCase(actual_yr)) && (input_month.equalsIgnoreCase(actual_mnth)))
					{
						//getting all days into list
						List<WebElement> list_day = driver.findElements(By.xpath("//table//tbody//tr//td"));
						Thread.sleep(1000);
						
						//iterating day one by one to get input day-- for each loop
						for(WebElement all_day_val : list_day)
						{
							String Actual_day = all_day_val.getText();
							Thread.sleep(1000);
							//comparing all days with input day
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
				//clicking on back button for getting previous year month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				Thread.sleep(1000);
			}
					
			
		}
		while(true);
	}

}
