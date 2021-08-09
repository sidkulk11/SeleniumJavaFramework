package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//Goto Yahoo.com
		driver.get("https://de.yahoo.com/"); 
		
		//Click on terms and conditions
		driver.findElement(By.name("agree")).click(); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Search in google textbox
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("I am the best"); 
		
		//click on search button (Can use either of both options)
		//driver.findElement(By.id("ybar-search")).click();
		driver.findElement(By.id("ybar-search")).sendKeys(Keys.RETURN);
		
		//close driver
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		//Next Step is to call the function googleSearch() in main method 
		
	}

}
