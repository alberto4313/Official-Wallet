package vee4.officialWallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Wallets {
	
	AndroidDriver driver;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Use Existing Wallet\"]")
	private WebElement Existing_Wallet;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create New Wallet\"]")
	private WebElement CreateNewWallet;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement Continue;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Copy Seed\"]")
	private WebElement Copy_seed; 
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Save\"]")
	private WebElement Save;
	
	@AndroidFindBy(accessibility  ="Load wallet")
	private WebElement LoadWallet;
	
	@AndroidFindBy(accessibility  ="Remove Wallet")
	private WebElement RemoveWallet;
	
	@AndroidFindBy(accessibility  ="Yes")
	private WebElement Yes;
	
	@AndroidFindBy(accessibility  ="No")
	private WebElement No;
	
	public Wallets(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	public WebElement Existing_Wallet() {
		return Existing_Wallet;
	}
	public Wallets Existing_Wallet_Button() {
		this.Existing_Wallet().click();
		return this;

	}
	
	public WebElement CreateNewwallet() {
		return CreateNewWallet;
	}
	public Wallets createNewWallet() {
		this.CreateNewwallet().click();
		return this;
	
}	public WebElement ClickOnContinue() {
	return Continue;
}
public Wallets Click_On_Continue() {
	this.ClickOnContinue().click();
	return this;
}
public WebElement CopySeed() {
	return Copy_seed;
}
public Wallets Copy_seed_button() {
	this.CopySeed().click();
	return this;
}
public WebElement Save() {
	return Save;
}
public Wallets Save_button() {
	this.Save().click();
	return this;
}
public WebElement No() {
	return No;
}
public Wallets No_button_Click() {
	this.No().click();
	return this;
}
public WebElement Yes() {
	return Yes;
}
public Wallets Yes_button_click() {
	this.Yes().click();
	return this;
}
public WebElement RemoveWallet() {
	return RemoveWallet;
}
public Wallets Remove_Wallet_Click() {
	this.RemoveWallet().click();
	return this;
}
public WebElement LoadWallet() {
	return LoadWallet;
}
public Wallets Load_Wallet_Click() {
	this.LoadWallet().click();
	return this;
}








}
