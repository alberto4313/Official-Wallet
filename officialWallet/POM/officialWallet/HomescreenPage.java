package officialWallet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class HomescreenPage {
	AndroidDriver driver;
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Send\"]")
    private WebElement sendButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Receive\"]")
    private WebElement receiveButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"0\"]")
    private WebElement rescanButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"3\"]")
    private WebElement settingsButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"2\"]")
    private WebElement themeChangeButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Address Book\"]")
    private WebElement addressBookButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Transactions\"]")
    private WebElement transactionsButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Transactions by Date\"]")
	private WebElement Transcations_by_date;
	
	@AndroidFindBy(accessibility = "Yes")
	private WebElement Yes;
	
	@AndroidFindBy(accessibility = "No")
	private WebElement No;
	
	@AndroidFindBy(accessibility = "Show menu")
	private WebElement FilterBy;
	
	public HomescreenPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	public void clickOnSendButton() {
		sendButton.click();	}
	public void clickOnReceiveButton() {
		receiveButton.click();
	}
	public void clickOnRescanButton() {
		rescanButton.click();
	}
	public void clickOnSettingsButton() {
		settingsButton.click();
	}
	public void clickOnThemeChangeButton() {
		themeChangeButton.click();
	}
	public void clickOnAddressBookButton() {
		addressBookButton.click();
	}
	public void clickOnTransactionsButton() {
	     transactionsButton.click();
	}
	public WebElement Yes() {
		return Yes;
	}
	public HomescreenPage Yes_Button_click() {
		this.Yes().click();
		return this;
	}
	public WebElement No() {
		return No;
	}
	public HomescreenPage No_Button_click() {
		this.No().click();
		return this;
	}
	public WebElement TransactionByDate() {
		return Transcations_by_date;
	}
	public HomescreenPage Transaction_BYdate_Click() {
		this.TransactionByDate().click();
		return this;
	}
	public WebElement Filter_by() {
		return FilterBy;
	}
	public HomescreenPage FilterBy_Click() {
		this.Filter_by().click();
		return this;
	}

}
