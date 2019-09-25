package pageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMessageContent {
	@FindBy(xpath = "//input[@class='ms-BasePicker-input pickerInput_ecad0f63']")
	public WebElement to;
	
	
	@FindBy(xpath = "//input[@id='subjectLine0']")
	public WebElement subject;
	
	@FindBy(xpath = "//*[@class='_4utP_vaqQ3UQZH0GEBVQe B1QSRkzQCtvCtutReyNZ _17ghdPL1NLKYjRvmoJgpoK _2s9KmFMlfdGElivl0o-GZb']")
	public WebElement body;
	
	
	@FindBy(id = "id__950")
	public WebElement btnSend;
}
