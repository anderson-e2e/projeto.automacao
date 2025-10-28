package projeto.web.core;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if(driver == null) {
			driver = BaseTest.createDriver();
		}		
		return driver;
	}
	
	public static void quitDriver() {
		if(driver != null) {
			driver.quit();
			
			driver = null;
		}
	}

}

