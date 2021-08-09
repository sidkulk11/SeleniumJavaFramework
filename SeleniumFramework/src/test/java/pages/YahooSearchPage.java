package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPage {

	WebDriver driver;
	
	//1) Consent Button
	By Consent_Click = By.name("agree");

	//2) Search in TextBox
	By Textbox_Search = By.id("ybar-sbq");

	//3) Search Button Click
	By Button_Click = By.id("ybar-search"); 
	
	//Constructor
	public YahooSearchPage(WebDriver driver) {
		this.driver=driver;
		
	}

	//From 1) 
	public void ClickConsentButton() {
		driver.findElement(Consent_Click).sendKeys(Keys.RETURN);

	}
	//From 2)
	public void SetTextInSearchBox(String text) {
		driver.findElement(Textbox_Search).sendKeys(text);

	}

	//From 3)
	public void clickSearchButton() {
		driver.findElement(Button_Click).sendKeys(Keys.RETURN);
	}

	
}