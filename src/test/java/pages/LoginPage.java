package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By userNameTxtBox = By.id("userEmail");
	private By passwordTxtBox = By.id("userPassword");
	private By loginBtn = By.id("login");

	public void enterUserName(String username) {
		elementSendKeys(findElement(userNameTxtBox), username);
	}

	public void enterPassword(String password) {
		elementSendKeys(findElement(passwordTxtBox), password);
	}

	public void clickOnLogin() {
		btnClickJs(findElement(loginBtn));
	}

	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickOnLogin();

	}
}
