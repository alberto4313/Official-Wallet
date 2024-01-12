package officialWallet_Test_Cases;

import java.awt.image.BufferedImage;  

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import officialWallet.AccountsScreen;
import officialWallet.AddressBook;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.ReceiveScreen;
import officialWallet.SendPage;
import officialWallet.ShowKeys;
import officialWallet.ShowSeed_Screen;
import officialWallet.Wallet_Settings;
import officialWallet_Test_Cases.W3cswipeactions.SwipeDirection;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
public class ReceiveScreenAndItsFunctionality extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 password; 
	SendPage sendscreen;
	Wallet_Settings settings;
	AccountsScreen account;
	ShowSeed_Screen seed;
	HomescreenPage Homepage;
	AddressBook AddressBook;
	ShowKeys show;
	ReceiveScreen Receive;
	String QR;
	public static	Logger log= LogManager.getLogger(ReceiveScreenAndItsFunctionality.class);
	@Test(priority =1)
	public void TC_322() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_322 <br />Test case description: Validate the working of the buttons and functions in the screen.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		password=new CreateNewWallet1(driver);
		password.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage=new HomescreenPage(driver);
		try {	Homepage.clickOnReceiveButton();
		seed=new ShowSeed_Screen(driver);
		Receive=new ReceiveScreen(driver);
		Thread.sleep(3000);
		Receive.Click_Copy_Button();
		Assert.assertTrue(seed.Copiedbutton().isDisplayed());System.out.println("ABle to copy the address");
		Thread.sleep(1000);
		Receive.ClickOnEnterAmountField();
		Thread.sleep(1000);
		Receive	.ClickshareQR();
		W3ctouchactions w3c=new W3ctouchactions();
		for(int i=0;i<=11;i++) {
			w3c.swipe(SwipeDirection.SWIPE_RIGHT);
			Thread.sleep(1000);}
		Receive.ClickOnCancelButton();
		Thread.sleep(1000);
		Receive.ClicksubAddress();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		Receive.ClickOnAddSubAddressButton();
		Thread.sleep(1000);
		Receive.ClickAddSubAddressTextField();
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		Actions act=new Actions(driver);
		act.sendKeys(generatedString).perform();
		Receive.ClickCreateButton();
		test.log(Status.PASS, MarkupHelper.createLabel("1.Click all the buttons and functions one by one",ExtentColor.GREEN));
		test.log(Status.INFO,MarkupHelper.createLabel("Responding for the touch action ",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.pass("Click all the buttons and functions one by one failed "+e); passFailScreenshot("0.0.0.01");}
	}
	@Test(priority =2)
	public void TC_323() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_323 <br />Test case description: Validate Whether able to navigate back to the home screen.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.navigate().back();
		try {Assert.assertTrue(Homepage.SendButton().isDisplayed()); test.log(Status.PASS, MarkupHelper.createLabel("1.click the back button",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Able to navigate to the previous screen",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Not able to navigate back "+e); passFailScreenshot("222..333.2");}
	}
	@Test(priority =3)
	public void TC_325() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_325 <br />Test case description: Validate whether amount field is enable.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage.clickOnReceiveButton();
		Receive.ClickOnEnterAmountField();
		String IsFocuesd=Receive.EnterAmountTextField().getAttribute("focused");
		try {Assert.assertTrue(IsFocuesd.equalsIgnoreCase("true"));test.log(Status.PASS, MarkupHelper.createLabel("1.Click the amount field",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Enabled to enter a value",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Enabled to enter a value "+e);passFailScreenshot("88..99..77..55..4");}
	}

	@Test(priority =4)
	public void TC_327() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_327 <br />Test case description: Validate whether all possible share options in the device are enable..  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Receive.ClickshareQR();
		test.log(Status.PASS, MarkupHelper.createLabel("1.click the share icon",ExtentColor.GREEN));
		Thread.sleep(1000);
		passFailScreenshot("lut77");
		try {Assert.assertTrue(driver.findElement(By.id("miuix.stub:id/alertTitle")).isDisplayed());		test.log(Status.PASS, MarkupHelper.createLabel("2.check the option showing",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Showing the share option and Able to share the wallet address",ExtentColor.BLUE));}catch(Exception | AssertionError e) {test.fail("Not showing the share option and not able to share the wallet address"); passFailScreenshot("htyuu444");}
		W3ctouchactions swipeRight=new W3ctouchactions();
		swipeRight.swipe(SwipeDirection.SWIPE_RIGHT);
		Receive.ClickOnCancelButton();
		Thread.sleep(1000);
	}
	@Test(priority =5)
	public void TC_328() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_328 <br />Test case description: Validate whether Bar Code Changes for different amount.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Receive.Click_Copy_Button();
		
		String Copied_Wallet=driver.getClipboardText();
		
		readQRCode(Copied_Wallet);
		String Before=this.QR;
		test.log(Status.INFO,MarkupHelper.createLabel("Before entering the value QR code value is "+this.QR,ExtentColor.BLUE));
		Thread.sleep(2000);
		Receive.ClickOnEnterAmountField();
		Actions send=new Actions(driver);
		send.sendKeys("0.0001").perform();
		test.log(Status.PASS, MarkupHelper.createLabel("1.enter a valid amount",ExtentColor.GREEN));
	
		readQRCode(Copied_Wallet);
		String After=this.QR;
	
		test.log(Status.INFO,MarkupHelper.createLabel("After entering the value QR code value is "+this.QR,ExtentColor.BLUE));
		try {Assert.assertNotEquals(Before, After); test.log(Status.PASS, MarkupHelper.createLabel("2.Check the bar code",ExtentColor.GREEN)); 	   test.log(Status.INFO,MarkupHelper.createLabel("Barcode is changing for different amount",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Barcode is changing for different amount "+e);passFailScreenshot("tTasdDSA");}
	}
	@Test(priority =6)
	public void TC_329() throws IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_329 <br />Test case description: Validate the Wallet Address.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		String WalletAddress=	Receive.WalletAddress().getAttribute("content-desc");
		try {Assert.assertFalse(WalletAddress.isBlank()); test.log(Status.PASS, MarkupHelper.createLabel("1.Check the wallett address",ExtentColor.GREEN)); test.log(Status.INFO,MarkupHelper.createLabel("Showing the wallet address "+WalletAddress,ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Not Showing the wallet address ");passFailScreenshot("456ABCD");}
	}
	@Test(priority =7)
	public void TC_331() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_331 <br />Test case description: Validate the text box of the subaddress function with valid value.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Receive.ClickOnAddSubAddressButton();
		Thread.sleep(2000);
		Receive.ClickAddSubAddressTextField();
		String DAta="10";
		Actions act=new Actions(driver);
		act.sendKeys(DAta).perform();
		try {Assert.assertTrue(Receive.SubaddressAlreadyExist().isDisplayed());driver.navigate().back();}catch(Exception|AssertionError e ) {}
		Thread.sleep(2000);
		test.log(Status.PASS, MarkupHelper.createLabel("1.enter a valid value in subaddress textbox",ExtentColor.GREEN));
		Receive.ClickCreateButton();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click create ",ExtentColor.GREEN));
		Thread.sleep(2000);
		Receive.ClicksubAddress();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" +DAta +"\"))")).click();
		Thread.sleep(2000);
		String enteredvalue =Receive.selectsubAddress().getAttribute("content-desc");
		try {Assert.assertEquals("10",enteredvalue ); test.log(Status.PASS, MarkupHelper.createLabel("3.Check the receive screen",ExtentColor.GREEN)); test.log(Status.INFO,MarkupHelper.createLabel("Showing the entered subaddress value",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Not showing the entered subaddress value "+e); passFailScreenshot("AWERT780");}
	}


	@Test(dataProvider = "TestingData", priority =8)
	public void TC_332(String DAta, String steps) throws InterruptedException, IOException {

		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_332 <br />Test case description: Validate the text box of the subaddress function with Aplhabets in both uppercase and lower case,Numerical value,Special characters and Alphanumeric value.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		seed=new ShowSeed_Screen(driver);
		log=LogManager.getLogger(ShouldDelete.class);
		Receive=new ReceiveScreen(driver);
		log.info("Launched Beldex Official Wallet App");
		Receive.ClickOnAddSubAddressButton();
		log.info("Clicked on Add Sub Address Button");
		Thread.sleep(3000);
		Receive.ClickAddSubAddressTextField();
		log.info("Clicked on Add Sub Address text field cursor is blinking");
		Actions send=new Actions(driver);
		send.sendKeys(DAta).perform();
		test.log(Status.PASS, MarkupHelper.createLabel(steps,ExtentColor.GREEN));
		Receive.ClickCreateButton();
		test.log(Status.PASS, MarkupHelper.createLabel("Click create ",ExtentColor.GREEN));
		try {Assert.assertTrue(Receive.EnterValidSubAddress().isDisplayed());driver.navigate().back();}catch(Exception|AssertionError e ) {}
		try {Assert.assertTrue(Receive.SubaddressAlreadyExist().isDisplayed());driver.navigate().back();}catch(Exception|AssertionError e ) {}
		Receive.ClicksubAddress();						
		try {
			Assert.assertTrue(driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" +DAta +"\"))")).isDisplayed()); //scroll down to the element and click
			;test.log(Status.INFO,MarkupHelper.createLabel("Saving the entered value",ExtentColor.BLUE)); driver.navigate().back(); }catch(  AssertionError e) {test.fail("Not saving the entered value "+e );  passFailScreenshot("585EDAATT");		   
			System.out.println(e);driver.navigate().back(); }catch(Exception e) {test.warning("Not saving the entered value "+DAta ); passFailScreenshot("585EDAqTT");driver.navigate().back();}
		Thread.sleep(2000);
	}
	@DataProvider(name="TestingData")
	public Object [][]TestData(){
		Object[][] Data=new Object [7][2];
		Data[0][0]="ALBERTOO";
		Data[0][1]="1.enter a Alphabets in uppercase value in subaddress textbox";
		Data[1][0] ="albertoo";
		Data[1][1]="2.enter a Alphabets in lowercase value in subaddress textbox";
		Data[2][0] ="ALBErtoo";
		Data[2][1]="3.enter a Alphabets in uppercase and lowercase value in subaddress textbox";
		Data[3][0] ="12345678";
		Data[3][1]="4.enter a number value in subaddress textbox";
		Data[4][0] ="ALBERto12131";
		Data[4][1]="5.enter a Alphanumerical value in subaddress textbox";
		Data[5][0] ="@$@$@$$$";
		Data[5][1]="6.enter a special charcter value in subaddress textbox";
		Data[6][0] ="@$Vadartr";
		Data[6][1]="7.enter a special charcter value and alphabets in subaddress textbox";
		return Data;
	}
	@Test(priority =9)
	public void TC_336() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_336 <br />Test case description: Validate Whether able to paste a value in the text box of the subaddress function.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Receive.ClickOnAddSubAddressButton();
		Thread.sleep(1000);
		Receive	.ClickAddSubAddressTextField();
		Thread.sleep(1000);
		show=new ShowKeys(driver);
		show.longpress(136, 1150);
		Thread.sleep(1000);
		driver.setClipboardText("AbletoPaste");
		password=new CreateNewWallet1(driver);
		password.Click_On_PasteOnemptytextfieldText();
		Thread.sleep(1000);
		test.log(Status.PASS, MarkupHelper.createLabel("1.paste a value in subaddress textbox",ExtentColor.GREEN));
		Receive.ClickCreateButton();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click create ",ExtentColor.GREEN));
		Receive.ClicksubAddress();
		try {
			Assert.assertTrue(driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"AbletoPaste\"))")).isDisplayed()); //scroll down to the element and click
			;test.log(Status.INFO,MarkupHelper.createLabel("Allowing to paste a value and saving the entered value",ExtentColor.BLUE)); driver.navigate().back(); }catch(  Exception|AssertionError e) {test.fail("Not able to paste value and not saving it "+e ); driver.navigate().back(); passFailScreenshot("4444141414");		   
			}}
	@Test(priority =10)
	public void TC_337() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_337 <br />Test case description: Validate Whether able to copy a value entered in the text box of the subaddress function.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(2000);
		Receive.ClickOnAddSubAddressButton();
		Thread.sleep(2000);
		Receive.ClickAddSubAddressTextField();
		Actions act=new Actions(driver);
		act.sendKeys("AbletoCopy").perform();
		Thread.sleep(2000);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a value in the subaddress textbox",ExtentColor.GREEN));
		show.longpress(136, 1150);
		Thread.sleep(2000);
		password.Click_On_Copy();
		Thread.sleep(2000);
		test.log(Status.PASS, MarkupHelper.createLabel("2.Copy the entered value",ExtentColor.GREEN));
		String Copied=driver.getClipboardText();
		try {Assert.assertEquals(Copied, "AbletoCopy");test.log(Status.INFO,MarkupHelper.createLabel("Allowing to copy the entered value",ExtentColor.BLUE)); }catch(AssertionError | Exception e) {test.fail("Not allowing to copy the entered value");passFailScreenshot("assaassa44");}
	}
	@Test(priority =11)
	public void TC_338() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_338 <br />Test case description: Validate the text box of the subaddress function with value above boundary limit.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(2000);
		show.longpress(136, 1150);
		Thread.sleep(2000);
		password.Click_On_Cut();
		Actions act=new Actions(driver);
		act.sendKeys("ABCDEFGHIJKLMNOPRTYUI").perform();
		Thread.sleep(2000);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a value above boundary limit in the subaddress textbox",ExtentColor.GREEN));
		Receive.ClickCreateButton();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click create ",ExtentColor.GREEN));
		try {	Receive.AboveBoundryValueError().isDisplayed(); 		 test.log(Status.PASS, MarkupHelper.createLabel("3.Validate the error message",ExtentColor.GREEN)); test.log(Status.INFO,MarkupHelper.createLabel("Showing Enter a valid name upto 20 characters",ExtentColor.BLUE)); driver.navigate().back(); }catch(AssertionError | Exception e) {test.fail("Not showing Enter a valid name upto 20 characters");passFailScreenshot("AQQAQQQ");}
	}
	@Test(priority =12)
	public void TC_340() throws InterruptedException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_340 <br />Test case description: Validate whether able to switch from primary address to the subaddress.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(3000);
		String CurrentlySelected= Receive.selectsubAddress().getAttribute("content-desc");	
		try {Assert.assertEquals(CurrentlySelected, "Primary account");test.log(Status.INFO,MarkupHelper.createLabel("Primary address is selected",ExtentColor.BLUE));Receive.ClicksubAddress(); Thread.sleep(1000); List<WebElement> Howmanyaddress=driver.findElements(By.className("android.view.View"));int Howmany= Howmanyaddress.size();if(Howmany==12 ||Howmany==13 || Howmany>13) {Howmanyaddress.get(3).click();test.log(Status.PASS, MarkupHelper.createLabel("1.Select the subaddress in the screen",ExtentColor.GREEN));    test.log(Status.INFO,MarkupHelper.createLabel("Able to select different sub address",ExtentColor.BLUE)); } else{test.log(Status.INFO,MarkupHelper.createLabel("Only primary account is there, adding one more sub address and traying to select it",ExtentColor.BLUE));   System.out.println("Only primary account is there, adding one more sub address and traying to select it");  driver.navigate().back(); Receive.ClickOnAddSubAddressButton().ClickAddSubAddressTextField();Actions act=new Actions(driver);act.sendKeys("OneMore").perform();Receive.ClickCreateButton(); Receive.ClicksubAddress();Thread.sleep(2000); List<WebElement> Howmanyaddress1=driver.findElements(By.className("android.view.View")); Howmanyaddress1.get(3).click();test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a value above boundary limit in the subaddress textbox",ExtentColor.GREEN));  test.log(Status.INFO,MarkupHelper.createLabel("Able to select different sub address",ExtentColor.BLUE));     System.out.println("Selected different sub address");}}catch(AssertionError | Exception e) {
			Receive.ClicksubAddress();  driver.findElement( AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Primary account\"))")).click(); Thread.sleep(2000); String CurrentlySelected1= Receive.selectsubAddress().getAttribute("content-desc");Assert.assertEquals(CurrentlySelected1, "Primary account");	Thread.sleep(2000);Receive.ClicksubAddress();Thread.sleep(2000);List<WebElement> Howmanyaddress=driver.findElements(By.className("android.view.View")); Thread.sleep(2000);int Howmany= Howmanyaddress.size();if(Howmany==12 ||Howmany==13 || Howmany>13 ) {Howmanyaddress.get(3).click();test.log(Status.PASS, MarkupHelper.createLabel("1.Select the subaddress in the screen",ExtentColor.GREEN));   test.log(Status.INFO,MarkupHelper.createLabel("Able to select different sub address",ExtentColor.BLUE));   System.out.println("Selected different sub address"); //scroll down to the element and click
			test.info(e);   ; System.out.println("Added Value is showing");}}
	}  @Test(priority =13)
	public void TC_342() throws InterruptedException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_342 <br />Test case description: Validate the Receive functionality without internet connection.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(2000);
		try {	driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Turn off the device internet connection",ExtentColor.GREEN));
		Receive.ClickOnAddSubAddressButton();
		Thread.sleep(2000);
		Receive.ClickAddSubAddressTextField()
		;
		String	DAta="Agther";
		Actions act=new Actions(driver);
		act.sendKeys(DAta).perform();
		Thread.sleep(2000);
		Receive.ClickCreateButton();
		Thread.sleep(2000);
		Receive.ClicksubAddress();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" +DAta +"\"))")).isDisplayed();test.log(Status.PASS, MarkupHelper.createLabel("2.Check the wroking of the receive function",ExtentColor.GREEN));  test.log(Status.INFO,MarkupHelper.createLabel("working without internet connection",ExtentColor.BLUE));}catch(AssertionError | Exception e) {test.fail("Not working without internet connection"+e);}	
		Thread.sleep(2000);
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click(); Thread.sleep(4000);}
	@Test(priority =14)
	public void TC_343() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Validate the Receive Screen and its functionalities.   ", "<b><br /> Test case Id:TC_343 <br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.lockDevice();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Lock the Screen of the device",ExtentColor.GREEN));
		driver.unlockDevice();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Unlock the screen",ExtentColor.GREEN));
		Dimension windowSize = driver.manage().window().getSize();
		int screenHeight =windowSize.getHeight();
		int screenWidht =windowSize.getWidth();
		int xStartPoint =50*screenWidht/100;
		int xEndPoint =xStartPoint;
		int yStartPoint =96*screenHeight/100; 
		int yEndPoint =7*screenHeight/100;
		PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
		@SuppressWarnings("rawtypes")
		PointOption endPoint =new PointOption().withCoordinates(xEndPoint, yEndPoint);
		try{TouchAction touchaction = new TouchAction(driver);
		touchaction
		.press(startPoint)
		.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
		.moveTo(endPoint).release()
		.perform();}catch(Exception e) {System.out.println("not");}
		try{Actions act=new Actions(driver);
		act.sendKeys(Keys.NUMPAD9)
		.sendKeys(Keys.NUMPAD8)
		.sendKeys(Keys.NUMPAD7)
		.sendKeys(Keys.NUMPAD6).build().perform();}catch(Exception e) {}
		Thread.sleep(3000);
		try {driver.findElement(By.xpath("//*[@text=\"Use USB for\"]")).isDisplayed(); driver.findElement(By.xpath("//*[@text=\"Cancel\"]")).click();}catch(AssertionError | Exception e) {}
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter Your PIN")).isDisplayed(), "Asking the pin");passFailScreenshot("126");}catch(AssertionError e) {test.fail(e);passFailScreenshot("125");}
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
	}
	void readQRCode(String WalletAddress) throws IOException, InterruptedException {
		Thread.sleep(12000);
		List<WebElement> qrCodeElements=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
		WebElement qrCodeElement = qrCodeElements.get(5);

		//WebElement qrCodeElement = driver.findElement(By.id("com.miui.gallery:id/home_page_recycler"));
		File screenshot = driver.getScreenshotAs(OutputType.FILE);

		String content = decodeQRCode(generateImage(qrCodeElement, screenshot));
		System.out.println(content);

		this.QR=content;
		try { org.testng.Assert.assertEquals(content,WalletAddress); System.out.println("equal"); }catch(AssertionError | Exception e) {System.out.println("Not equal");}
	}











	private BufferedImage generateImage( WebElement element, File screenshot) throws IOException {
		BufferedImage fullImage = ImageIO.read(screenshot);
		Point imageLocation = element.getLocation();

		int qrCodeImageWidth = element.getSize().getWidth();
		int qrCodeImageHeight = element.getSize().getHeight();

		int pointXPosition = imageLocation.getX();
		int pointYPosition = imageLocation.getY();

		BufferedImage qrCodeImage = fullImage.getSubimage(pointXPosition, pointYPosition, qrCodeImageWidth, qrCodeImageHeight);
		ImageIO.write(qrCodeImage, "png", screenshot);





		return qrCodeImage;
	}

	private static String decodeQRCode(BufferedImage qrCodeImage) {
		Result result = null;
		try {
			BufferedImageLuminanceSource  source = new BufferedImageLuminanceSource(qrCodeImage);
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

			result = new MultiFormatReader().decode(bitmap);
		} catch (NotFoundException e) {
			System.out.println("QRCode not found"+ e);
		}
		return result.getText();
	}









}
 