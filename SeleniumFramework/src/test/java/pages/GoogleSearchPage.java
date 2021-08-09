package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element = null;
	
	public static WebElement Consent_button(WebDriver driver) {
		
		element = driver.findElement(By.name("agree"));
		return element;
		
	}	

	public static WebElement Textbox_Search(WebDriver driver) {
		
		element = driver.findElement(By.id("ybar-sbq"));
		return element;
	} 
	
	public static WebElement button_Search(WebDriver driver) {
		
		element = driver.findElement(By.id("ybar-search"));
		return element;
	}
	
	
}
