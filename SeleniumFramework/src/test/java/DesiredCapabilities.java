import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
		
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/remote/DesiredCapabilities.html 
		//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities 

		
		//DesiredCapabilities caps = new DesiredCapabilities();					//Desired Capabilities
		//caps.setcapability("ignoreProtectedModeSettings", true); 
		
		//WebDriver driver = new EdgeDriver(caps);								//add caps
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://de.yahoo.com/");

		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("I am the best");
		driver.findElement(By.id("ybar-search")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
	}

}
