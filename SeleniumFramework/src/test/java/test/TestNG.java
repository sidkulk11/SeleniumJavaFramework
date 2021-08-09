package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;

	@BeforeTest
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch() {

		// Goto Yahoo.com
		driver.get("https://de.yahoo.com/");

		// Click on terms and conditions
		driver.findElement(By.name("agree")).click();

		// Search in google textbox
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("I am the best");

		// click on search button (Can use either of both options)
		// driver.findElement(By.id("ybar-search")).click();
		driver.findElement(By.id("ybar-search")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() {

		// close driver
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");

	}

}
