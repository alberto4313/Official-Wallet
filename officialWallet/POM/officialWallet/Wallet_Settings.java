package officialWallet;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
public class Wallet_Settings {
	AndroidBy driver;
	@AndroidFindBy(accessibility = "Wallet Settings")
      private WebElement Wallet_settings_button;	
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Display balance as\r\n"
			+ "Beldex Full Balance\"]")
    private  WebElement displayBalanceAs;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Beldex Full Balance\"]")
    private  WebElement beldexFullBalance;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Beldex Available Balance\"]")
    private  WebElement beldexAvailableBalance;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Beldex Hidden\"]")
    private  WebElement beldexHidden;
	
	@AndroidFindBy(xpath="//android.view.View[@index=\"1\"]")
    private  WebElement Decimals;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"5 - Five (0.00000)\"]")
    private  WebElement Five;
	
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"4 - Four (0.0000)\"]")
	private  WebElement Four;
    
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"2 - Two (0.00)\"]")
	private  WebElement Two;
    
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"0 - Zero (000)\"]")
	private WebElement Zero;
   
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Accounts\"]")
	private WebElement Accounts;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Wallets\"]")
	private WebElement Wallets;
	
	@AndroidFindBy(accessibility = "Version 1.0.7")
	private WebElement Version0fTheApp;
	
	@AndroidFindBy(accessibility = "Changelog")
	private WebElement Changelog;
	
	@AndroidFindBy(accessibility = "FAQ")
	private WebElement FAQ;
	
	@AndroidFindBy(accessibility = "Terms & Conditions")
	private WebElement Terms__Conditions;
	
	@AndroidFindBy(accessibility = "Change Language")
	private WebElement Change_Language;
	
	@AndroidFindBy(accessibility = "Change PIN")
	private WebElement Change_PIN;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Fee Priority\r\n"
			+ "Flash\"]")
	private WebElement Fee_Priority;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Currency\r\n"
			+ "BRL\"]")
	private WebElement Currency;
	
	@AndroidFindBy(accessibility = "Flash")
	private WebElement Currency_Flash;
	@AndroidFindBy(accessibility = "Slow")
	private WebElement Currency_Slow;
	
	@AndroidFindBy(className = "android.widget.Button")
	private WebElement Search_Currency_InputBox;
	
	@AndroidFindBy(accessibility = "English")
	private WebElement English_languge;
	
	@AndroidFindBy(accessibility = "Deutsch (German)")
	private WebElement German_languge;
	
	@AndroidFindBy(accessibility = "Français (French)")
	private WebElement French_languge;
	
	/*@AndroidFindBy(xpath ="//android.view.View[@content-desc=\\\"4 - Four (0.0000)\\\"]")
	private WebElement sendButton;

	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\\\"4 - Four (0.0000)\\\"]")
	private WebElement sendButton;

	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\\\"4 - Four (0.0000)\\\"]")
	private WebElement sendButton;*/


	public Wallet_Settings(AndroidDriver driver) {
	
	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public TouchAction Settings2(PerformsTouchActions driver) throws Exception {
		Thread.sleep(3000);
		System.out.println("hi");
		@SuppressWarnings("deprecation")                            
		  TouchAction touchAction = new TouchAction(driver);       
		  touchAction.tap(PointOption.point(299, 647)).perform();
		  return touchAction;
	}
	public WebElement Search_CurrencyInputBox() {
		return Search_Currency_InputBox;
	}
	public  Wallet_Settings Search_CurrencyInputBox_Click() {
		this.Search_CurrencyInputBox().click();
		return this;
	}
	public WebElement Currency_slow() {
		return Currency_Slow;
	}
	public  Wallet_Settings Currency_slow_Click() {
		this.Currency_slow().click();
		return this;
	}
	public WebElement Currency_flash() {
		return Currency_Flash;
	}
	public  Wallet_Settings Currency_Flash_Click() {
		this.Currency_flash().click();
		return this;
	}
	public WebElement Currency_OPtion() {
		return Currency;
	}
	public  Wallet_Settings Currency_OPtion_Click() {
		this.Currency_OPtion().click();
		return this;
	}
	public WebElement English_Languge() {
		return English_languge;
	}
	public  Wallet_Settings English_Languge_Click() {
		this.English_Languge().click();
		return this;
	}
	public WebElement German_Languge() {
		return German_languge;
	}
	public  Wallet_Settings German_Languge_Click() {
		this.German_Languge().click();
		return this;
	}
	public WebElement French_Languge() {
		return French_languge;
	}
	public  Wallet_Settings French_Languge_Click() {
		this.French_Languge().click();
		return this;
	}
	
	
	
	
	
	
	
	
	public WebElement Fee_priority() {
		return Fee_Priority;
	}
	public  Wallet_Settings Fee_priority_Click() {
		this.Fee_priority().click();
		return this;
	}
	public WebElement change_PIN() {
		return Change_PIN;
	}
	public  Wallet_Settings change_PIN_Click() {
		this.change_PIN().click();
		return this;
	}
	public WebElement Change_language() {
		return Change_Language;
	}
	public  Wallet_Settings Change_language_Click() {
		this.Change_language().click();
		return this;
	}
	public WebElement Terms__conditions() {
		return Terms__Conditions;
	}
	public  Wallet_Settings Terms__conditions_Click() {
		this.Terms__conditions().click();
		return this;
	}
	public WebElement FAQs() {
		return FAQ;
	}
	public  Wallet_Settings FAQs_Click() {
		this.FAQs().click();
		return this;
	}
	public WebElement Change_log() {
		return Changelog;
	}
	public  Wallet_Settings Change_log_Click() {
		this.Change_log().click();
		return this;
	}
	public WebElement VersionOfTheApp() {
		return Version0fTheApp;
	}
	public  Wallet_Settings VersionOfTheApp_Click() {
		this.VersionOfTheApp().click();
		return this;
	}
	public WebElement decimals() {
		return Decimals;
	}
	public  Wallet_Settings Decimals_Click() {
		this.decimals().click();
		return this;
	}
	
	public WebElement Five() {
		return Five;
	}
	public  Wallet_Settings Five_Click() {
		this.Five().click();
		return this;
	}
	public WebElement Four() {
		return Four;
	}
	public  Wallet_Settings Four_Click() {
		this.Four().click();
		return this;
	}
	public WebElement Zero() {
		return Zero;
	}
	public  Wallet_Settings Zero_Click() {
		this.Zero().click();
		return this;
	}
	public WebElement Two() {
		return Two;
	}
	public  Wallet_Settings Two_Click() {
		this.Two().click();
		return this;
	}
	public WebElement Display_Balance_as() {
		return displayBalanceAs;
	}
	public  Wallet_Settings Display_Balance_as_Click() {
		this.Display_Balance_as().click();
		return this;
	}
	public WebElement Beldex_Full_Balance() {
		return beldexFullBalance;
	}
	public  Wallet_Settings Beldex_Full_Balance_Click() {
		this.Beldex_Full_Balance().click();
		return this;
	}
	public WebElement Beldex_available_Balance() {
		return beldexAvailableBalance;
	}
	public  Wallet_Settings Beldex_available_Balance_Click() {
		this.Beldex_available_Balance().click();
		return this;
	}
	public WebElement Beldex_hidden_Balance() {
		return beldexHidden;
	}
	public  Wallet_Settings Beldex_hidden_Balance_Click() {
		this.Beldex_hidden_Balance().click();
		return this;
	}
	public WebElement Wallet_settings() {
		return Wallet_settings_button;
	}
	public  Wallet_Settings Wallet_settings_Click() {
		this.Wallet_settings().click();
		return this;
	}
	
	public WebElement Version() {
		return Version0fTheApp;
	}
	
	
	
	public WebElement account() {
		return Accounts;
	}
	public Wallet_Settings Account_Click() {
		this.account().click();
		return this;
	}
	public WebElement Wallets() {
		return Wallets;
	}
	public Wallet_Settings Wallets_Click() {
		this.Wallets().click();
		return this;
	}
	/*public void EnterFirstDigit() {
		enterYourPINFirstDigit.click();
	}
	public void EnterSecondDigit() {
		enterYourPINSecondDigit.click();
	}
	public void EnterThirdDigit() {
		enterYourPINThirdDigit.click();
	}
	public void EnterFourthDigit() {
		enterYourPINFourthDigit.click();
	}
	public void ClickSendButton() {
		sendButton.click();
	}*/
	
}
