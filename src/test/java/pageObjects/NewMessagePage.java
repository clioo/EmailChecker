package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.NewMessageContent;

public class NewMessagePage {
	public WebDriver driver;
	public NewMessageContent newMessageContent;
	
	public NewMessagePage(WebDriver driver) {
		this.driver = driver;
		newMessageContent = PageFactory.initElements(driver, NewMessageContent.class);
	}
	
	public void setTo(String email) {
		newMessageContent.to.sendKeys(email);
	}
	public void setSubject(String subject) {
		newMessageContent.subject.sendKeys(subject);
	}
	public void setBody(String body) {
		newMessageContent.body.sendKeys(body);
	}
	
	public void clickSend() {
		newMessageContent.btnSend.click();
	}
}
