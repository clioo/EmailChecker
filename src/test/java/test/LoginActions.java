package test;

import config.Setup;
import pageObjects.InboxPage;
import pageObjects.LoginPage;
import pageObjects.NewMessagePage;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class LoginActions extends Setup {
	@Parameters({ "email", "password", "nombre" })
	@Test
	public void testCase(String email, String password, String nombre) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.clickNext();
		Thread.sleep(1000);
		loginPage.enterPassword(password);
		loginPage.clickNext();
		Thread.sleep(4000);
		InboxPage inboxPage = new InboxPage(driver);
		inboxPage.clickNewMessage();
		NewMessagePage newMessagePage = new NewMessagePage(driver);
		newMessagePage.setTo(email);
		newMessagePage.setSubject("Nuevo cupón de descuento para: " + nombre);
		newMessagePage.setBody("Tu nuevo cupón de descuento de 30%");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Tu nuevo cupón de descuento de 30%')]")));
		newMessagePage.clickSend();
		Thread.sleep(15000);
		driver.navigate().refresh();
		inboxPage.clickLastMail();
		
		
		
	}
	
	
	
}
