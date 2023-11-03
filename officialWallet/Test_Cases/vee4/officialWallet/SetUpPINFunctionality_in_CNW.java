package vee4.officialWallet;
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

public class SetUpPINFunctionality_in_CNW extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 Test;
	//Eyes eyes;
	
       
	static final Logger logger = LogManager.getLogger();
	@SuppressWarnings({ "rawtypes", "deprecation", "static-access" })
	@Test(priority=1)
	public void SetUP_PIN() throws InterruptedException, IOException {
		//eyes = new Eyes();
    
		//eyes.setApiKey("c1zZL102fvSgw2cBh8FtrWCJchRXaaaBEl1YpVwmo69108M110");

        //eyes.setForceFullPageScreenshot(true);
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_38<br />Test case description: Validate whether able to navigate back to the opening page</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test=new CreateNewWallet1(driver);
		Test
		.createNewWallet();
		Thread.sleep(3000);
		// Start the test.
        //eyes.open(driver, "Official_Wallet!", "My first Appium native Java test!");

        // Visual validation.
        //eyes.checkWindow("Homescreen");

        // End the test.
        //eyes.close();
		Test
		.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));//navigating back to opening page
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Welcome to Beldex Wallet :)\"]")).isDisplayed(), "Not able to navigate back to opening page");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("20");
			}
		Thread.sleep(1000);
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_51<br />Test case description: Validate whether screen keypad is enabled</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		
		//eyes = new Eyes();
		//eyes.setApiKey("c1zZL102fvSgw2cBh8FtrWCJchRXaaaBEl1YpVwmo69108M110");

	    //eyes.setForceFullPageScreenshot(true);
		Test
		.createNewWallet()
		.KeyBoardisEnbled();
		// Start the test.
        //eyes.open(driver, "Official_Wallet!", "My first Appium native Java test!");

        // Visual validation.
       // eyes.checkWindow("PIN-screen");

        // End the test.
        //eyes.close();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Check the screen", ExtentColor.GREEN));
		test.log(Status.INFO,"<b><font color='blue' size='2'>Keypad is enabled</font></b>");
		System.out.println("Keypad is enabled");
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@index=\"0\"]")).isEnabled(),"Keyboard is not enabled");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("21");
		}
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_48<br />Test case description: Validate the working of the finger scanner</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.place any finger in the scan function", ExtentColor.GREEN));
		//eyes = new Eyes();
		//eyes.setApiKey("c1zZL102fvSgw2cBh8FtrWCJchRXaaaBEl1YpVwmo69108M110");

	    //eyes.setForceFullPageScreenshot(true);
		Test.BiometricScan();
		// Start the test.
        //eyes.open(driver, "Official_Wallet!", "My first Appium native Java test!");

        // Visual validation.
        //eyes.checkWindow("Bio-Metric");

        // End the test.
        //eyes.close();
		test.log(Status.INFO,"<b><font color='blue' size='2'>showing content\"Go to settings and turn on the biometric function\"</font></b>");
		passFailScreenshot("Biometric functions");
		try{Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Biometric feature currenly disabled.Kindly enable allow biometric authentication feature inside the app settings")).isDisplayed());}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("22");
		}
		Test.OkbuttoninUEWclick();
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_52<br />Test case description: Validate Whether the value entered in the pin field is deletable</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a value in the pin field", ExtentColor.GREEN));
		Test.Enter_0()
		.Enter_1()
		.Enter_3();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Clear the entered value", ExtentColor.GREEN));
		WebElement as= driver.findElement(By.xpath("//android.view.View[@index=\"11\"]"));
		as.click();
		as.click();
		as.click();
		Thread.sleep(2000);
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_41<br />Test case description: Validate the switching from 4 digit pin to 6 digit pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.switchBetweenPin();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 6 digit pin function", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 4-digit PIN\"]")).isDisplayed(),"Not swicthed to 6 digit pin");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("23");
		}
		Thread.sleep(2000);
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_42<br />Test case description: Validate the switching from 6 digit pin to 4 digit pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.switchBetweenPin();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 4 digit pin function", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 6-digit PIN\"]")).isDisplayed(),"Not swicthed to 4 digit pin");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("24");}
		Thread.sleep(2000);
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
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a different 4 digit value entered before", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_5()
		.Enter_4()
		.Enter_6();
		test.log(Status.PASS,MarkupHelper.createLabel("3.check the message", ExtentColor.GREEN));
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(), "Pin is incorrect is not dislayed");
		Thread.sleep(2000);
		test.log(Status.PASS, "<b>Showing message\"Pin is in correct\" <b>");
		passFailScreenshot("Showing ");
		Test.OkbuttoninUEWclick();
		Thread.sleep(2000);	
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_45<br />Test case description: Validate the working of setup pin functionality by Valid pin Enter your Pin field and InValid Enter your pin again field for multiple time</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
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
			try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");}catch(AssertionError  e){
				test.fail(e);passFailScreenshot("25");
			}
			Test.OkbuttoninUEWclick();}
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
		test.log(Status.PASS,MarkupHelper.createLabel("2.Change the pin to 6 digit function", ExtentColor.GREEN));
		Test
		.switchBetweenPin();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a 6 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_5()
		.Enter_4()
		.Enter_6()
		.Enter_2()
		.Enter_4();
		test.log(Status.PASS,MarkupHelper.createLabel("4.Check the message", ExtentColor.GREEN));
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("26");
		}
		test.log(Status.PASS, "<b>Showing message\"Pin is in correct\" <b>");
		passFailScreenshot("Showing");
		Test.OkbuttoninUEWclick();
		TouchAction touch1=new TouchAction(driver);
		touch1.tap(PointOption.point(47,202)).perform();
	}
	@Test(dependsOnMethods = {"SetUP_PIN"})
	public void Without_internet_connection() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_54<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection", ExtentColor.GREEN));
		turn_Off Off=new turn_Off();
		Off.Turn_Off_Data_Wifi();
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Open the App", ExtentColor.GREEN));
		Without_internet_connection set=new Without_internet_connection();
		set.setup_screen();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Check the working of the screen function", ExtentColor.GREEN));
	}
	@Test(dependsOnMethods= {"Without_internet_connection"})
	public void Validinput() throws InterruptedException, IOException {
		driver.toggleData();
		//driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000);
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		test=extent.createTest("Test Scenario:	To Check the working of the setup pin functionality in Create New Wallet", "<b><br /> Test case Id: TC_43<br />Test case description: Validate the working of setup pin functionality by Valid pin Enter your Pin field and Valid Enter your pin again field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.createNewWallet();
		Thread.sleep(3000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a 4 digit value", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a same value entered before", ExtentColor.GREEN));
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		test.log(Status.PASS,MarkupHelper.createLabel("3.check the message", ExtentColor.GREEN));
		Thread.sleep(2000);
		test.log(Status.PASS, "<b>Showing message\"Your PIN has been setup successfully!\" <b>");
		passFailScreenshot("Showing");		
		List<WebElement> elements = driver.findElements(By.className("android.view.View"));
		WebElement as=elements.get(0);
		String aas=as.findElement(By.xpath("//android.view.View[@index=\"0\"]")).getAttribute("content-desc");
		try{Assert.assertEquals(aas,"Your PIN has been set up\r\n"
				+ "successfully!");}catch(AssertionError e) {
			test.fail(e);passFailScreenshot("26");
		}//finally{// Close the app.
           // driver.quit();

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            //eyes.abortIfNotClosed();
		Test.OkbuttoninUEWclick();
		Thread.sleep(2000);
	}}
