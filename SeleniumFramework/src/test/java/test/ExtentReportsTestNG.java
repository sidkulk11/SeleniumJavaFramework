package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTestNG {

	WebDriver driver;

	// Use Suite when you have a lot of tests
	// Use BeforeTest when you have single or couple of tests
	@BeforeSuite
	public void SetUp() {

		// start reporters
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		// Goto yahoo.com
		driver.get("https://de.yahoo.com/");
		driver.findElement(By.name("agree")).click();
	}

	@Test
	public void Test1() {
		ExtentReports extent = null;
		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		test.info("This step shows usage of info(details)");

		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterSuite
	public void tearDown() {
		
		extent.flush();
	}

}
