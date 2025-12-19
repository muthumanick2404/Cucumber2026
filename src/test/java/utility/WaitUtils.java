package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitUtils  {

	public WebDriverWait wait;
	
	public WaitUtils(WebDriver driver, int seconds) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		
	}
	
	public WebElement waitForVisibilityOfElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
}
