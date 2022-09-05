package automation.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = Base.getDriver();
		
				
		// navigating website
		driver.get("https://www.amazon.com");
		
		//select element from drop down 
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropDown);
		select.selectByValue("search-alias=baby-products-intl-ship");
		
		//searching element by name
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("bag");
		searchBox.submit();
		
		driver.findElement(By.linkText("PackIt Freezable Lunch Bag with Zip Closure, Black")).click();
		
		driver.findElement(By.id("buy-now-button")).click();
		
		WebElement emailBox = driver.findElement(By.id("ap_email"));
		emailBox.sendKeys("01767552562");
		emailBox.submit();
		
		WebElement passBox = driver.findElement(By.id("ap_password"));
		passBox.sendKeys("123456");
		passBox.submit();
		
		//quit the window
		//driver.quit();

	}

}
