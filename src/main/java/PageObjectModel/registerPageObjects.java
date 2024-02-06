package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObjects {
  public WebDriver driver;
	
	 
	 private By Register = By.xpath("//a[@class='ico-register']");
	 private By Gender = By.xpath("//input[@value='M']");
	 private By FirstName = By.xpath("//input[@id='FirstName']");
	 private By LastName = By.xpath("//input[@id='LastName']");
	 private By Email = By.xpath("//input[@id='Email']");
	 private By Password = By.xpath("//input[@id='Password']");
	 private By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	 private By RegisterButton = By.xpath("//input[@id='register-button']");
	 
	 
	 
	 public registerPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 
		 this.driver=driver;
	}

	public WebElement clickonRegister() {
		return driver.findElement(Register);	 
	 }
	 
	 public WebElement selectGender() {
			return driver.findElement(Gender);	 
		 }
	 
	 public WebElement enterFirstName() {
			return driver.findElement(FirstName);	 
		 }
	 
	 public WebElement enterLastName() {
			return driver.findElement(LastName);	 
		 }
	 
	 public WebElement enterEmail() {
			return driver.findElement(Email);	 
		 }
	 
	 public WebElement enterPassword() {
			return driver.findElement(Password);	 
		 }
	 
	 public WebElement enterConfirmPassword() {
			return driver.findElement(ConfirmPassword);	 
		 }
	 
	 public WebElement clickonsubmitButton() {
			return driver.findElement(RegisterButton);	 
		 }

	public WebElement invalidEmailText() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement successText() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
	 
	 
}
