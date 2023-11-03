package vee4.officialWallet;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("serial")
public class CreateNewWallet1 extends DesiredCapabilities{

	static AndroidDriver driver;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create New Wallet\"]")
	private WebElement CreateNewWallet;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"3\"]")
	private WebElement toSwicthbetween46;

	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"9\"]")
	private WebElement Biometric;

	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"0\"]")
	private WebElement NavigateBack;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"0\"]")
	private WebElement Discard;

	@AndroidFindBy(className ="android.widget.EditText")
	private WebElement EnterWalletName;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement Continue;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"0\"]")
	private WebElement Cut;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"2\"]")
	private WebElement Paste;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"0\"]")
	private WebElement Paste1;

	@AndroidFindBy(xpath="//android.widget.Button[@index=\"1\"]")
	private WebElement Copy;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Chinese\"]")
	private WebElement Chinese;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Dutch\"]")
	private WebElement Dutch;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"German\"]")
	private WebElement German;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Japanese\"]")
	private WebElement Japanese;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Portuguese\"]")
	private WebElement Portuguese;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Russian\"]")
	private WebElement Russian;


	@AndroidFindBy(accessibility ="1")
	private WebElement P1;

	@AndroidFindBy(accessibility ="2")
	private WebElement P2;

	@AndroidFindBy(accessibility ="3")
	private WebElement P3;

	@AndroidFindBy(accessibility ="4")
	private WebElement P4;

	@AndroidFindBy(accessibility ="5")
	private WebElement P5;

	@AndroidFindBy(accessibility ="6")
	private WebElement P6;

	@AndroidFindBy(accessibility ="7")
	private WebElement P7;

	@AndroidFindBy(accessibility ="8")
	private WebElement P8;

	@AndroidFindBy(accessibility ="9")
	private WebElement P9;

	@AndroidFindBy(accessibility ="0")
	private WebElement P0;

	@AndroidFindBy(accessibility = "OK")
	private WebElement okButton;

	@AndroidFindBy(accessibility = "CANCEL")
	private WebElement CancelButton;
	
	@AndroidFindBy(accessibility = "Switch to input")
	private WebElement Switchto;
	
	@AndroidFindBy(className= "android.widget.EditText")
	private WebElement EDitedateinput;
	
	@AndroidFindBy(accessibility = "Ok")
	private WebElement okButton1;
	
	@AndroidFindBy(xpath = "//android.view.View[@index=\"0\"]")
	private WebElement Keyboard;

	public CreateNewWallet1(AndroidDriver driver) {
		this.driver=driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public WebElement CreateNewwallet() {
		return CreateNewWallet;
	}
	public CreateNewWallet1 createNewWallet() {
		this.CreateNewwallet().click();
		return this;
	}
	public WebElement KeyBoard() {
		return Keyboard;
	}
	public CreateNewWallet1 KeyBoardisEnbled() {
		this.KeyBoard().isEnabled();
		return this;
	}
	public WebElement FingerScan() {
		return Biometric;
	}
	public CreateNewWallet1 BiometricScan() {
		this.FingerScan().click();
		return this;
	}
	public WebElement SwitchBetweenPin() {
		return toSwicthbetween46;
	}
	public CreateNewWallet1 switchBetweenPin() {
		this.SwitchBetweenPin().click();;
		return this;
	}
	public WebElement Ok() {
		return okButton;
	}
	public CreateNewWallet1 ClickOnOkButton() {
		this.Ok().click();
		return this;
	}
	public WebElement p0() {
		return P0;
	}
	public CreateNewWallet1 Enter_0() {
		this.p0().click();
		return this;
	}
	public WebElement p1() {
		return P1;
	}
	public CreateNewWallet1 Enter_1() {
		this.p1().click();
		return this;
	}
	public WebElement p2() {
		return P2;
	}
	public CreateNewWallet1 Enter_2() {
		this.p2().click();
		return this;
	}
	public WebElement p3() {
		return P3;
	}
	public CreateNewWallet1 Enter_3() {
		this.p3().click();
		return this;
	}
	public WebElement p4() {
		return P4;
	}
	public CreateNewWallet1 Enter_4() {
		this.p4().click();
		return this;
	}
	public WebElement p5() {
		return P5;
	}
	public CreateNewWallet1 Enter_5() {
		this.p5().click();
		return this;
	}
	public WebElement p6() {
		return P6;
	}
	public CreateNewWallet1 Enter_6() {
		this.p6().click();
		return this;
	}
	public WebElement p7() {
		return P7;
	}
	public CreateNewWallet1 Enter_7() {
		this.p7().click();
		return this;
	}
	public WebElement p8() {
		return P8;
	}
	public CreateNewWallet1 Enter_8() {
		this.p8().click();
		return this;
	}
	public WebElement p9() {
		return P9;
	}
	public CreateNewWallet1 Enter_9() {
		this.p9().click();
		return this;
	}
	public WebElement Navigateback() {
		return NavigateBack;
	}
	public CreateNewWallet1 NavigateBACK() {
		this.Navigateback().click();
		return this;

	}
	public WebElement Wallet_name() {
		return EnterWalletName;
	}
	public CreateNewWallet1 WalletName() {
		this.Wallet_name().click();
		return this;

	}	
	public WebElement DiscardButton() {
		return Discard;}
	public CreateNewWallet1 DiscardButton_Click() {

		this.DiscardButton().click();
		return this;
	}

	public CreateNewWallet1 Send_keys(String vasu) {
		Actions ac=new Actions(driver);
		ac.sendKeys(vasu).perform();
		return this;
	}
	public CreateNewWallet1 Scrollto_italian() {
		WebElement element=  (WebElement)driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Italian\"))")); //scroll down to the element and click
		element.click();
		return this;
	}
	public CreateNewWallet1 Scrollto_Spanish() {
		WebElement element=  (WebElement)driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Spanish\"))")); //scroll down to the element and click
		element.click();
		return this;
	}
	public CreateNewWallet1 Scrollto_French() {
		WebElement element=  (WebElement)driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"French\"))")); //scroll down to the element and click
		element.click();
		return this;
	}
	public WebElement ClickOnContinue() {
		return Continue;
	}
	public CreateNewWallet1 Click_On_Continue() {
		this.ClickOnContinue().click();
		return this;
	}
	@SuppressWarnings("deprecation")
	public CreateNewWallet1 DoubleTap(int a,int b) throws InterruptedException {

		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(driver);   
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet Name\"]")).click();
		Thread.sleep(20);
		touchAction.tap(PointOption.point(a, b)).perform();
		Thread.sleep(20);
		touchAction.tap(PointOption.point(a, b)).perform();
		Thread.sleep(20);
		return this;
	}
	public WebElement Cut() {
		return Cut;
	}
	public CreateNewWallet1 Click_On_Cut() {
		this.Cut().click();
		return this;
	}
	public WebElement Copy() {
		return Copy;
	}
	public CreateNewWallet1 Click_On_Copy() {
		this.Copy().click();
		return this;
	}
	public WebElement Paste() {
		return Paste;
	}
	public CreateNewWallet1 Click_On_PasteOnSelectedText() {
		this.Paste().click();
		return this;
	}
	public WebElement Paste1() {
		return Paste1;
	}
	public CreateNewWallet1 Click_On_PasteOnemptytextfieldText() {
		this.Paste1().click();
		return this;
	}
	public WebElement Chinese() {
		return Chinese;
	}
	public CreateNewWallet1 Chinese_Langauge() {
		this.Chinese().click();
		return this;

	}	
	public WebElement Dutch() {
		return Dutch;
	}
	public CreateNewWallet1 Dutch_Langauge() {
		this.Dutch().click();
		return this;

	}	
	public WebElement German() {
		return German;
	}
	public CreateNewWallet1 German_Langauge() {
		this.German().click();
		return this;

	}	
	public WebElement Japanese() {
		return Japanese;
	}
	public CreateNewWallet1 Japanese_Langauge() {
		this.Japanese().click();
		return this;

	}	
	public WebElement Portuguese() {
		return Portuguese;
	}
	public CreateNewWallet1 Portuguese_Langauge() {
		this.Portuguese().click();
		return this;

	}	

	public WebElement Russian() {
		return  Russian;
	}
	public CreateNewWallet1 Russian_Langauge() {
		this.Russian().click();
		return this;

	}	
	
	
	
	public CreateNewWallet1 Scroll_Down() throws InterruptedException {
		driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).click();
		Thread.sleep(2000);
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()";
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		return this;}
		public CreateNewWallet1 Scroll_Up() throws InterruptedException {
		
		Thread.sleep(2000);
		String scrollElement3 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollBackward()";
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement3));
		return this;
	}

		public WebElement OkbuttoninUEW() {
			return okButton1;
		}
		public CreateNewWallet1 OkbuttoninUEWclick() {
			this.OkbuttoninUEW().click();
			return this;

		}public CreateNewWallet1 DoubleTapGeneral(int a,int b) throws InterruptedException {

			@SuppressWarnings("rawtypes")
			TouchAction touchAction = new TouchAction(driver);   
			Thread.sleep(20);
			touchAction.tap(PointOption.point(a, b)).perform();
			Thread.sleep(20);
			touchAction.tap(PointOption.point(a, b)).perform();
			Thread.sleep(20);
			return this;
		}
		public WebElement Cancel() {
			return CancelButton;
		}
		public CreateNewWallet1 cancel_button() {
			this.Cancel().click();
			return this;

		}
		public WebElement Swicthtodate() {
			return Switchto;
		}
		public CreateNewWallet1 swicthtodatebutton() {
			this.Swicthtodate().click();
			return this;

		}
		public WebElement Inputdate() {
			return Switchto;
		}
		public CreateNewWallet1 Inputdateformate() {
			this.Swicthtodate().click();
			return this;

		}
		public WebElement passdate() {
			return EDitedateinput;
		}
		public CreateNewWallet1 passdateintextfield() {
			this.passdate().click();
			return this;

		}
		
		
}







