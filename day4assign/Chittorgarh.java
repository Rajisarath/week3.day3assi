package week3.day4assign;
//1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch the URL https://www.chittorgarh.com/
		driver.get(" https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on stock market
		driver.findElement(By.xpath("(//a[contains(@id,'navbtn_stockmarket')])")).click();
		
		//3. Click on NSE bulk Deals
		//a[contains(text(),'NSE Bulk Deals')]
		driver.findElement(By.xpath("(//a[contains(text(),'NSE Bulk Deals')])")).click();
		
		//4. Get all the Security names
		String header = driver.findElement(By.xpath("//table//th[3]")).getText();
		System.out.println("Header name: " + header);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
		System.out.println("row size: "+ rows.size());
		System.out.println("row details: ");
		for (WebElement row : rows) {
			String text = row.getText();
			System.out.println("security name: " + text);
			System.out.println("-------------------------------");
	//5. Ensure whether there are duplicate Security names
		char[] ch=text.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		for (Character each : ch) {
			set.add(each);
				
		}
		System.out.println("duplicate name " + set);		 
			 
		}
		
		
		
		 



	}

}
