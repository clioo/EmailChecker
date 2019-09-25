package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.LoginPageContent;

public class LoginPage {
	public WebDriver driver;
	LoginPageContent loginPageContent;
	
	 public LoginPage(WebDriver driver) {
		this.driver = driver; 
		loginPageContent = PageFactory.initElements(driver, LoginPageContent.class);
	 }
	 
	 public void clickAnyLink(String linkTxt) {
		 driver.findElement(By.xpath("//a[contains(text(),'" + linkTxt + "')]")).click();
	 }
	 public void clickNext() {
		 loginPageContent.nextButton.click();
	 }
	 
	 public void enterEmail(String email) {
		 loginPageContent.emailField.sendKeys(email);
	 }
	 
	 public void enterPassword(String password) {
		 loginPageContent.passwordField.sendKeys(password);
	 }

	 
	 
}
