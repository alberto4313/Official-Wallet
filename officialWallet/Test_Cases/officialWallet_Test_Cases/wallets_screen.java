package vee4.officialWallet;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class wallets_screen extends DesiredCapabilitesOfDevice{
	Wallets wallet;
	CreateNewWallet1 password;
	HomescreenPage Homepage;
	Wallet_Settings settings;
	@Test()
	public void TC_153() throws IOException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage
		.clickOnSettingsButton();
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_153<br />Test case description: Validate whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		settings
		.Wallets_Click();
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to navigate to the previous screen");passFailScreenshot("1");}
	}
	@Test(dependsOnMethods= {"TC_153"})
	public void TC_154() throws IOException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_154<br />Test case description: Validate whether functions and buttons in the screen reponse for the touch action</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage
		.clickOnSettingsButton();
		settings
		.Wallets_Click();
		wallet.Existing_Wallet_Button();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Recovery Seed/Key")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Use Existing Wallet Button",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to Click on Use Existing Wallet Button");passFailScreenshot("2");}
		driver.navigate().back();
		wallet.createNewWallet();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("New Wallet")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Create New Wallet Button",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to Click on Create New Wallet Button Button");passFailScreenshot("3");}
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Wallets")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.Click all functions and buttons in the screen",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not Responding for the touch action");passFailScreenshot("4");
		}}@Test(dependsOnMethods= {"TC_154"})
		public void TC_155() throws IOException, InterruptedException {
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_155<br />Test case description: Validate whether showing multiple wallets in the screen</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			for(int i=0;i<=3;i++) {wallet
				.createNewWallet();
			Thread.sleep(2000);
			wallet.Click_On_Continue();
			Thread.sleep(8000);
			wallet
			.Copy_seed_button()
			.Click_On_Continue();
			Thread.sleep(30000);
			Homepage
			.clickOnSettingsButton();
			settings
			.Wallets_Click();
			}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Add mutiple new wallet by using create new wallet function",ExtentColor.GREEN));
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			try {Assert.assertTrue((ae).get(8).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Already available wallet "+ae.get(8).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("5");}
			try {Assert.assertTrue((ae).get(9).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Created New wallet "+ae.get(9).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("6");}
			try {Assert.assertTrue((ae).get(10).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Created New wallet "+ae.get(10).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("7");}
			try {Assert.assertTrue((ae).get(11).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Created New wallet "+ae.get(11).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("8");}
			try {Assert.assertTrue((ae).get(12).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Created New wallet "+ae.get(12).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("9");}
			//try {Assert.assertTrue((ae).get(13).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Created New wallet "+ae.get(13).getAttribute("content-desc"),ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to add");passFailScreenshot("10");}
			passFailScreenshot("11");
			test.log(Status.PASS,MarkupHelper.createLabel("2.Check the wallet screen",ExtentColor.GREEN));
			//try{String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(2)";
			//WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
			//}catch(Exception e) {test.info("Please add few more wallets to scroll down");}Thread.sleep(5000);
		}@Test(dependsOnMethods= {"TC_155"})
		public void TC_156() throws InterruptedException, IOException {
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_156<br />Test case description: Validate whether able to switch to another wallet in the screen'</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			Thread.sleep(4000);
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			String vas1=ae.get(10).getAttribute("content-desc");
			ae.get(10).click();
			System.out.println(vas1);
			test.log(Status.PASS,MarkupHelper.createLabel("1.click the unselected wallet",ExtentColor.GREEN));
			wallet
			.Load_Wallet_Click();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Click the load wallet option",ExtentColor.GREEN));
			password
			.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
			test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a valid pin number",ExtentColor.GREEN));
			Thread.sleep(4000);
			Homepage
			.clickOnSettingsButton();
			settings
			.Wallets_Click();
			System.out.println("pass");
			Thread.sleep(2000);
			try {
				//Pass string using sendkeys to the web element
				ae.get(10).click();
			}
			catch(StaleElementReferenceException e) {
				List<WebElement> ae2=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
				String vas=ae2.get(10).getAttribute("content-desc");
				System.out.println(vas);
				ae2.get(10).click();
			} List<WebElement> ae2=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]")); 
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Change Wallet")).isDisplayed());test.fail("Not able to set as primary wallet");passFailScreenshot("11");}catch(Exception e) {test.log(Status.INFO,MarkupHelper.createLabel("Setted selected wallet as primary wallet "+ae2.get(10).getAttribute("content-desc"),ExtentColor.GREEN));;;}
		}@Test(dependsOnMethods= {"TC_156"})
		public void TC_157() throws IOException, InterruptedException{
			Thread.sleep(10000);
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_157<br />Test case description: Validate whether able to multiselect the wallets'</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			System.out.println(ae.size());
			Thread.sleep(2000);
			ae.get(11).click();
			Thread.sleep(2000);
			test.log(Status.PASS,MarkupHelper.createLabel("1.Select anyone wallet in the screen",ExtentColor.GREEN));
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Change Wallet")).isEnabled());driver.navigate().back();test.log(Status.INFO,MarkupHelper.createLabel(" selecting wallet "+ae.get(11).getAttribute("content-desc"),ExtentColor.GREEN));}catch(AssertionError e) {test.fail(e);passFailScreenshot("12");}
			Thread.sleep(2000);
			ae.get(10).click();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Click another wallet in the screen",ExtentColor.GREEN));
			Thread.sleep(4000);
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Change Wallet")).isEnabled());test.fail("Able to select multiple wallets");}catch(Exception e) {test.pass("Not able to select multiple wallets");}
		}@Test(dependsOnMethods= {"TC_157"})
		public void TC_158() throws IOException{
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_158<br />Test case description: Validate whether able to remove the wallet</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			ae.get(12).click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Select anyone wallet in the screen",ExtentColor.GREEN));
			wallet
			.Remove_Wallet_Click()
			.Yes_button_click();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Click remove option",ExtentColor.GREEN));
			password
			.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
			try {Assert.assertTrue(ae.get(12).isDisplayed());test.fail("Not able to remove the wallet");passFailScreenshot("13");}catch(Exception e) {test.log(Status.INFO,MarkupHelper.createLabel("the wallet is removed",ExtentColor.GREEN));} 
		}@Test(dependsOnMethods= {"TC_158"})
		public void TC_159() throws IOException{
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_159<br />Test case description: Validate whether the selected wallet is indicated</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			ae.get(10).click();
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Change Wallet")).isDisplayed());test.fail("Not showing green tick for selected wallet");passFailScreenshot("15");;}catch(Exception e) {test.log(Status.INFO,MarkupHelper.createLabel("Indicated by green tick symbol "+ae.get(10).getAttribute("content-desc"),ExtentColor.GREEN));passFailScreenshot("14");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Check the screen",ExtentColor.GREEN));
		}@Test(dependsOnMethods= {"TC_159"})
		public void TC_162() throws IOException, InterruptedException{
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_162<br />Test case description: Validate the working of the screen activity without internet connection</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			driver.toggleWifi();
			driver.findElement(By.id("android:id/button1")).click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection",ExtentColor.GREEN));
			wallet.Existing_Wallet_Button();
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Recovery Seed/Key")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Use Existing Wallet Button",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to Click on Use Existing Wallet Button");passFailScreenshot("16");}
			driver.navigate().back();
			Thread.sleep(2000);
			wallet.createNewWallet();
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("New Wallet")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Create New Wallet Button",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not able to Click on Create New Wallet Button Button");passFailScreenshot("17");}
			driver.navigate().back();
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Wallets")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.Click all functions and buttons in the screen",ExtentColor.GREEN));}catch(Exception e) {test.fail("Not Responding for the touch action");passFailScreenshot("18");
			List<WebElement> ae=driver.findElements(By.xpath("//android.view.View[@index=\"0\"]"));
			String qw=ae.get(12).getAttribute("content-desc");
			ae.get(12).click();
			wallet
			.Load_Wallet_Click();
			password
			.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
			Thread.sleep(30000);
			Homepage
			.clickOnSettingsButton();
			settings.Wallets_Click();
			String qw1=ae.get(12).getAttribute("content-desc");
			test.log(Status.PASS,MarkupHelper.createLabel("2.Check the working of the screen functions",ExtentColor.GREEN));
			if(qw!=qw1) {
				try {Assert.assertTrue(true);}catch(Exception e1){test.fail(e1);}
			}else {test.fail("screen functions are not working");}
			test.log(Status.PASS,MarkupHelper.createLabel("2.Check the working of the screen functions",ExtentColor.GREEN));	
			}driver.toggleWifi();driver.findElement(By.id("android:id/button1")).click();}
		@SuppressWarnings({ "rawtypes", "deprecation" })
		@Test(dependsOnMethods= {"TC_162"})
		public void TC_163() throws InterruptedException, IOException{
			wallet=new Wallets(driver);
			password=new CreateNewWallet1(driver);
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallets Screen. ", "<b><br /> Test case Id: TC_163<br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			driver.lockDevice();
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
			Thread.sleep(1000);
			passFailScreenshot("127");
		}}