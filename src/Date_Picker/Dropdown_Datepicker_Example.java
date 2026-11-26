package Date_Picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Datepicker_Example {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//clicking on empty text box
		driver.findElement(By.id("datepicker2")).click();
		Thread.sleep(500);
		
		//selecting year
		WebElement list = driver.findElement(By.xpath("//select[@title='Change the year']"));
		
		Select select = new Select(list);
		
		select.selectByVisibleText("2022");
		Thread.sleep(1000);
		
		WebElement list_mnth = driver.findElement(By.xpath("//select[@title='Change the month']"));
		
		Select select_mnth = new Select(list_mnth);
		
		select_mnth.selectByVisibleText("January");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("6")).click();
		Thread.sleep(1000);
		
		
		
		
	}

}
