package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setDriver() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://career.techforing.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}

}
