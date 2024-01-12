package officialWallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReceiveScreen {
	
	AndroidDriver driver;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index=\"1\"]")
	private WebElement  Copy_button;

	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement EnterAmountTextField;
	
	@AndroidFindBy(xpath = "//android.view.View[@index=\"5\"]")
	private WebElement SelectSubAddress;
	
	@AndroidFindBy(accessibility = "Add Sub Address")
	private WebElement AddSubAddress;
	
	@AndroidFindBy(accessibility = "Share QR")
	private WebElement ShareQR;
	
	@AndroidFindBy(xpath = "//android.view.View[@index=\"2\"]")
	private WebElement WalletAddress;
	
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement Labelname;
	
	@AndroidFindBy(accessibility = "Create")
	private WebElement CreateButton;
	
	@AndroidFindBy(accessibility = "Enter a valid sub address")
	private WebElement InvalidValue;
	
	@AndroidFindBy(id = "android:id/button2")
	private WebElement CancelButton;
	
	@AndroidFindBy(accessibility = "Enter a valid name upto 20 characters")
	private WebElement AboveBounderyValueError;
	
	@AndroidFindBy(accessibility = "Subaddress already exist")
	private WebElement SubaddressAlreadyExist;
	
	@AndroidFindBy(accessibility = "Enter a valid name upto 20 characters")
	private WebElement AboveBoundryValue;
	
	public ReceiveScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	public WebElement SubaddressAlreadyExist() {
		return SubaddressAlreadyExist;
		
	}
	
	
	public WebElement AboveBoundryValueError() {
		return AboveBounderyValueError;
		
	}
	
	
	
	public WebElement EnterValidSubAddress() {
		return InvalidValue;
		
	}
	
	public WebElement cancelButton() {
		return CancelButton;
		
	}
	public ReceiveScreen ClickOnCancelButton() {
		this.cancelButton().click();;
		return this;
		
	}
	
	
	public WebElement AddSubAddressButton() {
		return AddSubAddress;
		
	}
	public ReceiveScreen ClickOnAddSubAddressButton() {
		this.AddSubAddressButton().click();
		return this;
		
	}
	
	
	
	public WebElement Copy_button() {
		return Copy_button;
	}
	
	
	public ReceiveScreen Click_Copy_Button() {
		this.Copy_button().click();;
	    return this;
	}
	
	
	public WebElement EnterAmountTextField()
	{
		return EnterAmountTextField;
	}
	public ReceiveScreen  ClickOnEnterAmountField() {
		this.EnterAmountTextField().click();;
		return this;
	}
	public WebElement selectsubAddress()
	{
		return SelectSubAddress;
	}
public ReceiveScreen ClicksubAddress() {
	this.selectsubAddress().click();;
	return this;
	
}
public WebElement ShareQR()
{return ShareQR;
	}
public ReceiveScreen ClickshareQR()
{this.ShareQR().click();;
return this;
	}

public WebElement WalletAddress()
{return  WalletAddress;}

public WebElement AddSubAddressTextFiled() {
	return Labelname;
}

public ReceiveScreen ClickAddSubAddressTextField() {
	this.AddSubAddressTextFiled().click();;
	return this;
	
}
public WebElement CreateButton()
{return CreateButton;}

public ReceiveScreen ClickCreateButton() {
	this.CreateButton().click();;
	return this;
	
	
}
}


