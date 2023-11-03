package vee4.officialWallet;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Wallet_Settings_Screen extends DesiredCapabilitesOfDevice{
	Wallets wallet;
	CreateNewWallet1 password;
	HomescreenPage Homepage;
	Wallet_Settings settings;


	@Test
	public void TC_165() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_165<br />Test case description: Validate whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage
		.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();
		List<WebElement> awd=driver.findElements(By.className("android.view.View"));
		Thread.sleep(2000);
		String ar=awd.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+ar+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(ar);
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());test.log(Status.PASS,"1.Click the back button");}catch(Exception e) {test.fail("Not Able to navigate to the previous screen");passFailScreenshot("01");}

	}@Test(dependsOnMethods = {"TC_165"})
	public void TC_166() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_166<br />Test case description: Validate whether functions and buttons in the screen reponse for the touch action</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		settings
		.Wallet_settings_Click();
		List<WebElement> awd=driver.findElements(By.className("android.view.View"));
		awd.get(3).click();
		List<WebElement> awd1=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd1.get(0).isDisplayed());test.log(Status.INFO, " clicked on Currnet  Node option and opened Nodes screen");}catch(Exception e) {test.fail("Not able to open Current Nodes Screen");passFailScreenshot("8");}
		String Node=awd1.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Node+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Node); 
		driver.navigate().back();
		Thread.sleep(2000);
		List<WebElement> awd3=driver.findElements(By.className("android.view.View"));
		awd3.get(5).click();
		List<WebElement> awd4=driver.findElements(By.className("android.view.View")); 
		Thread.sleep(2000);
		String Display=awd4.get(8).getAttribute("content-desc");
		System.out.println(Display);
		List<WebElement> awd2=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Beldex Full Balance")).isDisplayed());test.log(Status.INFO, " clicked on Display Balance AS dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Display Balance AS  dropdown");passFailScreenshot("8");}
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Display+"<br /><br /></b>",ExtentColor.WHITE));
		awd2.get(8).click();
		Thread.sleep(2000);
		List<WebElement> awd6=driver.findElements(By.className("android.view.View"));
		awd6.get(6).click();
		Thread.sleep(2000);
		List<WebElement> awd5=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd5.get(10).isDisplayed());test.log(Status.INFO, " clicked on Decimals dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Decimals dropdown");passFailScreenshot("8");}
		String Decimals=awd5.get(10).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Decimals+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Decimals); 
		Thread.sleep(5000);
		awd5.get(10).click();
		List<WebElement> awd7=driver.findElements(By.className("android.view.View"));
		//TO Disable the Fiat Currency conversion toggle  button
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(PointOption.point(940, 901)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Disabled the Fiat Currency conversion toggle  button");
		//TO Enable the Fiat Currency conversion toggle  button
		touchAction.tap(PointOption.point(1010, 901)).perform();
		test.log(Status.INFO," Enabled the Fiat Currency conversion toggle  button");
		String 	Title=awd7.get(7).getAttribute("content-desc");
		System.out.println(Title); 
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Title+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//Currency drop down option
		List<WebElement> awd8=driver.findElements(By.className("android.view.View"));
		awd8.get(8).click(); 
		Thread.sleep(2000);
		List<WebElement> awd10=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd10.get(11).isDisplayed());test.log(Status.INFO, " clicked on Currency dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Currency dropdown");passFailScreenshot("10");}
		String Currency=awd10.get(11).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Currency+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Currency); 
		Thread.sleep(3000);
		awd10.get(0).click();
		Thread.sleep(3000);
		//Fee Priority drop down option
		List<WebElement> awd9=driver.findElements(By.className("android.view.View"));
		awd9.get(9).click(); 
		Thread.sleep(2000);
		List<WebElement> awd11=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd11.get(6).isDisplayed());test.log(Status.INFO, " clicked on Fee Priority dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open fee priority dropdown");passFailScreenshot("11");}
		String Fee=awd11.get(6).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Fee+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Fee); 
		Thread.sleep(3000);
		awd11.get(6).click();
		//Save recipient address toggle button
		List<WebElement> awd12=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction1=new TouchAction(driver);
		touchAction1.tap(PointOption.point(936, 1279)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Disabled the Save recipient address toggle  button");
		//TO Enable the Save recipient address toggle button
		touchAction1.tap(PointOption.point(1004, 1279)).perform();
		test.log(Status.INFO," Enabled the Save recipient address toggle  button");
		String 	Save=awd12.get(10).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Save+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Save);
		Thread.sleep(2000);
		//Change PIN
		List<WebElement> awd13=driver.findElements(By.className("android.view.View"));
		awd13.get(12).click();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter PIN")).isDisplayed());test.log(Status.INFO, "Able to click on Change PIN");}catch(Exception e) {test.fail("Not able to open change PIN");passFailScreenshot("14");}
		driver.navigate().back();
		Thread.sleep(2000);
		//Change Language
		List<WebElement> awd14=driver.findElements(By.className("android.view.View"));
		awd14.get(13).click(); 
		Thread.sleep(2000);
		List<WebElement> awd15=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd15.get(0).isDisplayed());test.log(Status.INFO, " clicked on Select Langauge option and opened it");}catch(Exception e) {test.fail("Not able to open Select language screen");passFailScreenshot("15");}
		String Langauge=awd15.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Langauge+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Langauge); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Disable Allow Bio metric function
		List<WebElement> awd16=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction2=new TouchAction(driver);
		touchAction2.tap(PointOption.point(939, 1769)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Enabled the Allow Bio metric toggle  button");
		//TO Enable the Bio metric function toggle button
		touchAction2.tap(PointOption.point(1018, 1761)).perform();
		test.log(Status.INFO," Disabled the Allow Bio metric toggle  button");
		String 	BioMetric=awd16.get(14).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+BioMetric+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//To Disable the Dark Mode 
		List<WebElement> awd17=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.tap(PointOption.point(939, 1885)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Enabled the Dark mode  toggle  button");
		//TO Enable the Bio metric function toggle button
		touchAction3.tap(PointOption.point(1015, 1885)).perform();
		test.log(Status.INFO," Disabled the Dark mode  toggle  button");
		String 	Darkmode=awd17.get(15).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Darkmode+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//Terms @ Conditions
		List<WebElement> awd18=driver.findElements(By.className("android.view.View"));
		awd18.get(17).click(); 
		Thread.sleep(2000);
		List<WebElement> awd19=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd19.get(0).isDisplayed());test.log(Status.INFO, " clicked on Terms & Conditions option and opened it");}catch(Exception e) {test.fail("Not able to open Terms & Conditions screen");passFailScreenshot("18");}
		String Terms_Conditions=awd19.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Terms_Conditions+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Terms_Conditions); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Scroll Down
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll down");}Thread.sleep(5000);
		Thread.sleep(2000);
		//FAQ
		List<WebElement> awd20=driver.findElements(By.className("android.view.View"));
		awd20.get(15).click(); 
		Thread.sleep(2000);
		List<WebElement> awd21=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd21.get(0).isDisplayed());test.log(Status.INFO, " clicked on FAQ option and opened it");}catch(Exception e) {test.fail("Not able to open FAQ screen");passFailScreenshot("20");}
		String MainTitle=awd21.get(0).getAttribute("content-desc");
		String SecondTitle=awd21.get(2).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+MainTitle+"<br /><br /></b>"+" "+"<b>"+SecondTitle+"</b>",ExtentColor.WHITE));
		System.out.println(MainTitle+" "+SecondTitle); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Change Log
		List<WebElement> awd22=driver.findElements(By.className("android.view.View"));
		awd22.get(16).click(); 
		Thread.sleep(2000);
		List<WebElement> awd23=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd23.get(0).isDisplayed());test.log(Status.INFO, " clicked on Changelog option and opened it");}catch(Exception e) {test.fail("Not able to open Changelog screen");passFailScreenshot("22");}
		String Changelog=awd23.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Changelog+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Changelog); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Version of the application
		List<WebElement> awd24=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd24.get(17).isDisplayed());test.log(Status.INFO, "Showing the version of the application");}catch(Exception e) {test.fail("Not showing the version of the application");passFailScreenshot("24");}
		String Version=awd24.get(17).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Version  which is displayed -: "+"<b><br /><br />"+Version+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Version); 
		Thread.sleep(2000);
		//mail option
		List<WebElement> awd25=driver.findElements(By.className("android.widget.ImageView"));
		awd25.get(1).click();
		Thread.sleep(2000);
		List<WebElement> awd26=driver.findElements(By.className("android.widget.TextView"));
		try {Assert.assertTrue(awd26.get(0).isDisplayed());test.log(Status.INFO, "Clicked on Email Icon");}catch(Exception e) {test.fail("Not able to click on email icon");passFailScreenshot("26");}
		String Mail1=awd26.get(1).getAttribute("text");
		String Mail2=awd26.get(2).getAttribute("text");
		test.log(Status.INFO,MarkupHelper.createLabel("After clicking the mail icon showing -: "+"<b><br /><br />"+Mail1+"<br /><br /></b>"+" "+"<b>"+Mail2+"</b>",ExtentColor.WHITE));
		passFailScreenshot("28");
		System.out.println(Mail1+""+Mail2); 

		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(2000);
		//GIT
		List<WebElement> awd27=driver.findElements(By.className("android.widget.ImageView"));
		awd27.get(2).click();
		Thread.sleep(5000);
		try {Assert.assertTrue(driver.findElement(By.id("com.android.chrome:id/url_bar")).isDisplayed());test.log(Status.INFO, "Clicked on GIT Icon");passFailScreenshot("48");}catch(Exception e) {test.fail("Not able to click on GIT icon");passFailScreenshot("30");}
		Thread.sleep(2000);
		driver.navigate().back();
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		try { Homepage
			.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {}Thread.sleep(5000);
		//Telegram
		List<WebElement> awd28=driver.findElements(By.className("android.widget.ImageView"));
		awd28.get(3).click();
		Thread.sleep(3000);
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"Telegram\"]")).isDisplayed());test.log(Status.INFO, "Clicked on telegram Icon");passFailScreenshot("1002");}catch(Exception e) {test.fail("Not able to click on GIT icon");passFailScreenshot("32");}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage
		.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll down");}Thread.sleep(5000);
		//Twitter
		List<WebElement> awd29=driver.findElements(By.className("android.widget.ImageView"));
		awd29.get(4).click();
		Thread.sleep(13000);
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text=\"twitter.com/Bchat_official\"]")).isDisplayed());test.log(Status.INFO, "Clicked on Twitter Icon");passFailScreenshot("1001");}catch(Exception e) {test.fail("Not able to click on Twitter icon");passFailScreenshot("77");}
		Thread.sleep(2000);
		driver.navigate().back();
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		try{Homepage
			.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();}catch(Exception e) {}
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Wallet Settings")).isDisplayed());test.log(Status.PASS, "1.Click all the functions and buttons in the screen");passFailScreenshot("78");}catch(Exception e) {test.fail("Not able to click on Twitter icon");passFailScreenshot("79");}
	}

	@Test(dependsOnMethods = {"TC_166"})
	public void TC_167() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_167<br />Test case description: Validate the scrolling action in both downward and upward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll down");}Thread.sleep(2000);       
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollBackward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll up");}Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Scroll the screen in both upard and downward direction",ExtentColor.GREEN));
	}

	@Test(dependsOnMethods = {"TC_167"})
	public void TC_168() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_168<br />Test case description: Validate the version of the App</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll down");}Thread.sleep(2000);       
		List<WebElement> awd31=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd31.get(17).isDisplayed());test.log(Status.INFO, "Showing the version of the application");}catch(Exception e) {test.fail("Not showing the version of the application");passFailScreenshot("88");}
		String Version=awd31.get(17).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Version  which is displayed -: "+"<b><br /><br />"+Version+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Version); 
		Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Check the App version",ExtentColor.GREEN));

	}
	@Test(dependsOnMethods = {"TC_168"})
	public void TC_169() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_169<br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.lockDevice();
		Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Lock the Screen of the device",ExtentColor.GREEN)); 
		driver.unlockDevice();

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
		test.log(Status.PASS,MarkupHelper.createLabel("2.Unlock the screen",ExtentColor.GREEN));
		Thread.sleep(3000);
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter Your PIN")).isDisplayed(), "Asking the pin");passFailScreenshot("126");}catch(AssertionError e) {test.fail(e);passFailScreenshot("125");}
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
	}
	@Test(dependsOnMethods = {"TC_169"})
	public void TC_170() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_170<br />Test case description: Validate the working of the screen activity and functions without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollBackward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll up");}Thread.sleep(2000);


		List<WebElement> awd=driver.findElements(By.className("android.view.View"));
		awd.get(3).click();
		List<WebElement> awd1=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd1.get(0).isDisplayed());test.log(Status.INFO, " clicked on Currnet  Node option and opened Nodes screen");}catch(Exception e) {test.fail("Not able to open Current Nodes Screen");passFailScreenshot("8");}
		String Node=awd1.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Node+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Node); 
		driver.navigate().back();
		Thread.sleep(2000);
		List<WebElement> awd3=driver.findElements(By.className("android.view.View"));
		awd3.get(5).click();
		List<WebElement> awd4=driver.findElements(By.className("android.view.View")); 
		Thread.sleep(2000);
		String Display=awd4.get(8).getAttribute("content-desc");
		System.out.println(Display);
		List<WebElement> awd2=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Beldex Full Balance")).isDisplayed());test.log(Status.INFO, " clicked on Display Balance AS dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Display Balance AS  dropdown");passFailScreenshot("8");}
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Display+"<br /><br /></b>",ExtentColor.WHITE));
		awd2.get(8).click();
		Thread.sleep(2000);
		List<WebElement> awd6=driver.findElements(By.className("android.view.View"));
		awd6.get(6).click();
		Thread.sleep(2000);
		List<WebElement> awd5=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd5.get(10).isDisplayed());test.log(Status.INFO, " clicked on Decimals dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Decimals dropdown");passFailScreenshot("8");}
		String Decimals=awd5.get(10).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Decimals+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Decimals); 
		Thread.sleep(5000);
		awd5.get(10).click();
		List<WebElement> awd7=driver.findElements(By.className("android.view.View"));
		//TO Disable the Fiat Currency conversion toggle  button
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(PointOption.point(940, 901)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Disabled the Fiat Currency conversion toggle  button");
		//TO Enable the Fiat Currency conversion toggle  button
		touchAction.tap(PointOption.point(1010, 901)).perform();
		test.log(Status.INFO," Enabled the Fiat Currency conversion toggle  button");
		String 	Title=awd7.get(7).getAttribute("content-desc");
		System.out.println(Title); 
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Title+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//Currency drop down option
		List<WebElement> awd8=driver.findElements(By.className("android.view.View"));
		awd8.get(8).click(); 
		Thread.sleep(2000);
		List<WebElement> awd10=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd10.get(11).isDisplayed());test.log(Status.INFO, " clicked on Currency dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open Currency dropdown");passFailScreenshot("10");}
		String Currency=awd10.get(11).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Currency+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Currency); 
		Thread.sleep(3000);
		awd10.get(0).click();
		Thread.sleep(3000);
		//Fee Priority drop down option
		List<WebElement> awd9=driver.findElements(By.className("android.view.View"));
		awd9.get(9).click(); 
		Thread.sleep(2000);
		List<WebElement> awd11=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd11.get(6).isDisplayed());test.log(Status.INFO, " clicked on Fee Priority dropdown option and opened it");}catch(Exception e) {test.fail("Not able to open fee priority dropdown");passFailScreenshot("11");}
		String Fee=awd11.get(6).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Fee+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Fee); 
		Thread.sleep(3000);
		awd11.get(6).click();
		//Save recipient address toggle button
		List<WebElement> awd12=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction1=new TouchAction(driver);
		touchAction1.tap(PointOption.point(936, 1279)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Disabled the Save recipient address toggle  button");
		//TO Enable the Save recipient address toggle button
		touchAction1.tap(PointOption.point(1004, 1279)).perform();
		test.log(Status.INFO," Enabled the Save recipient address toggle  button");
		String 	Save=awd12.get(10).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Save+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Save);
		Thread.sleep(2000);
		//Change PIN
		List<WebElement> awd13=driver.findElements(By.className("android.view.View"));
		awd13.get(12).click();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter PIN")).isDisplayed());test.log(Status.INFO, "Able to click on Change PIN");}catch(Exception e) {test.fail("Not able to open change PIN");passFailScreenshot("14");}
		driver.navigate().back();
		Thread.sleep(2000);
		//Change Language
		List<WebElement> awd14=driver.findElements(By.className("android.view.View"));
		awd14.get(13).click(); 
		Thread.sleep(2000);
		List<WebElement> awd15=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd15.get(0).isDisplayed());test.log(Status.INFO, " clicked on Select Langauge option and opened it");}catch(Exception e) {test.fail("Not able to open Select language screen");passFailScreenshot("15");}
		String Langauge=awd15.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Langauge+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Langauge); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Disable Allow Bio metric function
		List<WebElement> awd16=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction2=new TouchAction(driver);
		touchAction2.tap(PointOption.point(939, 1769)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Enabled the Allow Bio metric toggle  button");
		//TO Enable the Bio metric function toggle button
		touchAction2.tap(PointOption.point(1018, 1761)).perform();
		test.log(Status.INFO," Disabled the Allow Bio metric toggle  button");
		String 	BioMetric=awd16.get(14).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+BioMetric+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//To Disable the Dark Mode 
		List<WebElement> awd17=driver.findElements(By.className("android.view.View"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.tap(PointOption.point(939, 1885)).perform();
		Thread.sleep(200);
		test.log(Status.INFO," Enabled the Dark mode  toggle  button");
		//TO Enable the Bio metric function toggle button
		touchAction3.tap(PointOption.point(1015, 1885)).perform();
		test.log(Status.INFO," Disabled the Dark mode  toggle  button");
		String 	Darkmode=awd17.get(15).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of checkbox-: "+"<b><br /><br />"+Darkmode+"<br /><br /></b>",ExtentColor.WHITE));
		Thread.sleep(2000);
		//Terms @ Conditions
		List<WebElement> awd18=driver.findElements(By.className("android.view.View"));
		awd18.get(17).click(); 
		Thread.sleep(2000);
		List<WebElement> awd19=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd19.get(0).isDisplayed());test.log(Status.INFO, " clicked on Terms & Conditions option and opened it");}catch(Exception e) {test.fail("Not able to open Terms & Conditions screen");passFailScreenshot("18");}
		String Terms_Conditions=awd19.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Terms_Conditions+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Terms_Conditions); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Scroll Down
		try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {test.info("Not Able to scroll down");}Thread.sleep(5000);
		Thread.sleep(2000);
		//FAQ
		List<WebElement> awd20=driver.findElements(By.className("android.view.View"));
		awd20.get(15).click(); 
		Thread.sleep(2000);
		List<WebElement> awd21=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd21.get(0).isDisplayed());test.log(Status.INFO, " clicked on FAQ option and opened it");}catch(Exception e) {test.fail("Not able to open FAQ screen");passFailScreenshot("20");}
		String MainTitle=awd21.get(0).getAttribute("content-desc");
		String SecondTitle=awd21.get(2).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+MainTitle+"<br /><br /></b>"+" "+"<b>"+SecondTitle+"</b>",ExtentColor.WHITE));
		System.out.println(MainTitle+" "+SecondTitle); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Change Log
		List<WebElement> awd22=driver.findElements(By.className("android.view.View"));
		awd22.get(16).click(); 
		Thread.sleep(2000);
		List<WebElement> awd23=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd23.get(0).isDisplayed());test.log(Status.INFO, " clicked on Changelog option and opened it");}catch(Exception e) {test.fail("Not able to open Changelog screen");passFailScreenshot("22");}
		String Changelog=awd23.get(0).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Title of the screen which is displayed on app bar-: "+"<b><br /><br />"+Changelog+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Changelog); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Version of the application
		List<WebElement> awd24=driver.findElements(By.className("android.view.View"));
		try {Assert.assertTrue(awd24.get(17).isDisplayed());test.log(Status.INFO, "Showing the version of the application");}catch(Exception e) {test.fail("Not showing the version of the application");passFailScreenshot("24");}
		String Version=awd24.get(17).getAttribute("content-desc");
		test.log(Status.INFO,MarkupHelper.createLabel(" Version  which is displayed -: "+"<b><br /><br />"+Version+"<br /><br /></b>",ExtentColor.WHITE));
		System.out.println(Version); 
		Thread.sleep(2000);
		//mail option
		List<WebElement> awd25=driver.findElements(By.className("android.widget.ImageView"));
		awd25.get(1).click();
		Thread.sleep(2000);
		List<WebElement> awd26=driver.findElements(By.className("android.widget.TextView"));
		try {Assert.assertTrue(awd26.get(0).isDisplayed());test.log(Status.INFO, "Clicked on Email Icon");}catch(Exception e) {test.fail("Not able to click on email icon");passFailScreenshot("26");}
		String Mail1=awd26.get(1).getAttribute("text");
		String Mail2=awd26.get(2).getAttribute("text");
		test.log(Status.INFO,MarkupHelper.createLabel(" After clicking the mail icon showing -: "+"<b><br /><br />"+Mail1+"<br /><br /></b>"+" "+"<b>"+Mail2+"</b>",ExtentColor.WHITE));
		passFailScreenshot("28");
		System.out.println(Mail1+""+Mail2); 
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button2")).click();
		//GIT
		Thread.sleep(3000);
		List<WebElement> awd27=driver.findElements(By.className("android.widget.ImageView"));
		Thread.sleep(2000);
		awd27.get(2).click();
		Thread.sleep(4000);
		try {Assert.assertTrue(driver.findElement(By.id("com.android.chrome:id/url_bar")).isDisplayed());test.log(Status.INFO, "Clicked on GIT Icon");passFailScreenshot("48");}catch(Exception e) {test.fail("Not able to click on GIT icon");passFailScreenshot("30");}
		Thread.sleep(2000);
		driver.navigate().back();
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		try { Homepage
			.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {}Thread.sleep(5000);
		//Telegram
		List<WebElement> awd28=driver.findElements(By.className("android.widget.ImageView"));

		awd28.get(3).click();
		Thread.sleep(2000);
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text=\"t.me/beldexcoin\"]")).isDisplayed());test.log(Status.INFO, "Clicked on telegram Icon");passFailScreenshot("51");}catch(Exception e) {test.fail("Not able to click on GIT icon");passFailScreenshot("32");}
		Thread.sleep(2000);
		driver.navigate().back();

		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		try{Homepage
			.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		}catch(Exception e) {}Thread.sleep(5000);
		//Twitter
		List<WebElement> awd29=driver.findElements(By.className("android.widget.ImageView"));
		awd29.get(4).click();
		Thread.sleep(13000);
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text=\"Retry\"]")).isDisplayed());test.log(Status.INFO, "Clicked on Twitter Icon");passFailScreenshot("76");}catch(Exception e) {test.fail("Not able to click on Twitter icon");passFailScreenshot("77");}
		Thread.sleep(2000);
		driver.navigate().back();
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		try{Homepage
			.clickOnSettingsButton();
		settings
		.Wallet_settings_Click();}catch(Exception e) {}
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Wallet Settings")).isDisplayed());test.log(Status.PASS, "1.Click all the functions and buttons in the screen");passFailScreenshot("78");}catch(Exception e) {test.fail("Not able to click on Twitter icon");passFailScreenshot("79");}



	}}
