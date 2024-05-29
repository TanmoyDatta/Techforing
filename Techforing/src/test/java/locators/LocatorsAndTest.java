package locators;

import static org.testng.Assert.assertEquals;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetUp;

public class LocatorsAndTest extends DriverSetUp{
	

	@Test(priority = 0,description = "Show Sign UP page")
	public void SignUpPage() throws InterruptedException {
		
		driver.get("https://career.techforing.com/");
		WebElement SignUP_Button = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		SignUP_Button.click();
		Thread.sleep(3000);	
		WebElement NameField = driver.findElement(By.xpath("//input[@id='fullName']"));
		NameField.sendKeys("Tanmoy Datta");
		
		WebElement PhoneNumber = driver.findElement(By.cssSelector("input[placeholder='1 (702) 123-4567']"));
		PhoneNumber.sendKeys("1716948523");
		Thread.sleep(3000);
		
		
		WebElement gender = driver.findElement(By.xpath("//div[@id='gender']"));
		gender.click();
		
		WebElement genderMale = driver.findElement(By.xpath("//li[normalize-space()='Male']"));
		genderMale.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("mrtanmoydatta64@gmail");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField.sendKeys("Password123#");
		
		WebElement ConfrimPasswordField = driver.findElement(By.xpath("//input[@id=':r7:']"));
		ConfrimPasswordField.sendKeys("Password123#");
		
		WebElement SignUpButton = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		SignUP_Button.click();
		
		Thread.sleep(5000);
		
	}
	@Test(priority = 1, description = "SignIN page")
	public void SignIn () throws InterruptedException {
		
		driver.get("https://career.techforing.com/auth");
		WebElement SignInButton = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		SignInButton.click();
		
		WebElement emailBTN = driver.findElement(By.xpath("//input[@id='email']"));
		emailBTN.sendKeys("mrtanmoy64@gmail.com");
		Thread.sleep(3000);
		
		
		WebElement passwordBTN = driver.findElement(By.cssSelector("#password"));
	   passwordBTN.sendKeys("Password123#");
	   Thread.sleep(3000);
		
	   WebElement signInBTN = driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
	   signInBTN.click();
	   Thread.sleep(3000);
	}
	

}
