package officialWallet;
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
	
	@AndroidFindBy(accessibility = "Address Book")
	private  WebElement Addressbookbutton;
	public AddressBook(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public WebElement AddAddress() {
		return addAddress;	}
	public AddressBook clickOnAddAddress() {
		this.AddAddress().click();	
		return this;}
	public WebElement EnterNameTextField() {
		return enterName;
	}
	public AddressBook ClickonEnterNameTextField() {
		this.EnterNameTextField().click();;
		return this;
	}
	public WebElement EnterAddressTextField() {
		return enterAddress;
	}
	public AddressBook clickOnEnterAddressTextField() {
		this.EnterAddressTextField().click();;
		return this;
	}
	public WebElement ResetButton() {
		return Reset;
	}
	public AddressBook clickOnResetButton() {
		this.ResetButton().click();;
		return this;
	}
	public WebElement AddButton() {
		return Add;
	}
	public AddressBook clickOnAddButton() {
		this.AddButton();
		return this;
	}
	public WebElement AddressbookButton() {
		return Addressbookbutton;
	}
	public AddressBook clickOnAddressbookButton() {
		this.AddressbookButton().click();
		return this;
	}

}
