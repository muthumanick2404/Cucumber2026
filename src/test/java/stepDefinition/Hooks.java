package stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigLoader;
import utility.DriverFactory;

public class Hooks extends BaseClass {
	private static final Logger logger = LogManager.getLogger(Hooks.class);
	
	// Initialize with a dummy driver (BaseClass constructor requires WebDriver)
	public Hooks() {
		super(DriverFactory.getDriver());
	}

	@Before
	public void setUp() throws FileNotFoundException, IOException {
		logger.info("===== Scenario Started =====");
		driver = DriverFactory.initDriver();
		driver.manage().window().maximize();
		//ConfigLoader cf = new ConfigLoader();
		driver.get(ConfigLoader.getProperty("url"));
		logger.info("Browser launched and URL navigated");
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				logger.error("Scenario failed: " + scenario.getName());
				// Capture screenshot using BaseClass method
				byte[] screenshot = takeScreenshot();
				scenario.attach(screenshot, "image/png", scenario.getName());
				logger.info("Screenshot captured for failed scenario");
			} else {
				logger.info("Scenario passed: " + scenario.getName());
			}
		} catch (Exception e) {
			logger.error("Error during tearDown: " + e.getMessage());
		} finally {
			if (driver != null) {
				driver.quit();
				logger.info("Browser closed");
			}
			logger.info("===== Scenario Ended =====");
		}
	}
}
