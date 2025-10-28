package projeto.web.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import projeto.web.core.DriverFactory;

public class LoginTest {

	private WebDriver driver;
	

	@BeforeEach
	public void setup() {
		driver = DriverFactory.getDriver();

	}

	@AfterEach
	public void tearDown() {
		DriverFactory.quitDriver();

	}

	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("teste");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("loginEmail")).sendKeys("teste@teste.com");
		driver.findElement(By.id("loginPassword")).sendKeys("teste@teste.com");
		driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
		String msg = driver.findElement(By.id("loginEmailError")).getText();
		System.out.println(msg);

	}

}
