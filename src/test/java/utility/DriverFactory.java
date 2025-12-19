package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver initDriver() {

		String browser = System.getProperty("browser", "chrome").toLowerCase();
	boolean headless=Boolean.parseBoolean(System.getProperty("headless","false").toLowerCase());
		switch (browser) {
		case "chrome":
			if(headless) {
				ChromeOptions cp = new ChromeOptions();
				cp.addArguments("--headless","--window-size=1920,1080");
				driver = new ChromeDriver(cp);
				break;
			}
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Give proper browser");

		}
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
