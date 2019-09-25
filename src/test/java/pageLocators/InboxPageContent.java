package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxPageContent {
	@FindBy (xpath = "//*[contains(text(), 'Mensaje nuevo')]")
	public WebElement newMessage;
	
	@FindBy (xpath = "//*[@aria-posinset='0']")
	public WebElement lastMail;
}
