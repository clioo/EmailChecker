package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.InboxPageContent;


public class InboxPage {
	public WebDriver driver;
	InboxPageContent inboxPageContent;
	public InboxPage(WebDriver driver) {
		this.driver = driver; 
		inboxPageContent = PageFactory.initElements(driver, InboxPageContent.class);
	}
	 public void clickNewMessage() {
		 inboxPageContent.newMessage.click();
	 }
	 
	 public void clickLastMail() {
		 inboxPageContent.lastMail.click();
	 }
}
