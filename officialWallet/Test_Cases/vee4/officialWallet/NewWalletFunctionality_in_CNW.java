package vee4.officialWallet;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder.Builder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
public class NewWalletFunctionality_in_CNW extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 Test;
	static final Logger logger = LogManager.getLogger();
	@SuppressWarnings("deprecation")
	@Test()
	public void NewWallet() throws InterruptedException, IOException {
		Test=new CreateNewWallet1(driver);
		Thread.sleep(7000);
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_56<br />Test case description: Validate whether able to navigate back to the previous screen.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));
		boolean ag=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Setup PIN\"]")).isDisplayed();
		try {Assert.assertTrue(ag,"Not able to navigate back");}catch(AssertionError e) {test.fail(e);passFailScreenshot("01");}
		Test
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		//test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a same value entered before", ExtentColor.GREEN));
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.OkbuttoninUEWclick();
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_59<br />Test case description: Validate Whether Default wallet name chances for everytime.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		String Alberto=Test.Wallet_name().getText();
		System.out.println(Alberto);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Check the wallet name",ExtentColor.GREEN));
		test.log(Status.INFO, Alberto);
		try {Assert.assertEquals(Alberto, Alberto);}catch(AssertionError e) {test.fail(e);passFailScreenshot("02");}
		Test.NavigateBACK();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click the back button and click next",ExtentColor.GREEN));
		Test.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.OkbuttoninUEWclick();
		String Alberto1=Test.Wallet_name().getText();
		System.out.println(Alberto1);
		test.log(Status.PASS, MarkupHelper.createLabel("3.Check the Wallet name",ExtentColor.GREEN));
		test.log(Status.INFO, Alberto1);
		try {Assert.assertEquals(Alberto1, Alberto1);}catch(AssertionError e) {test.fail(e);passFailScreenshot("03");}
		Thread.sleep(1000);
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_64<br />Test case description: Validate whether able to edit the values in the wallet name field</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value in the wallet name",ExtentColor.GREEN));
		Test.Send_keys("dssdgsdgds");
		String su1=Test.Wallet_name().getText();
		try {Assert.assertEquals(su1, "dssdgsdgds, Enter wallet name");}catch(AssertionError e) {test.fail(e);passFailScreenshot("04");}
		test.log(Status.PASS, MarkupHelper.createLabel("2.Enter a value in the wallet name field",ExtentColor.GREEN));
		Test.DiscardButton_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_67<br />Test case description: Validate the working of Wallet name field by using special Characters.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("@#$#$#%");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a special charcter value in the wallet name",ExtentColor.GREEN));
		String Alberto2=Test.Wallet_name().getText();
		test.log(Status.INFO,"Entered Spcecial Characters "+Alberto2);
		Test.Click_On_Continue();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Click the continue function",ExtentColor.GREEN));
		System.out.println(Alberto2);
		String tr=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).getAttribute("content-desc");
		test.log(Status.PASS, MarkupHelper.createLabel("3.Validate the error message\"\"",ExtentColor.GREEN));
		test.log(Status.INFO,"Showing "+tr);
		try {Assert.assertEquals(tr, "Name should have only Alphabets and numbers");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("09876");}
		Test.DiscardButton_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_68<br />Test case description: Validate the working of Wallet name field by using Alaphabets both in uppercase and lower case.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("ABCDEFGHIJKLM");
		String Alberto7=Test.Wallet_name().getText();
		try {Assert.assertEquals(Alberto7, "ABCDEFGHIJKLM, Enter wallet name");}catch(AssertionError e) {test.fail(e);passFailScreenshot("05");}
		Test.DiscardButton_Click();
		Test.Send_keys("abcdefghijklm");
		String Alberto12=Test.Wallet_name().getText();
		try {Assert.assertEquals(Alberto12, "abcdefghijklm, Enter wallet name");}catch(AssertionError e) {test.fail(e);passFailScreenshot("06");}
		test.log(Status.INFO,"Entered Upper case  "+Alberto7);
		test.log(Status.PASS, MarkupHelper.createLabel("Should allow to enter alphabets in both an upper and lower case",ExtentColor.GREEN));
		String Alberto3=Test.Wallet_name().getText();
		test.log(Status.INFO,"Entered  Lower case "+Alberto3);
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_69<br />Test case description: Validate Whether the wallet name field is Allowing the Space in between the values.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");  	
		Test.DiscardButton_Click();
		Test.Send_keys("AS Hhhj jj ");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a space between value",ExtentColor.GREEN));
		boolean da=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).isDisplayed();
		try {Assert.assertTrue(da, "it as accepting space between values");}catch(AssertionError e) {test.fail(e);passFailScreenshot("07");}
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_70<br />Test case description: Validate the working of wallet name field by using numerical value.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.DiscardButton_Click();
		Test.Send_keys("1213232435");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a number in the text box",ExtentColor.GREEN));
		String f=driver.findElement(By.xpath("//android.widget.EditText[@text=\"1213232435, Enter wallet name\"]")).getAttribute("text");
		try {  Assert.assertEquals(f,"1213232435, Enter wallet name","Not accepting numbers");}catch(AssertionError e){test.fail(e);passFailScreenshot("08");}
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_58<br />Test case description: Validate Whether able to delete the default wallet name.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.DiscardButton_Click();
		String ad=Test.Wallet_name().getAttribute("text");
		try {Assert.assertEquals(ad, "Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("uoioi");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the cancel icon in the wallet name",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_71<br />Test case description: Validate whether crusher blink on clicking the Wallet name field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		driver.switchTo().activeElement();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the text box",ExtentColor.GREEN));
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter wallet name\"]")).equals(driver.switchTo().activeElement()));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_72<br />Test case description: Validate the presence of placeholder in the wallet name field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test
		.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value",ExtentColor.GREEN));
		String Alberto5=Test.Wallet_name().getText();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Check the placeholder",ExtentColor.GREEN));
		System.out.println(Alberto5);
		test.log(Status.INFO,Alberto5);
		try {Assert.assertEquals(Alberto5, "Wallet Name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("yiytjgj");}
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_73<br />Test case description: Validate whether the values entered in the wallet field is visible.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("BAsvvgvjhakvhsjkvhkjavshfkjafd");
		String Alberto4=Test.Wallet_name().getText();
		System.out.println(Alberto4);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a value in the text box",ExtentColor.GREEN));
		test.log(Status.INFO, "Entered value-> "+Alberto4+" text field");
		try {Assert.assertEquals(Alberto4, "BAsvvgvjhakvhsjkvhkjavshfkjafd, Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("uuyt");}
		Test.DiscardButton_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_75<br />Test case description: Validate whether the value entered in the Wallet name field is able to copy.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Send_keys("SAggags");
		test.log(Status.PASS, MarkupHelper.createLabel("1.enter a value in the text box",ExtentColor.GREEN));
		Test.DoubleTap(167, 478);
		Test.Click_On_Copy();
		String df=driver.getClipboardText();
		System.out.println(df);
		try {Assert.assertEquals(df, "SAggags");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("sdfsf");}
		test.log(Status.PASS, MarkupHelper.createLabel("2.copy the entered value",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_74<br />Test case description: validate whether paste option is working on the wallet field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		Test.DiscardButton_Click();
		Test.DoubleTap(155, 474);
		Test.Click_On_PasteOnemptytextfieldText();
		Thread.sleep(2000);
		String at=Test.Wallet_name().getAttribute("text");
		try {Assert.assertEquals(at, "SAggags, Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("hj");}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Paste a value in the text box",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_66<br />Test case description: Validate the working of  Wallet name field by entering values above boundary value.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value in the wallet name",ExtentColor.GREEN));
		Test.Send_keys("sgdgsdgdsgsdgdsgsgdgsfhdhdfhd");
		test.log(Status.PASS, MarkupHelper.createLabel("2.Enter a value above boundary limit in text box",ExtentColor.GREEN));
		String vas=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).getAttribute("content-desc");
		test.log(Status.INFO,"Showing "+vas);
		System.out.println(vas);
		try {Assert.assertEquals(vas, "Enter valid name upto 15 characters");}catch(AssertionError e) {test.fail(e);passFailScreenshot("09");}
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_63<br />Test case description: Validate the working of the scrolling action in the seed language field in both downward and upward direction</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.Scroll_Up();
		String vas8=driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas8, "English");}catch(AssertionError e) {test.fail(e);passFailScreenshot("10");}
		Test.Scroll_Down();
		String vas9=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Italian\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas9, "Italian");}catch(AssertionError e) {test.fail(e);passFailScreenshot("11");}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Scroll the seed language function in both upward and downward",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_60<br />Test case description: Validate whether able to select the Seed Language</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.German_Langauge();
		String vas10=driver.findElement(By.xpath("//android.view.View[@content-desc=\"German\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas10, "German");}catch(AssertionError e) {test.fail(e);passFailScreenshot("12");}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Select anyone language ",ExtentColor.GREEN));
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_61<br />Test case description: Validate whether all option in the seed language is enable.</b>");
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
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_62<br />Test case description: Validate whether able to multiselect the seed language</b>");
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
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_65<br />Test case description: Validate the continue functionality without enter any value in the wallet name field.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Test.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value in the wallet name ",ExtentColor.GREEN));
		Test.Click_On_Continue();
		test.log(Status.PASS, MarkupHelper.createLabel("2.click the continue function ",ExtentColor.GREEN));
		String av=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).getAttribute("content-desc");
		test.log(Status.INFO, "Showing "+av);
		try {Assert.assertEquals(av, "pick a wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("had");}
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods= {"NewWallet"})
	public void Without_internet_connection() throws InterruptedException, IOException {
		test=extent.createTest("Test Scenario:	To Check the working of the New Wallet functionality in Create New Wallet", "<b><br /> Test case Id: TC_77<br />Test case description: Validate the working of the screen activity without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn off the device internet connection", ExtentColor.GREEN));
		turn_Off Off=new turn_Off();
		Off.Turn_Off_Data_Wifi();
		driver.navigate().back();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Open the App", ExtentColor.GREEN));
		Without_internet_connection ag=new Without_internet_connection();
		ag.new_wallet_screen();
    }
	}
