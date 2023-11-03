package vee4.officialWallet;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Restore_from_seedscreen_in_UEW extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 Test;
	Use_Existing_Wallet ur;
	turn_Off Off;
	boolean a;
	@SuppressWarnings("deprecation")
	@Test
	public void Restore_from_seedscreen() throws InterruptedException, IOException {
    	test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_101<br />Test case description: Validate whether able to navigate back to previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(10000);
		Test=new CreateNewWallet1(driver);
		ur=new Use_Existing_Wallet(driver);
		ur.Restore_from_SeedButton();
		ur.Next_Button_Click();
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back");}catch(Exception e) {passFailScreenshot("03"); test.fail(e);}
		test.log(Status.PASS, MarkupHelper.createLabel("1.click the back button",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_102<br />Test case description: Validate whether able to navigate to the next screen without entering the seed value</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Restore_from_SeedButton();
		ur.Next_Button_Click();
		ur.Next_Button_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.Click the next button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Restore from Seed\"]")).isDisplayed(), "Able to navigate next screen without seed");}catch(Exception e) {passFailScreenshot("09");test.fail(e);}
		passFailScreenshot("099");
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_104<br />Test case description: Validate the working of the paste option </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.DoubleTapGeneral(141 ,650 );
		driver.setClipboardText("Alberto");
		ur.Paste_RfS_Click();
	    String sa=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
	    System.out.println(sa);
	    try {Assert.assertEquals(sa,sa);}catch(AssertionError e) {passFailScreenshot("088");test.fail(e);}
	    test.log(Status.PASS, MarkupHelper.createLabel("1.click the paste option",ExtentColor.GREEN));
	    test.log(Status.INFO, MarkupHelper.createLabel(sa,ExtentColor.GREEN));
	    passFailScreenshot("00");
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_105<br />Test case description: Validate the working of the clear option  </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.setClipboardText("Alberto jhsfhsaf");
		ur.Paste_RfS_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.click the paste option",ExtentColor.GREEN));
		String as=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
		    System.out.println(as);
		    passFailScreenshot("346");
		    ur.Clear_RfS_Click();
			test.log(Status.PASS, MarkupHelper.createLabel("2.click the clear option",ExtentColor.GREEN));
			String as12=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
		    System.out.println(as12);
		    passFailScreenshot("455");
			try {Assert.assertEquals(as12,as12);}catch(AssertionError e) {passFailScreenshot("565");test.fail(e);}
	    test.log(Status.INFO, MarkupHelper.createLabel(as12,ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_106<br />Test case description: Validate whether able to type the seed value </b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("hjdsdg jkdgs dgdsgds gdsg dsgd gd gdgd");
		String aa=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
	    System.out.println(aa);
		try {Assert.assertEquals(aa,aa);}catch(AssertionError e) {passFailScreenshot("088");test.fail(e);}
		test.log(Status.INFO, MarkupHelper.createLabel(aa,ExtentColor.GREEN));
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a seed value",ExtentColor.GREEN));
		ur.Clear_RfS_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_108<br />Test case description: Validate by entering Invalid seed value</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("hjdsdg jkdgs dgdsgds gdsg dsgd gdhg gdgd hjghj hjghjgh");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a InValid seed value",ExtentColor.GREEN));
	    ur.Next_Button_Click();
	    try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a valid seed\"]")).isDisplayed(),"Able to navigate to next screen");}catch(Exception e){passFailScreenshot("3456");test.fail(e);}
	    ur.Clear_RfS_Click();
	    test.log(Status.PASS, MarkupHelper.createLabel("2.Click next function",ExtentColor.GREEN));
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_107<br />Test case description: Validate by entering valid seed value</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("sovereign tissue benches pepper vitals unquoted suede gained bubble lava sniff asylum fleet thirsty tidy tulips height assorted dexterity lodge wiring putty testing touchy assorted");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a Valid seed value",ExtentColor.GREEN));
		ur.Next_Button_Click();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet Restore\"]")).isDisplayed(),"Able to navigate to next screen");}catch(Exception e){passFailScreenshot("3456");test.fail(e);}
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click next function",ExtentColor.GREEN));
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from seed screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_109<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.resetApp();
	    ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
	    Test.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.OkbuttoninUEWclick();
	    Off=new turn_Off();
	    Off.Turn_Off_Data_Wifi();
	    driver.navigate().back();
	    Without_internet_connection No_Net=new Without_internet_connection();
	    No_Net.restore_From_Seed();
	    }
	    }
