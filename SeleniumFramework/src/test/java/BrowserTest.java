import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//By finding single element in web
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Food is good");
		//OR
		//WebElement textbox= driver.findElement(By.xpath("//input[@name='q']"));
		//textbox.sendKeys("Food is good");
		
		
		//By finding elements in web
		//driver.findElements(By.xpath("//input"));
		List<WebElement> ListOfInputElements= driver.findElements(By.xpath("//input"));
		}
	}
