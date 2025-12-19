package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import utility.WaitUtils;

public class HomePage extends BaseClass {
	public WaitUtils wait;
 private By cartMenu = By.xpath("//button[@routerlink='/dashboard/cart']");
 
 public HomePage(WebDriver driver) {
	super(driver);
	 this.driver = driver;
 }
 
 public boolean verifyHomePageDisplayed(){
	return  isDisplayed(cartMenu);
 }
}
