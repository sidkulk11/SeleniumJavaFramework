package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {

	public static void main(String[] args) {
		// Refer website https://www.extentreports.com/docs/versions/3/java/index.html#basic-example 
		
		// start reporters
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentreports.html"); 
		
		 // create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Yahoo Search Test One", "This is a test to validate yahoo search functionality");
        
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        
        test1.log(Status.INFO, "Starting Test Case");												// log(Status, details)
		WebDriver driver = new ChromeDriver(); 
				
		driver.get("https://de.yahoo.com/");									
		test1.pass("Navigated to yahoo.com");					// log with snapshot (Pass or fail will be decided in conditional statements..if..else and so on)
		
		driver.findElement(By.name("agree")).click();
		test1.pass("Terms and Conditions agreed");
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("I am the best");
		test1.pass("Entered text in searchbox");
		
		driver.findElement(By.id("ybar-search")).click();
		test1.pass("Pressed keyboard entered key");
		
		driver.close();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		// calling flush writes everything to the log file
		extent.flush(); 
	}

}
