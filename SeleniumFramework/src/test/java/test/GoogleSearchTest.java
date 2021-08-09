package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		
		//Goto yahoo.com
		driver.get("https://de.yahoo.com/"); 
		
		//Click on terms and conditions
		//driver.findElement(By.name("agree")).click(); 
		
		GoogleSearchPage.Consent_button(driver).click();
		
		//Search in google textbox
		//driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("I am the best"); 
		
		GoogleSearchPage.Textbox_Search(driver).sendKeys("Automation Step by Step");
		
		//click on search button (Can use either of both options)
		//driver.findElement(By.id("ybar-search")).click();
		//driver.findElement(By.id("ybar-search")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_Search(driver).click();
		//close driver
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		//Next Step is to call the function googleSearch() in main method 
		
	}

}
