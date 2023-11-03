package vee4.officialWallet;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Restore_from_keys_screen_in_UEW extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 Test;
	Use_Existing_Wallet ur;
	@SuppressWarnings("deprecation")
	@Test(dependsOnMethods =  {"Without_Net"})
	public void NewWallet() throws InterruptedException, IOException {
		driver.resetApp();
		Thread.sleep(10000);
		 driver.toggleWifi();
		 driver.findElement(By.id("android:id/button1")).click();
		ur=new Use_Existing_Wallet(driver);
		Test=new CreateNewWallet1(driver);
		ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_111<br />Test case description: Validate whether able to navigate back to the previous screen.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		ur.Restore_from_KeysButton();
		ur.Next_Button_Click();
		List<WebElement> childElements = driver.findElements(By.className("android.view.View"));
		WebElement mainElement = childElements.get(0);
		mainElement.findElement(By.xpath("android.view.View")).click();
		String as=mainElement.getAttribute("content-desc");
		System.out.println(as);
		try {Assert.assertEquals(as,"Restore from Keys","not able to navigate back");}catch(AssertionError e) {passFailScreenshot("456");test.fail(e);}
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_113<br />Test case description: Validate whether all text boxes in the screen is enable.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Enter_wallet_name().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter wallet name\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("11");test.fail(e);}
		ur.Address().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Address\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("12");test.fail(e);}
		ur.View_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"View key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("13");test.fail(e);}
		ur.Spend_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Spend key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("14");test.fail(e);}
		ur.Restore_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Restore from Blockheight\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("15");test.fail(e);}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click all the text boxes in the screen one by one",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_114<br />Test case description: Validate the restore function without entering anyvalue in all the text boxes.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Restore_button().click();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Restore from Keys\"]")).isDisplayed(), "Able to navigate");}catch(AssertionError e) {passFailScreenshot("16");test.fail(e);}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the restore function.",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_117<br />Test case description: Validate the restore function with valid name, valid addres,valid view key,valid spend key, valid blockheight and InValid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto");
		ur.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		ur.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ur.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		//ur.Restore_Options();
		Test.swicthtodatebutton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text boxes except date field.",ExtentColor.GREEN));
		//Test.Inputdateformate();
		Test.passdate().clear();
		Test.Send_keys("41/22/2023");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Select a invalid date.",ExtentColor.GREEN));
		Test.ClickOnOkButton();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the restore function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Invalid format.\"]")).isDisplayed(), "Able to navigate to next screen");test.info("Not able to navigate with invalid date showing ");passFailScreenshot("31");}catch(AssertionError e) {passFailScreenshot("19");test.fail(e);}
		Test.cancel_button();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		//ur.Restore_Options();
		Test.swicthtodatebutton();
		
		Test.passdate().clear();
		Test.Send_keys("9/20/2023");
		Test.ClickOnOkButton();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_118<br />Test case description: Validate the restore function with valid name, valid addres,valid view key,valid spend key, InValid blockheight and valid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		
	    driver.findElement(By.xpath("//android.widget.Button[@index=\"5\"]")).click();
	    Thread.sleep(2000);
	    
	    TouchAction touchAction = new TouchAction(driver);   
		
		Thread.sleep(20);
		touchAction.tap(PointOption.point(124, 1063)).perform();
		touchAction.tap(PointOption.point(124, 1063)).perform();
		Thread.sleep(20);
	    driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).clear();
	    Test.Send_keys("23631430225313139875692749583768934768934768937689351");
	    ur.Reestore_Button();
	    try {Assert.assertFalse(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Restore from Keys\"]")).isDisplayed(), "Able to navigate to next screen with invalid blockhieght");}catch(AssertionError e) {passFailScreenshot("22");test.fail(e);}
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_119<br />Test case description: Validate the restore function with valid name, valid addres,valid view key,InValid spend key, valid blockheight and valid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
	    driver.resetApp();
	    ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
	    ur.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto");
		ur.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		ur.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ur.spend_key_text_field();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text box field except Spend key field.",ExtentColor.GREEN));
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26b0");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a Invalid Value in spend key.",ExtentColor.GREEN));
		driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		//ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		
		Test.passdate().clear();
		Test.Send_keys("9/20/2023");
		Test.ClickOnOkButton();
		ur.Reestore_Button();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the restore function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet keys can only contain 64 chars in hex\"]")).isDisplayed(), "Not showing error message");passFailScreenshot("25");}catch(AssertionError e) {passFailScreenshot("26");test.fail("not shwoing error messsage");}
		test.log(Status.PASS,MarkupHelper.createLabel("4.Validate the message",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_120<br />Test case description: Validate the restore function with valid name, valid addres,InValid view key,valid spend key, valid blockheight and valid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.resetApp();
	    ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
	    ur.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto");
		ur.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		ur.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text box field except View Key field",ExtentColor.GREEN));
		ur.view_key_text_field();
		Test.Send_keys("603");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a Invalid Value in View Key",ExtentColor.GREEN));
		driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		//ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		
		Test.passdate().clear();
		Test.Send_keys("9/20/2023");
		Test.ClickOnOkButton();
		ur.Reestore_Button();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the restore function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet keys can only contain 64 chars in hex\"]")).isDisplayed(),"Not showing error");passFailScreenshot("33");}catch(AssertionError e) {passFailScreenshot("34");test.fail("Error");}
		test.log(Status.PASS,MarkupHelper.createLabel("4.Validate the message",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_122<br />Test case description: Validate the restore function with valid name, Invalid addres,valid view key,valid spend key, valid blockheight and valid date;</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.resetApp();
		ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
	    ur.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto");
		ur.Address_text_field();
		Test.Send_keys("HXcF6dqC1KrGvC3mj");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text box field except Address field",ExtentColor.GREEN));
		ur.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ur.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		//ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		
		Test.passdate().clear();
		Test.Send_keys("9/20/2023");
		Test.ClickOnOkButton();
		ur.Reestore_Button();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a Invalid Value in Address",ExtentColor.GREEN));
		ur.Reestore_Button();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the restore function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Invalid BDX address\"]")).isDisplayed(),"Showing Invalid address");passFailScreenshot("0031");}catch(AssertionError e) {passFailScreenshot("36");test.fail("invalid BDX address");}
		test.log(Status.PASS,MarkupHelper.createLabel("4.Validate the message",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_121<br />Test case description: Validate the restore function with Invalid name, valid addres,valid view key,valid spend key, valid blockheight and valid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.resetApp();
	    ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
	    ur.Enter_wallet_name_text_field();
		Test.Send_keys("  vb  vb vb");
		ur.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text box field except Address field",ExtentColor.GREEN));
		ur.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ur.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		//ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		Test.passdate().clear();
		Test.Send_keys("9/20/2023");
		Test.ClickOnOkButton();
		ur.Reestore_Button();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the restore function",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter a valid name upto 15 characters\"]")).isDisplayed(),"Showing Invalid address");passFailScreenshot("000001");}catch(AssertionError e) {passFailScreenshot("36");test.fail("invalid BDX address");}
		test.log(Status.PASS,MarkupHelper.createLabel("4.Validate the message",ExtentColor.GREEN));
		//Without_internet_connection nonet=new Without_internet_connection();
		//nonet.seed_keys();
		driver.resetApp();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_125<br />Test case description: Validate the calendar function</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
		//driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		//ur.Restore_Options();
		ur.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		Test.passdate().clear();
		Test.Send_keys("9/25/2023");
		test.log(Status.PASS,MarkupHelper.createLabel("1.select the future date from the calendar",ExtentColor.GREEN));
		Test.ClickOnOkButton();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Out of range.\"]")).isDisplayed(), "Showing");passFailScreenshot("41");}catch(AssertionError e) {passFailScreenshot("42");test.fail("able to select");}
		Test.cancel_button();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_126<br />Test case description: Validate the calendar function</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		Test.passdate().clear();
		Test.Send_keys("9/10/2023");
		String asd=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
		System.out.println(asd);
		try {Assert.assertEquals(asd, asd);passFailScreenshot("44");test.info(asd);}catch(AssertionError e) {passFailScreenshot("45");test.fail(e);}
		Test.ClickOnOkButton();
		//Test.cancel_button();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Test.swicthtodatebutton();
		Test.passdate().clear();
		Test.Send_keys("9/22/2023");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Select the present and past date from the calendar",ExtentColor.GREEN));
		String asd1=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
		System.out.println(asd1);
		try {Assert.assertEquals(asd1, asd1);passFailScreenshot("9101");test.info(asd1);}catch(AssertionError e) {passFailScreenshot("4894");test.fail(e);}
		
		Test.ClickOnOkButton();
		driver.resetApp();
		ur.Existing_Wallet_Button();
	    ur.Restore_from_Keys1Button();
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
	    ur.Restore_from_KeysButton();
	    ur.Next_Button_Click();
	    test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_116<br />Test case description: Validate the restore function with valid name, valid addres,valid view key,valid spend key, valid blockheight and valid date</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		ur.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto1");
		ur.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		ur.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ur.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		 driver.findElement(By.xpath("//android.widget.EditText[@index=\"4\"]")).click();
		    Test.Send_keys("2363143");
		    test.log(Status.PASS,MarkupHelper.createLabel("1.enter a valid value in all the text boxes",ExtentColor.GREEN));
		    ur.Reestore_Button();
		    test.log(Status.PASS,MarkupHelper.createLabel("2.click restore function",ExtentColor.GREEN));
		    Thread.sleep(8000);
		    try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Flash Transaction")).isDisplayed(), "Not able to navigate to screen");passFailScreenshot("454545");}catch(AssertionError e) {passFailScreenshot("6786");test.fail(e);}
		}   @Test(priority=1)
	public void Without_Net() throws InterruptedException, IOException {
	Thread.sleep(10000);
	
	Test=new CreateNewWallet1(driver);
	ur=new Use_Existing_Wallet(driver);
	ur.Existing_Wallet_Button();
    ur.Restore_from_Keys1Button();
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
    ur.Restore_from_KeysButton();
    ur.Next_Button_Click();
    test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_123<br />Test case description: Validate the working of the screen activity without internet connection.</b>");
	test.assignAuthor("Alberto");
	test.assignCategory("Smoke Testing");
	test.assignDevice("Redmi Note 9 Pro");
    driver.toggleWifi();
	driver.findElement(By.id("android:id/button1")).click();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Turn Off the device internet connection",ExtentColor.GREEN));
	Thread.sleep(2000);
	driver.navigate().back();
	
	test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
	ur.Restore_from_KeysButton();
	ur.Next_Button_Click();
	System.out.println("pass");
	ur.Enter_wallet_name().isEnabled();
	try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter wallet name\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("11");test.fail(e);}
	ur.Address().isEnabled();
	try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Address\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("12");test.fail(e);}
	ur.View_key().isEnabled();
	try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"View key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("13");test.fail(e);}
	ur.Spend_key().isEnabled();
	try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Spend key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("14");test.fail(e);}
	ur.Restore_key().isEnabled();
	try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Restore from Blockheight\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("15");test.fail(e);}
	ur.Enter_wallet_name_text_field();
	Test.Send_keys("Alberto");
	ur.Address_text_field();
	Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
	ur.view_key_text_field();
	Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
	ur.spend_key_text_field();
	Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
	ur.Restore_Options();
	ur.restore_key_text_field();
	driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
	//ur.Restore_Options();
	Test.swicthtodatebutton();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text boxes except date field.",ExtentColor.GREEN));
	//Test.Inputdateformate();
	Test.passdate().clear();
	Test.Send_keys("9/22/2023");
	test.log(Status.PASS,MarkupHelper.createLabel("2.Select a invalid date.",ExtentColor.GREEN));
	Test.ClickOnOkButton();
	ur.Reestore_Button();
	test.log(Status.PASS,MarkupHelper.createLabel("2.Check the working of screen functions.",ExtentColor.GREEN));
	}}

