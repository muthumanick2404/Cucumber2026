package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectManager.PageObjectManager;
import utility.DriverFactory;

public class LoginStep{
	    private static final Logger logger = LogManager.getLogger(LoginStep.class);

		PageObjectManager poManager = new PageObjectManager(DriverFactory.getDriver());
		
	@Given("User is on the sauce labs login page")
	public void user_is_on_the_sauce_labs_login_page() {
		logger.info("Browser and url launched");
	}

	@When("User enters {string} and {string} and clicks on login")
	public void user_enters_and_and_clicks_on_login(String username, String password) throws InterruptedException {
		
		poManager.getLoginPage().login(username, password);
			logger.info("User logging in with username:"+username+"and password:"+password);
	}

	@Then("HomePage screen should be displayed")
	public void home_page_screen_should_be_displayed() {
		Assert.assertTrue(poManager.getHomePage().verifyHomePageDisplayed());
		logger.info("Homepage is displayed");
	}

}
