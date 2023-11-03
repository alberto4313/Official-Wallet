package officialWallet_Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import officialWallet.CreateNewWallet1;
import officialWallet.Use_Existing_Wallet;

public class Restore_Wallet_Functionality_UEW extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 Test;
	Use_Existing_Wallet ExistingWallet;
	turn_Off Off;
	@Test
	public void Use_Existing_Wallet() throws InterruptedException, IOException {
		 ExistingWallet=new Use_Existing_Wallet(driver);
		ExistingWallet.Existing_Wallet_Button();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore wallet functionality in the Use Existing Wallet", "<b><br /> Test case Id: TC_88<br />Test case description: Validate Whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test=new CreateNewWallet1(driver);
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Beldex Wallet\"]")).isDisplayed(), "Not able to navigate back");}catch(Exception e) {passFailScreenshot("12");test.fail(e);}
		ExistingWallet.Existing_Wallet_Button();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore wallet functionality in the Use Existing Wallet", "<b><br /> Test case Id: TC_90<br />Test case description: Validate the navigation of the Restore from Seed/keys function in both forward and backward direction.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ExistingWallet.Restore_seed_keys_button();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Restore from Seed/Keys function",ExtentColor.GREEN));
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Restore Wallet")).isDisplayed(), "Not able to navigate back to the previous screen");}catch(Exception e) {passFailScreenshot("3");test.fail(e);}
		test=extent.createTest("Test Scenario:	To Check the working of the Restore wallet functionality in the Use Existing Wallet", "<b><br /> Test case Id: TC_89<br />Test case description: Validate Whether all functions and buttons in the screen response for the touch action</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ExistingWallet.Restore_seed_keys_button();
		Test.NavigateBACK();
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click all the functions and buttons in the screen one by one",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Welcome to Beldex Wallet :)")).isDisplayed(), "Not responding for the touch action");}catch(Exception e) {passFailScreenshot("9");test.fail(e);}
		test=extent.createTest("Test Scenario:	To Check the working of the Restore wallet functionality in the Use Existing Wallet", "<b><br /> Test case Id: TC_91<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Off=new	turn_Off();
		Off.Turn_Off_Data_Wifi();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection",ExtentColor.GREEN));
		driver.navigate().back();
		ExistingWallet.Existing_Wallet_Button();
		Test=new CreateNewWallet1(driver);
		Test.NavigateBACK();
		ExistingWallet.Existing_Wallet_Button();
		ExistingWallet.Restore_seed_keys_button();
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Check working of the screen function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Restore Wallet")).isDisplayed(), "Not working without internet connection");}catch(Exception e) {passFailScreenshot("6");test.fail(e);}
	}
	}
