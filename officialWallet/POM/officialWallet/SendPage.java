package officialWallet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class SendPage {
	AndroidDriver driver;

	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Beldex address\"]")
	private WebElement beldexAddress;

	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter Amount\"]")
	private WebElement enterBDX;


	@AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Send\"]")
	private WebElement sendButton;


	public SendPage(AndroidDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public WebElement EnterBeldexAddress() {
		return beldexAddress;
	}
	public SendPage EnterBeldexAddress(String nave) {
		this.EnterBeldexAddress().sendKeys("ahvhda");
		return this;
	}
	public WebElement enterBDX() {
		return enterBDX;
	}
	public SendPage enterBDX(String naa) {
		this.enterBDX().sendKeys("789");
		return this;
	}
	public WebElement ClickSendButton() {
		return driver.findElement((By)sendButton);
	}
	public SendPage ClickOnSendButton() {
		this.ClickSendButton().click();
		return this;
	}


}
