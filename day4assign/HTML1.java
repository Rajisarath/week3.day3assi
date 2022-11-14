package week3.day4assign;
//1. Launch the URL https://html.com/tags/table/
//2. Get the count of number of rows
//3. Get the count of number of columns

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch the URL https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Get the count of number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("count of rows in the table :"+rows.size());
		//System.out.println("row details: ");
		
		////3. Get the count of number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table//th"));
		System.out.println("count of columns in the table :"+columns.size());


		
		

	}

}
