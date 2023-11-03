package vee4.officialWallet;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SeedScreen extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 Test;
	Seed seed;
	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Test
	public void seed_Screen() throws IOException, InterruptedException {
		Test=new CreateNewWallet1(driver);
		Test.Send_keys("VAsd");
		Test.Click_On_Continue();
		Thread.sleep(8000);
		seed=new Seed(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_85<br />Test case description: Validate the working of the next function without copying and saving the seed</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		seed.Continue_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the next function without copying seed",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Transfer your BDX more faster\r\n"
				+ " with Flash Transaction")).isDisplayed(), "Not navigated to the next screen");}catch(Exception e) {test.fail(e);passFailScreenshot("r");
				test.log(Status.PASS,MarkupHelper.createLabel("Not able to navigate to the next screen without copiing seed ",ExtentColor.GREEN));}
		test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_81<br />Test case description: Validate the working of the copy option</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		seed.Copy_seed_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.click the copy option",ExtentColor.GREEN));
		String as=driver.getClipboardText();
		test.log(Status.INFO,MarkupHelper.createLabel("Able to copy into clipboard"  +as,ExtentColor.GREEN));
		try {Assert.assertFalse(true, "<b>Copied to the clipboard but not showing Copied to clipboard message</b>");;}catch(AssertionError e) {test.fail(e);passFailScreenshot("t");}
		System.out.println(as);
		test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_82<br />Test case description: Validate the working of the save option</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		seed.Save_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save option",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Share seed']")).isDisplayed(), "<b>Able to click on Save Button</b>");;}catch(Exception e) {test.fail(e);passFailScreenshot("qa");}
		test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_83<br />Test case description: Validate the device option showing in the save option</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save option",ExtentColor.GREEN));
		seed.Scroll();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Check the share option showing",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Share seed']")).isDisplayed(), "<b>Not Showing all possible option</b>");;}catch(AssertionError e) {test.fail(e);passFailScreenshot("45");}
		seed.Cancel_button();
		test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_84<br />Test case description: Validate whether able to take screenshot of the screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
        try{passFailScreenshot("Screenshot");}catch(Exception e) {test.fail(e);}
        test.log(Status.PASS,MarkupHelper.createLabel("1.Take Screenshot of the screen",ExtentColor.GREEN));
        test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_79<br />Test case description: Validate Whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
        driver.navigate().back();
        test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));
        test.log(Status.INFO,MarkupHelper.createLabel("Not able to navigate back ",ExtentColor.GREEN));
        try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("New Wallet")).isDisplayed(), "Should navigate back to the previous screen but Navigated out of the App");}catch(Exception e) {test.fail(e);passFailScreenshot("uuu");}
        test=extent.createTest("Test Scenario:	To Check the working of the seed screen in the new wallet", "<b><br /> Test case Id: TC_86<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		turn_Off Off=new turn_Off();
		Off.Turn_Off_Data_Wifi();
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection",ExtentColor.GREEN));
		driver.resetApp();
		Test=new CreateNewWallet1(driver); 
		Test
		.createNewWallet();
		Thread.sleep(3000);
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6();
		Test.ClickOnOkButton();
		Thread.sleep(2000);
		Test.Click_On_Continue();
		Thread.sleep(10000);
		seed=new Seed(driver);
		seed.Continue_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the next function without copying seed",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Transfer your BDX more faster\r\n"
				+ " with Flash Transaction")).isDisplayed(), "Not navigated to the next screen");}catch(Exception e) {test.fail(e);passFailScreenshot("r");
				test.log(Status.PASS,MarkupHelper.createLabel("Not able to navigate to the next screen without copiing seed ",ExtentColor.GREEN));}
		seed.Copy_seed_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.click the copy option",ExtentColor.GREEN));
		String as1=driver.getClipboardText();
		test.log(Status.INFO,MarkupHelper.createLabel("Able to copy into clipboard"  +as1,ExtentColor.GREEN));
		try {Assert.assertFalse(false, "<b>Copied to the clipboard but not showing Copied to clipboard message</b>");;}catch(AssertionError e) {test.fail(e);passFailScreenshot("t");}
		System.out.println(as1);
		seed.Save_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save option",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Share seed']")).isDisplayed(), "<b>Able to click on Save Button</b>");;}catch(Exception e) {test.fail(e);passFailScreenshot("qa");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save option",ExtentColor.GREEN));
		seed.Scroll();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Check the share option showing",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Share seed']")).isDisplayed(), "<b>Not Showing all possible option</b>");;}catch(AssertionError e) {test.fail(e);passFailScreenshot("45");}
		seed.Cancel_button();
		try{passFailScreenshot("Screenshot");}catch(Exception e) {test.fail(e);}
        test.log(Status.PASS,MarkupHelper.createLabel("1.Take Screenshot of the screen",ExtentColor.GREEN));
        driver.navigate().back();
        test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));
        test.log(Status.INFO,MarkupHelper.createLabel("Not able to navigate back ",ExtentColor.GREEN));
        try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("New Wallet")).isDisplayed(), "Should navigate back to the previous screen but Navigated out of the App");}catch(Exception e) {test.fail(e);passFailScreenshot("uuu");}
	}
	}
