package officialWallet_Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import io.appium.java_client.AppiumBy;
import officialWallet.CreateNewWallet1;
import officialWallet.Use_Existing_Wallet;

public class seed_Keys_Restore_Screen_in_UEW extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 Test;
	Use_Existing_Wallet ExistingWallet;
	@Test
	public void seed_Keys_Restore_Screen() throws IOException, InterruptedException {
		Thread.sleep(9000);
		Test=new CreateNewWallet1(driver);
		ExistingWallet=new Use_Existing_Wallet(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_93<br />Test case description: Validate Whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.NavigateBACK();
		Test.NavigateBACK();
		ExistingWallet.Restore_from_Keys1Button();
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.OkbuttoninUEWclick();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back");}catch(Exception e) {passFailScreenshot("34");test.fail(e);}
		
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_95<br />Test case description: Validate the navigation of the Restore from Seed function in both forward and backward direction.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ExistingWallet.Restore_from_SeedButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Restore from seed function",ExtentColor.GREEN));
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back to the previous screen");}catch(Exception e) {passFailScreenshot("78");test.fail(e);}
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_96<br />Test case description: Validate the navigation of the Restore from keys function in both forward and backward direction.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ExistingWallet.Restore_from_KeysButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Restore from keys function",ExtentColor.GREEN));
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back to the previous screen");}catch(Exception e) {passFailScreenshot("79");test.fail(e);}
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_97<br />Test case description: Validate whether able to select the Seed Language</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ExistingWallet.Restore_from_SeedButton();
		Test.German_Langauge();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click any one language in the option",ExtentColor.GREEN));
		String vas10=driver.findElement(By.xpath("//android.view.View[@content-desc=\"German\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas10, "German");}catch(AssertionError e) {test.fail(e);passFailScreenshot("12");}	
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_98<br />Test case description: Validate whether all option in the seed language is enabled.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Scroll_Up();
		Test
		.Chinese_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Chinese\"]")).isEnabled(), "Chinese not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Dutch_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Dutch\"]")).isEnabled(), "Dutch not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.German_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"German\"]")).isEnabled(), "German not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Japanese_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Japanese\"]")).isEnabled(), "Japanese not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Portuguese_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Portuguese\"]")).isEnabled(), "Portuguese not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Russian_Langauge();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Russian\"]")).isEnabled(), "Russian not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Scrollto_Spanish();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Spanish\"]")).isEnabled(), "Spanish not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Scrollto_French();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"French\"]")).isEnabled(), "French not enabled");}catch(AssertionError e) {test.fail(e);}
		Test.Scrollto_italian();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Italian\"]")).isEnabled(), "Italian not enabled");}catch(AssertionError e) {test.fail(e);}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Select all the options one by one ",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_100<br />Test case description: Validate whether able to multiselect the seed language.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.Japanese_Langauge();
		test.log(Status.PASS, MarkupHelper.createLabel("1.select any one language ",ExtentColor.GREEN));
		Test.Portuguese_Langauge();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Select another language ",ExtentColor.GREEN));
		String ga=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Japanese\"]")).getAttribute("clickable");
		try {Assert.assertEquals(ga,"true", "able to multiselect");}catch(AssertionError e) {test.fail(e);}	
		test=extent.createTest("Test Scenario:	To Check the working of the Seed/Keys Restore screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_99<br />Test case description: Validate the working of the screen activity without internet connection.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		turn_Off WIFI_Off =new turn_Off();
		WIFI_Off.Turn_Off_Data_Wifi();
		driver.navigate().back();
		driver.navigate().back();
		Without_internet_connection WithoutNet=new Without_internet_connection();
		WithoutNet.seed_Keys_Restore();
	}
	}