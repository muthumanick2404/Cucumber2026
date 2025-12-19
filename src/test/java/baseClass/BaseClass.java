package baseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WaitUtils;

public class BaseClass {

	public  WebDriver driver;
	public JavascriptExecutor js;
	public WaitUtils waitUtil;
	
	public BaseClass(WebDriver driver){
		this.driver=driver;
	}
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	public void elementSendKeys(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void btnClickJs(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public boolean isDisplayed(By locator){
		waitUtil=new WaitUtils(driver, 20);
		return waitUtil.waitForVisibilityOfElement(locator).isDisplayed();
		 
	}

	public byte [] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
