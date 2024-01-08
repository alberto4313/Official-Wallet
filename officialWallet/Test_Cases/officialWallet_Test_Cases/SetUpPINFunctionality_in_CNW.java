package officialWallet_Test_Cases;
import java.awt.Desktop; 

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Connection;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.applitools.eyes.appium.Eyes;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;
import officialWallet.CreateNewWallet1;

public class SetUpPINFunctionality_in_CNW extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 Test;
	//Eyes eyes;

	public static Logger log=LogManager.getLogger(SetUpPINFunctionality_in_CNW.class);


	@SuppressWarnings({ "rawtypes", "deprecation", "static-access" })
	@Test(priority=1)
	public void TC_38() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_38<br />Test case description: Validate whether able to navigate back to the opening page</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test=new CreateNewWallet1(driver);
		log.info("Beldex Official Wallet App Is Lounched");
		Test
		.createNewWallet();
		log.info("Clicked on Create New Wallet Button");
		Thread.sleep(3000);
		log.info("Waited for 3 seconds");		
		Test
		.NavigateBACK();
		log.info("Clicked on back button and navigated back");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));//navigating back to opening page
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Welcome to Beldex Wallet :)\"]")).isDisplayed(), "Not able to navigate back to opening page");log.info("Able to navigate back to the previous screen");log.info("Test Case 38 Passed-: Able to navigate to the opening page");}catch(AssertionError | Exception e) {
			test.fail(e);passFailScreenshot("20");
			log.error("Not able to navigate back to previous screen", new Exception("Upon clicking back button not navigating to oprning page"));	}
		Thread.sleep(1000);}
	@Test(priority=2)
	public void TC_51() throws IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_51<br />Test case description: Validate whether screen keypad is enabled</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.createNewWallet();
		log.info("Clicked on Create New Wallet Button");
		Test.KeyBoardisEnbled();
		log.info("Keyboard is enabled");
		
		test.log(Status.PASS,MarkupHelper.createLabel("1.Check the screen", ExtentColor.GREEN));
		test.log(Status.INFO,"<b><font color='blue' size='2'>Keypad is enabled</font></b>");
		System.out.println("Keypad is enabled");
		try{Assert.assertTrue(Test.KeyBoard().isEnabled(),"Keyboard is not enabled");log.info("Having visual keyboard ");}catch(AssertionError e) {
		log.error("Keyboard is not enabled ", new Exception("Keyboard is not enabled not able to Assert"));	test.fail(e);passFailScreenshot("21");
		}}
	@Test(priority=3)
	public void TC_48() throws IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_48<br />Test case description: Validate the working of the finger scanner</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		
		Test.BiometricScan();
		log.info("Clicked on Biometric feature");
		test.log(Status.PASS,MarkupHelper.createLabel("1.place any finger in the scan function", ExtentColor.GREEN));
		test.log(Status.INFO,"<b><font color='blue' size='2'>showing content\"Go to settings and turn on the biometric function\"</font></b>");
		passFailScreenshot("Biometric functions");
		try{Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Biometric feature currenly disabled.Kindly enable allow biometric authentication feature inside the app settings")).isDisplayed());log.info("Showing pop-up\n<b> Kindly enable allow biometric authentication feature inside the app settings,/b>");}catch(AssertionError e) {
		log.error("Biometric not working ",new Exception("Clicked on scanner function but not showing any toast message to enable biometric feature"));	test.fail(e);passFailScreenshot("22");
		}
		Test.Okbuttclick();}
	@Test(priority=4)
	public void TC_52() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_52<br />Test case description: Validate Whether the value entered in the pin field is deletable</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a value in the pin field", ExtentColor.GREEN));
		Test.Enter_0()
		.Enter_1()
		.Enter_3();
		log.info("Typed 3 digit password");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Clear the entered value", ExtentColor.GREEN));
		WebElement as= driver.findElement(By.xpath("//android.view.View[@index=\"11\"]"));
		as.click();
		as.click();
		as.click();
		log.info("Deleted entered 3 digit password");
		Thread.sleep(2000);
	}@Test(priority=5)
	public void TC_41() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_41<br />Test case description: Validate the switching from 4 digit pin to 6 digit pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		log.info("Before switching, 4 digit PIN option is showing ");
		Test
		.switchBetweenPin();

		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 6 digit pin function", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 4-digit PIN\"]")).isDisplayed(),"Not swicthed to 6 digit pin");log.info("After switching, 6 digit PIN option is showing ");}catch(AssertionError e) {
		log.error("Not able to swicth between the 4 and 6 digit options");	test.fail(e);passFailScreenshot("23");
		}
		Thread.sleep(2000);}
	@Test(priority=6)
	public void TC_42() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_42<br />Test case description: Validate the switching from 6 digit pin to 4 digit pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		log.info("Before switching, 6 digit PIN option is showing ");
		Test
		.switchBetweenPin();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 4 digit pin function", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 6-digit PIN\"]")).isDisplayed(),"Not swicthed to 4 digit pin");log.info("After switching, 4 digit PIN option is showing ");}catch(AssertionError e) {
			log.error("Not able to swicth between the 4 and 6 digit options");	test.fail(e);passFailScreenshot("24");}
		Thread.sleep(2000);
	}
	@Test(priority=7)
	public void TC_44() throws InterruptedException, IOException {

		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_44<br />Test case description: Validate the working of setup pin functionality by Valid pin Enter your Pin field and InValid Enter your pin again field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a 4 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		log.info("Entered 4 digit value");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a different 4 digit value entered before", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_5()
		.Enter_4()
		.Enter_6();
		log.info("Entered different 4 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("3.check the message", ExtentColor.GREEN));
	try {	Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(), "Pin is incorrect is not dislayed");log.info("Showing PIN is incorrect ");}catch(Exception | AssertionError e) {log.info("Entered different 4 digit PIN",new Exception("Entered 4 digit different password but it is not showing any toast message")); test.fail(e);}
		Thread.sleep(2000);
		test.log(Status.PASS, "<b>Showing message\"Pin is in correct\" <b>");
		passFailScreenshot("Showing ");
		Test.Okbuttclick();
		log.info("Clicked Ok button of toast message");
		Thread.sleep(2000);	
	}
	@Test(priority=8)
	public void TC_45() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_45<br />Test case description: Validate the working of setup pin functionality by Valid pin Enter your Pin field and InValid Enter your pin again field for multiple time</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		log.info("Typing wrong password multiple times ");
		for(int i=0;i<=5;i++) {
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a 4 digit value", ExtentColor.GREEN));
			Test
			.Enter_0()
			.Enter_2()
			.Enter_4()
			.Enter_6();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a different 4 digit value entered before", ExtentColor.GREEN));
			Test
			.Enter_0()
			.Enter_5()
			.Enter_4()
			.Enter_6();
			test.log(Status.PASS,MarkupHelper.createLabel("3.Check the message", ExtentColor.GREEN));

			test.log(Status.PASS, "<b>Showing message\"Pin is in correct\"<b> ");
			passFailScreenshot("Showing ");
			try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate"); log.info("Showing PIN is incorrect ");}catch(AssertionError  e){
				log.info("Entered different 4 digit PIN",new Exception("Entered 4 digit different password but it is not showing any toast message"));	test.fail(e);passFailScreenshot("25");
			}
			Test.Okbuttclick();
			log.info("Clicked Ok button of toast message");}}
	@Test(priority=9)
	public void TC_46() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_46<br />Test case description: Validate the working of setup pin functionality by Entering a 4 digitPin in enter your pin field and Entering 6 digitPin Enter your pin Again field</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a 4 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		log.info("Entered 4 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Change the pin to 6 digit function", ExtentColor.GREEN));
		Test
		.switchBetweenPin();
		log.info("Switched to 6 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a 6 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_5()
		.Enter_4()
		.Enter_6()
		.Enter_2()
		.Enter_4();
		log.info("Entered 6 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("4.Check the message", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");test.log(Status.PASS, "<b>Showing message\"Pin is in correct\" <b>");log.info("Showing PIN is incorrect ");}catch(AssertionError e) {
			log.info("Entered different PIN  value",new Exception("Entering a 4 digitPin in enter your pin field and Entering 6 digitPin Enter your pin Again field but PIN incorrect toast message is not showing"));	test.fail(e);passFailScreenshot("26");
		}

		passFailScreenshot("Showing");
		
		Test.Okbuttclick();
		log.info("Confirmed the PIN incorrect toast message and clicked on Ok ");
		Test.tap(47,202);
		log.info("Navigated back to opening page");
	}
	@Test(priority=10)
	public void TC_47() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_47<br />Test case description: Validate the working of setup pin functionality by Entering a 6 digitPin in enter your pin and Entering 4 digitPin Enter your pin Again.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.createNewWallet();
		log.info("Clicked on Create New Wallet Button");
		Test
		.switchBetweenPin();
		log.info("Switched to 6 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Change the pin to 6 digit function", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_5()
		.Enter_4()
		.Enter_6()
		.Enter_2()
		.Enter_4();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a 6digit value", ExtentColor.GREEN));
		log.info("Entered 6 digit PIN");
		Test
		.switchBetweenPin();
		log.info("Switched to 4 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("3.Change the pin to 4 digit function", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		log.info("Entered 4 digit PIN");
		test.log(Status.PASS,MarkupHelper.createLabel("4.Enter a 4 digit value", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");test.log(Status.PASS,MarkupHelper.createLabel("5.Check the message", ExtentColor.GREEN));log.info("Showing PIN is incorrect ");}catch(AssertionError e) {
			log.info("Entered different PIN  value",new Exception("Entering a 6 digitPin in enter your pin field and Entering 4 digitPin Enter your pin Again field but PIN incorrect toast message is not showing"));	test.fail(e);passFailScreenshot("2.6");
			
		}Test.Okbuttclick();
		log.info("Confirmed the PIN incorrect toast message and clicked on Ok ");
}
	@Test(dependsOnMethods = {"TC_47"})
	public void Without_internet_connection() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_54<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection", ExtentColor.GREEN));
		turn_Off Off=new turn_Off();
		Off.Turn_Off_Data_Wifi();
		log.info("Turned off WiFi connection of device");
		driver.navigate().back();
		log.info("Navigated back");

		test.log(Status.PASS,MarkupHelper.createLabel("2.Open the App", ExtentColor.GREEN));
		Without_internet_connection set=new Without_internet_connection();
		set.setup_screen();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Check the working of the screen function", ExtentColor.GREEN));
	}
	@Test(dependsOnMethods= {"Without_internet_connection"})
	public void Validinput() throws InterruptedException, IOException {
		driver.toggleData();
		Thread.sleep(4000);
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_43<br />Test case description: Validate the working of setup pin functionality by Valid pin Enter your Pin field and Valid Enter your pin again field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.createNewWallet();
		log.info("Clicked on Create New Wallet Button");

		Thread.sleep(3000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a 4 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		log.info("Entered a 4 digit PIN");

		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a same value entered before", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		log.info("Entered a same PIN entered before");

		test.log(Status.PASS,MarkupHelper.createLabel("3.check the message", ExtentColor.GREEN));
		Thread.sleep(2000);
		test.log(Status.PASS, "<b>Showing message\"Your PIN has been setup successfully!\" <b>");
		passFailScreenshot("Showing");		
		List<WebElement> elements = driver.findElements(By.className("android.view.View"));
		WebElement as=elements.get(0);
		String aas=as.findElement(By.xpath("//android.view.View[@index=\"0\"]")).getAttribute("content-desc");
	String SetuoPINMsg=	 aas.replaceAll("\\s","");
		String SetupPINMessage="Your PIN has been set up \r\n"
				+ "successfully!";
		String ComparingSetupMsg=	SetupPINMessage.replaceAll("\\s","");
		try{Assert.assertEquals(SetuoPINMsg,ComparingSetupMsg);log.info("<b>Showing message\"Your PIN has been setup successfully!\" <b>"); }catch(AssertionError e) {
				log.error("Not showing PIN has been setup successfully message");	test.fail(e);passFailScreenshot("26");
				}
		Test.Okbuttclick();
		log.info("Confirmed PIN has been  setup successfully message and clicked on Ok ");
		Thread.sleep(2000);
	}}
