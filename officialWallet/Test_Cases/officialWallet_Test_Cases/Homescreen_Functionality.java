package officialWallet_Test_Cases;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.Wallet_Settings;
import scala.Equals;
@SuppressWarnings({ "deprecation", "unused" })
public class Homescreen_Functionality extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 Press;
	HomescreenPage Page;
	Wallet_Settings set;
	boolean a,b;
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Test
	public void Homescreen() throws InterruptedException, IOException {
		Press=new CreateNewWallet1(driver);
		Page=new HomescreenPage(driver);
		set=new Wallet_Settings(driver);
		TouchAction touchAction=new TouchAction(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_129<br />Test case description: Validate whether able to navigate directly to the device home screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Press
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();	
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		try{this.a=driver.findElement(By.id("com.miui.home:id/search_bar_input")).isDisplayed();}catch(Exception e) {
			this.b=driver.findElement(By.className("android.view.ViewGroup")).isDisplayed();}
		if(a||b==true) {
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the device home button",ExtentColor.GREEN));
			try {Assert.assertTrue(driver.findElement(By.id("com.miui.home:id/drop_target_bar")).isDisplayed(), "Able to navigate to the device home screen");passFailScreenshot("123");}catch(AssertionError e) {test.fail(e);passFailScreenshot("124");}}else {test.log(Status.FAIL,"Not able to go home screen");}
		driver.activateApp("io.beldex.wallet");
		Press
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_130<br />Test case description: Validate Whether all functions and buttons in the screen response for the touch action</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(10000);
		System.out.println("Pass");
		Page.clickOnReceiveButton();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Receive")).isDisplayed(),"Not able to click Receive button");test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Recieve Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("187");}
		driver.navigate().back();
		Page.clickOnAddressBookButton();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Address Book")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Address Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("180");}
		driver.navigate().back();
		Thread.sleep(1000);
		test.log(Status.INFO,MarkupHelper.createLabel("Theme",ExtentColor.GREEN));passFailScreenshot("181");
		Page.clickOnThemeChangeButton();
		test.log(Status.INFO,MarkupHelper.createLabel("ThemeChage",ExtentColor.GREEN));passFailScreenshot("182");
		Page.clickOnSendButton();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Send\"]")).isDisplayed(), "Not able to click send button");test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Send Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("183");}
		driver.navigate().back();
		Page.clickOnRescanButton();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Rescan")).isDisplayed(),"Not able to click Rescan button");test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Rescan Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("184");}
		driver.navigate().back();
		Page.clickOnTransactionsButton();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Transactions")).isDisplayed(),"Not able to click Transactions button");test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Transactions Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("185");}
		driver.navigate().back();
		Page.clickOnSettingsButton();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed(),"Not able to click Settings button");test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Settings Button",ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("186");}
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click all the function and buttons in the screen",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_140<br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.</b>");
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
		Thread.sleep(3000);
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter Your PIN")).isDisplayed(), "Asking the pin");passFailScreenshot("126");}catch(AssertionError e) {test.fail(e);passFailScreenshot("125");}
		Press
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_128<br />Test case description: Validate whether able to navigate back to the out of the App.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.navigate().back();
		Page.Yes_Button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.click the back button",ExtentColor.GREEN));
		try{this.a=driver.findElement(By.id("com.miui.home:id/search_bar_input")).isDisplayed();}catch(Exception e) {
			this.b=driver.findElement(By.className("android.view.ViewGroup")).isDisplayed();}
		if(a||b==true) {
			try {Assert.assertTrue(driver.findElement(By.id("com.miui.home:id/drop_target_bar")).isDisplayed(), "Navigated out of the App");passFailScreenshot("13333");}catch(AssertionError e) {test.fail(e);passFailScreenshot("1444");}}else {test.log(Status.FAIL,"Not able to go home screen");}
		driver.activateApp("io.beldex.wallet");
		Press
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_135<br />Test case description: Validate the Wallet name and Bdx balance</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		String vas=driver.findElement(By.xpath("//android.view.View[@index=\"1\"]")).getAttribute("content-desc");
		System.out.println(vas);
		String vas1=driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).getAttribute("content-desc");
		System.out.println(vas1);
		test.log(Status.PASS,MarkupHelper.createLabel("1.check the screen",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@index=\"1\"]")).isDisplayed(), "Showing Wallet Name "+vas);passFailScreenshot("129");}catch(AssertionError e) {test.fail(e);passFailScreenshot("130");}
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).isDisplayed(), "BDX balance "+vas1);passFailScreenshot("131");}catch(AssertionError e) {test.fail(e);passFailScreenshot("132");}
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_134<br />Test case description: Validate the navigation to the Menu screen in both forward and backward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(18000);
		Page.clickOnSettingsButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the menu icon in the left corner",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed(), "Able to navigate to the menu screen ");passFailScreenshot("134");}catch(AssertionError e) {test.fail(e);passFailScreenshot("133");}
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed(), "Able to navigate back to the home screen ");passFailScreenshot("136");}catch(AssertionError e) {test.fail(e);passFailScreenshot("135");}
		Page.clickOnSettingsButton();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_131<br />Test case description: Validate the navigation to the Account screen in both forward and backward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		set.Account_Click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the account function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Accounts")).isDisplayed(), "Able to navigate to the account screen ");passFailScreenshot("138");}catch(AssertionError e) {test.fail(e);passFailScreenshot("137");}
		driver.navigate().back();
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed(), "Able to navigate back to the home screen ");passFailScreenshot("140");}catch(AssertionError e) {test.fail(e);passFailScreenshot("139");}
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_132<br />Test case description: Validate the navigation to the Send screen in both forward and backward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.clickOnSendButton();
		Thread.sleep(3000);
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Send\"]")).isDisplayed(), "Able to navigate to the Send screen ");passFailScreenshot("163");}catch(AssertionError e) {test.fail(e);passFailScreenshot("164");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the send function",ExtentColor.GREEN));
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed(), "Able to navigate back to the home screen ");passFailScreenshot("166");}catch(AssertionError e) {test.fail(e);passFailScreenshot("165");}
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_133<br />Test case description: Validate the navigation to the Receive screen in both forward and backward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.clickOnReceiveButton();
		Thread.sleep(3000);
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Receive")).isDisplayed(), "Able to navigate to the receive screen");passFailScreenshot("168");}catch(AssertionError e) {test.fail(e);passFailScreenshot("169");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the receive function",ExtentColor.GREEN));
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed(), "Able to navigate back to the home screen ");passFailScreenshot("171");}catch(AssertionError e) {test.fail(e);passFailScreenshot("170");}
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_139<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the receive function",ExtentColor.GREEN));
		String vas00=driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel("Showing the balance "+vas00,ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).isDisplayed(), "BDX balance "+vas00);passFailScreenshot("173");}catch(AssertionError e) {test.fail(e);passFailScreenshot("174");}
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000);
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_138<br />Test case description: Validate the Showing of the transaction history</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.clickOnTransactionsButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Check the Showing of the Transaction history",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Transactions")).isDisplayed(), "Showing the transaction history");passFailScreenshot("142");}catch(AssertionError e) {test.fail(e);passFailScreenshot("141");}
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_141<br />Test case description: Validate transaction filter option by both Incoming and Outgoing</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.findElement(AppiumBy.accessibilityId("Show menu")).click();//Filter option
		test.log(Status.PASS,MarkupHelper.createLabel("1.Select both the Incoming and Outgoing option",ExtentColor.GREEN));
		String adf=driver.findElement(AppiumBy.accessibilityId("Incoming")).getAttribute("checked");
		System.out.println(adf);
		String adf1=driver.findElement(AppiumBy.accessibilityId("Outgoing")).getAttribute("checked");
		System.out.println(adf1);
		try {Assert.assertEquals(adf,"true");passFailScreenshot("144");}catch(AssertionError e) {test.fail(e);passFailScreenshot("143");}
		try {Assert.assertEquals(adf1,"true");passFailScreenshot("146");}catch(AssertionError e) {test.fail(e);passFailScreenshot("145");}
		touchAction.tap(PointOption.point(526,1300 )).perform();
		//Page.FilterBy_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_142<br />Test case description: Validate transaction filter option by Incoming</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.FilterBy_Click();
		touchAction.tap(PointOption.point(948,532 )).perform();//Outgoing filter click
		Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Select only incoming option",ExtentColor.GREEN));
		String adfg=driver.findElement(AppiumBy.accessibilityId("Incoming")).getAttribute("checked");
		try {Assert.assertEquals(adfg, "true");passFailScreenshot("148");}catch(AssertionError e) {test.fail(e);passFailScreenshot("147");}
		touchAction.tap(PointOption.point(526,1300 )).perform();
		Page.FilterBy_Click();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(948,431 )).perform();//incoming filter click
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_143<br />Test case description: Validate transaction filter option by Outgoing</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(4000);
		touchAction.tap(PointOption.point(948,532 )).perform();//Outgoing filter click
		test.log(Status.PASS,MarkupHelper.createLabel("1.Select only Outgoing option",ExtentColor.GREEN));
		try {Assert.assertEquals(adf1, "true");passFailScreenshot("150");}catch(AssertionError e) {test.fail(e);passFailScreenshot("149");}
		touchAction.tap(PointOption.point(526,1300 )).perform();
		Page.FilterBy_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_144<br />Test case description: Validate transaction filter option by Transaction by date by future date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.Transaction_BYdate_Click();//Transaction by date
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Transaction by date ",ExtentColor.GREEN));
		String ader=driver.findElement(AppiumBy.accessibilityId("5, Thursday, October 5, 2023")).getAttribute("clickable");
		try{Assert.assertEquals(ader, "true","Selected date<b>5, Thursday, October 5, 2023</b>");passFailScreenshot("153");test.log(Status.PASS,MarkupHelper.createLabel("2.Select the future date in the calendar",ExtentColor.GREEN));}
		catch(AssertionError e) {test.fail(e);passFailScreenshot("154");}
		Press.ClickOnOkButton();
		Page.FilterBy_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_145<br />Test case description: Validate transaction filter option by Transaction by date by Past date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.Transaction_BYdate_Click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Transaction by date ",ExtentColor.GREEN));
		String adqr=driver.findElement(AppiumBy.accessibilityId("1, Sunday, October 1, 2023")).getAttribute("clickable");
		try{Assert.assertEquals(adqr, "true","Selected date<b>1, Sunday, October 1, 2023</b>");driver.findElement(AppiumBy.accessibilityId("1, Sunday, October 1, 2023")).click();passFailScreenshot("155");test.log(Status.PASS,MarkupHelper.createLabel("2.Select the past date in the calendar",ExtentColor.GREEN));}
		catch(AssertionError e) {test.fail(e);passFailScreenshot("156");}
		Press.ClickOnOkButton();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_146<br />Test case description: Validate transaction filter option by Transaction by date by Today date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.FilterBy_Click();
		Page.Transaction_BYdate_Click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Transaction by date ",ExtentColor.GREEN));
		String adq=driver.findElement(AppiumBy.accessibilityId("4, Wednesday, October 4, 2023")).getAttribute("clickable");
		try{Assert.assertEquals(adq, "true","Selected date<b>4, Wednesday, October 4, 2023</b>");driver.findElement(AppiumBy.accessibilityId("4, Wednesday, October 4, 2023")).click();passFailScreenshot("157");test.log(Status.PASS,MarkupHelper.createLabel("2.Select todays date in the calendar",ExtentColor.GREEN));}
		catch(AssertionError e) {test.fail(e);passFailScreenshot("158");}
		Press.ClickOnOkButton();
		test=extent.createTest("Test Scenario:	To Check the working of the Home Screen and its functionality ", "<b><br /> Test case Id: TC_147<br />Test case description: Validate transaction filter option Whether able to set particular from date to To date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Page.FilterBy_Click();
		Page.Transaction_BYdate_Click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Transaction by date ",ExtentColor.GREEN));
		String ad1=driver.findElement(AppiumBy.accessibilityId("1, Sunday, October 1, 2023")).getAttribute("clickable");
		String ad2=driver.findElement(AppiumBy.accessibilityId("4, Wednesday, October 4, 2023")).getAttribute("clickable");
		try{if(ad1.equals(ad2)) {Assert.assertTrue(true, "Able to select the date");driver.findElement(AppiumBy.accessibilityId("1, Sunday, October 1, 2023")).click();test.log(Status.PASS,MarkupHelper.createLabel("2.click the particular date ",ExtentColor.GREEN));Thread.sleep(2000);driver.findElement(AppiumBy.accessibilityId("4, Wednesday, October 4, 2023")).click();test.log(Status.PASS,MarkupHelper.createLabel("3.Again click a another particular date ",ExtentColor.GREEN));passFailScreenshot("160");}}catch(AssertionError e) {test.fail(e);passFailScreenshot("161");}
		Press.ClickOnOkButton();
	}}
