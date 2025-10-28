package projeto.web.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.web.config.UiEnvironmentConfig;

public class BaseTest {
	
	public static WebDriver createDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = UiEnvironmentConfig.get("base.url.plataforma");
        driver.get(baseUrl);
		return driver;
	}


}
