package officialWallet;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class EnteryourPIN {
	AndroidDriver driver;


	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"1\"]")
	private WebElement enterYourPINFirstDigit;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"5\"]")
	private WebElement enterYourPINSecondDigit;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"9\"]")
	private WebElement enterYourPINThirdDigit;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"3\"]")
	private WebElement enterYourPINFourthDigit;


	public EnteryourPIN(AndroidDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public void Entering4digitPIN() throws InterruptedException {
		this.enterYourPINFirstDigit.click();
		Thread.sleep(2000);
		this.enterYourPINSecondDigit.click();
		Thread.sleep(2000);
		this.enterYourPINThirdDigit.click();
		Thread.sleep(2000);
		this.enterYourPINFourthDigit.click();
		Thread.sleep(2000);


	}
	public WebElement EnterFirstDigit() {
		return enterYourPINFirstDigit;
	}
	public EnteryourPIN EnterFirstDigitPassword() {
		this.EnterFirstDigit().click();
		return this;

	}
	public WebElement EnterSecondDigit() {
		return enterYourPINSecondDigit;
	}
	public EnteryourPIN EnterSecondDigitPassword() {
		this.EnterSecondDigit().click();
		return this;
	}
	public WebElement EnterThirdDigit() {
		return enterYourPINThirdDigit;

	}
	public EnteryourPIN EnterThirdDigitPassword() {
		this.EnterThirdDigit().click();
		return this;
	}
	public WebElement EnterFourthDigit() {
		return enterYourPINFourthDigit;
	}
	public EnteryourPIN EnterFourthDigitPassword() {
		this.EnterFourthDigit().click();
		return this;
	}

}
