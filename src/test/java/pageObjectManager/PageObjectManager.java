package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;


public class PageObjectManager  {
 public  WebDriver driver;
	
	private LoginPage loginpage;
	private HomePage homepage;
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public LoginPage getLoginPage(){
		return (loginpage==null)?loginpage=new LoginPage(driver):loginpage;
	}
	
	public HomePage getHomePage(){
		return (homepage==null)?homepage=new HomePage(driver):homepage;
	}
}
