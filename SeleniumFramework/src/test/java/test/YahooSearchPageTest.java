package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.YahooSearchPage;

public class YahooSearchPageTest {

	private static WebDriver driver;

	public static void name(String[] args) {

		YahooSearchTest();
	}

	public static void YahooSearchTest() {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		YahooSearchPage SearchPageObject = new pages.YahooSearchPage(driver);

		driver.get("https://de.yahoo.com/");

		SearchPageObject.ClickConsentButton();
		SearchPageObject.SetTextInSearchBox("A B C D");
		SearchPageObject.clickSearchButton();

		driver.close();

	}

}
