package officialWallet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class AddressBook {
	AndroidDriver driver;

	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"2\"]")
	private WebElement addAddress;

	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"0\"]")
	private WebElement Scanner;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"0\"]")
	private WebElement enterName;

	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"1\"]")
	private WebElement enterAddress;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Reset\"]")
	private WebElement Reset;

	@AndroidFindBy(accessibility ="Add")
	private WebElement Add;
	
	@AndroidFindBy(accessibility = "Address Book")
	private  WebElement Addressbookbutton;
	
	@AndroidFindBy(accessibility = "Delete")
	private  WebElement Delete;
	
	@AndroidFindBy(accessibility = "Edit")
	private  WebElement edit;
	
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Invalid BDX address\"]")
	private  WebElement InvalidAddress;
	
	@AndroidFindBy(accessibility = "Name should not be empty")
	private  WebElement NameShouldnotbeempty;
	
	@AndroidFindBy(accessibility = "Address should not be empty")
	private  WebElement AddressShouldnotbeempty;
	
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]/android.view.View")
	private  WebElement invalidname;
	
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
	public WebElement scannerButton() {
		return Scanner;
	}
	public AddressBook clickOnScannerButton() {
		this.scannerButton().click();
		return this;
	}
	public WebElement DeleteAddress() {
		return Delete;
	}
	public AddressBook clickOnDeleteAddressButton() {
		this.DeleteAddress().click();
		return this;
	}
	public WebElement editAddress() {
		return edit;
	}
	public AddressBook clickOneditAddressButton() {
		this.editAddress().click();
		return this;
	}
	
	public WebElement InvalidAddress() {
		return InvalidAddress;
	}

	public WebElement Invalidname() {
		return invalidname;
	}

	public WebElement nameshouldnotbeempty() {
		return NameShouldnotbeempty;
	}
	public WebElement addressshouldnotbeempty() {
		return AddressShouldnotbeempty;
	}
	
	
	
	public AddressBook Swipe_Rightend_to_Left(int a) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("miuix.stub:id/alertTitle"))));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@content-desc='Address Book']"))));
		Dimension windowSize = driver.manage().window().getSize();
		int screenHeight =windowSize.getHeight();
		int screenWidht =windowSize.getWidth();
		System.out.println(screenHeight);
		System.out.println(screenWidht);
		int xStartPoint =78*screenWidht/100;
		int xEndPoint =10*screenWidht/100;
		int yStartPoint =a*screenHeight/100;
		int yEndPoint =yStartPoint;
		PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
		@SuppressWarnings("rawtypes")
		PointOption endPoint =new PointOption().withCoordinates(xEndPoint, yEndPoint);
		//for(int i=0;i<=10;i++) {
		try{TouchAction touchaction = new TouchAction(driver);
		touchaction
		.press(startPoint)
		.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
		.moveTo(endPoint).release()
		.perform();
		}
		catch(Exception e) {System.out.println("Swipe OPtins are ended");
		}
		
	
		return this;
	}




}
