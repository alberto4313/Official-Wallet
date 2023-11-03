package vee4.officialWallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Use_Existing_Wallet {
	AndroidDriver driver;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Use Existing Wallet\"]")
	private WebElement Existing_Wallet;

	@AndroidFindBy(xpath ="//android.view.View[@bounds=\"[0,256][1080,634]\"]")
	private WebElement Restore_seed_keys;

	@AndroidFindBy(xpath ="//android.view.View[@bounds=\"[0,256][1080,650]\"]")
	private WebElement Restore_seed_keys_in_UEW;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@bounds=\"[44,366][1036,630]\"]")
	private WebElement Restore_from_Seed;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@bounds=\"[44,674][1036,927]\"]")
	private WebElement Restore_from_Keys;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]")
	private WebElement Next;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Paste\"]")
	private WebElement Paste;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Clear\"]")
	private WebElement Clear;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter wallet name\"]")
	private WebElement Wallet_name;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Address\"]")
	private WebElement address;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"View key (private)\"]")
	private WebElement Vewkey;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Spend key (private)\"]")
	private WebElement Spend_key;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Restore from Blockheight\"]")
	private WebElement Restore_from_blockheight;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Restore from Date\"]")
	private WebElement Restore_options;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Restore\"]")
	private WebElement Restore;
	
	public Use_Existing_Wallet(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public WebElement Existing_Wallet() {
		return Existing_Wallet;
	}
	public Use_Existing_Wallet Existing_Wallet_Button() {
		this.Existing_Wallet().click();
		return this;

	}
	public WebElement Restore_seed_keys() {
		return Restore_seed_keys;
	}
	public Use_Existing_Wallet Restore_seed_keys_button() {
		this.Restore_seed_keys().click();
		return this;

	}
	public WebElement Restore_from_Seed() {
		return Restore_from_Seed;
	}
	public Use_Existing_Wallet Restore_from_SeedButton() {
		this.Restore_from_Seed().click();
		return this;

	}
	public WebElement Restore_from_Keys() {
		return Restore_from_Keys;
	}
	public Use_Existing_Wallet Restore_from_KeysButton() {
		this.Restore_from_Keys().click();
		return this;

	}
	public WebElement Restore_from_Keys1() {
		return Restore_seed_keys_in_UEW;
	}
	public Use_Existing_Wallet Restore_from_Keys1Button() {
		this.Restore_from_Keys1().click();
		return this;

	}
	public WebElement Next_Button() {
		return Next;
	}
	public Use_Existing_Wallet Next_Button_Click() {
		this.Next_Button().click();
		return this;

	}
	public WebElement Paste_RfS() {
		return Paste;
	}
	public Use_Existing_Wallet Paste_RfS_Click() {
		this.Paste_RfS().click();
		return this;

	}
	public WebElement Clear_RfS() {
		return Clear;
	}
	public Use_Existing_Wallet Clear_RfS_Click() {
		this.Clear_RfS().click();
		return this;

	}
	public WebElement Enter_wallet_name() {
		return Wallet_name;
	}
	public Use_Existing_Wallet Enter_wallet_name_text_field() {
		this.Enter_wallet_name().click();
		return this;

	}
	public WebElement Address() {
		return address;
	}
	public Use_Existing_Wallet Address_text_field() {
		this.Address().click();
		return this;

	}
	public WebElement View_key() {
		return Vewkey;
	}
	public Use_Existing_Wallet view_key_text_field() {
		this.View_key().click();
		return this;

	}
	public WebElement Spend_key() {
		return Spend_key;
	}
	public Use_Existing_Wallet spend_key_text_field() {
		this.Spend_key().click();
		return this;

	}
	public WebElement Restore_key() {
		return Restore_options;
	}
	public Use_Existing_Wallet restore_key_text_field() {
		this.Restore_key().click();
		return this;

	}
	public WebElement Restore_option() {
		return Restore_from_blockheight;
	}
	public Use_Existing_Wallet Restore_Options() {
		this.Restore_option().click();
		return this;

	}
	public WebElement Restore_button() {
		return Restore;
	}
	public Use_Existing_Wallet Reestore_Button() {
		this.Restore_button().click();
		return this;

	}
}
