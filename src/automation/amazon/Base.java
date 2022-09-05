package automation.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver getDriver() {
		
		//loading chrome driver from the folder
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// giving the time value.
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		return driver;
	}

}
