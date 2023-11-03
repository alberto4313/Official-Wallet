package vee4.officialWallet;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class AddressBook {
	AndroidDriver driver;

	@AndroidFindBy(xpath="//android.view.View[@index=\"2\"]")
	private WebElement addAddress;

	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter name\"]")
	private WebElement enterName;

	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter Address\"]")
	private WebElement enterAddress;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Reset\"]")
	private WebElement Reset;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Add\"]")
	private WebElement Add;
	public AddressBook(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public void clickOnAddAddress() {
		addAddress.click();	}
	public void clickOnEnterNameTextField() {
		enterName.click();
	}
	public void clickOnEnterAddressTextField() {
		enterAddress.click();
	}
	public void clickOnResetButton() {
		Reset.click();
	}
	public void clickOnAddButton() {
		Add.click();
	}

}
