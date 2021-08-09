package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class MyTestCaseListeners {

	@Test
	public void VerifyYahooTitle() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://de.yahoo.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	public void TitleMatch() {
		System.out.println("Test2 Demo");
		Assert.assertTrue(false);

	}
	
	public void Test3()
	{
		System.out.println("Test3 Demo");
		throw new SkipException("This test is skipped");
	}
}