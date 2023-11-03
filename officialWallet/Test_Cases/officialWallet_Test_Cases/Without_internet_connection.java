package officialWallet_Test_Cases;

import java.io.IOException;

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
import officialWallet.CreateNewWallet1;
import officialWallet.Use_Existing_Wallet;

public class Without_internet_connection extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 Test;
	Use_Existing_Wallet ExistingWallet;
	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Test
	public void setup_screen() throws InterruptedException, IOException {
	Test=new CreateNewWallet1(driver);
	Test
	.createNewWallet();
	Thread.sleep(3000);
	Test
	.NavigateBACK();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Back button",ExtentColor.GREEN));//navigating back to opening page
	try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Welcome to Beldex Wallet :)\"]")).isDisplayed(), "Not able to navigate back to opening page");}catch(Exception e) {
		test.fail(e);
	}
Thread.sleep(1000);
	Test
	.createNewWallet()
	.KeyBoardisEnbled();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Check the screen", ExtentColor.GREEN));
	test.log(Status.INFO,"<b><font color='blue' size='2'>Keypad is enabled</font></b>");
	System.out.println("Keypad is enabled");
	try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@index=\"0\"]")).isEnabled(),"Keyboard is not enabled");}catch(Exception e) {
		test.fail(e);
	}
	test.log(Status.PASS,MarkupHelper.createLabel("1.place any finger in the scan function", ExtentColor.GREEN));
	Test.BiometricScan();
	
	test.log(Status.INFO,"<b><font color='blue' size='2'>showing content\"Go to settings and tExistingWalletn on the biometric function\"</font></b>");
	passFailScreenshot("Biometric functions");
	try{Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Biometric feature currenly disabled.Kindly enable allow biometric authentication feature inside the app settings")).isDisplayed());}catch(AssertionError e) {
		test.fail(e);passFailScreenshot("202");}
	
	Test.OkbuttoninUEWclick();
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
	Test
	.switchBetweenPin();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 6 digit pin function", ExtentColor.GREEN));
	try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 4-digit PIN\"]")).isDisplayed(),"Not swicthed to 6 digit pin");}catch(Exception e) {
		test.fail(e);
	}
	Thread.sleep(2000);
	Test
	.switchBetweenPin();
	test.log(Status.PASS,MarkupHelper.createLabel("1.Click the 4 digit pin function", ExtentColor.GREEN));
	try{Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Switch to 6-digit PIN\"]")).isDisplayed(),"Not swicthed to 4 digit pin");}catch(Exception e) {
		test.fail(e);}
	Thread.sleep(2000);
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
		try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");}catch(Exception  e){
			test.fail(e);
		}
		Test.OkbuttoninUEWclick();}
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
	try{Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"PIN is incorrect\"]")).isDisplayed(),"Not able to validate");}catch(Exception e) {
		test.fail(e);
	}
test.log(Status.PASS, "<b>Showing message\"Pin is in correct\" <b>");
	passFailScreenshot("Showing");
	Test.OkbuttoninUEWclick();
	TouchAction touch1=new TouchAction(driver);
	touch1.tap(PointOption.point(47,202)).perform();
}
	@Test
	public void new_wallet_screen() throws InterruptedException, IOException {
		Test=new CreateNewWallet1(driver);
		Thread.sleep(7000);
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
		.Enter_0()
		.Enter_2()
		.Enter_4()
		.Enter_6()
		.OkbuttoninUEWclick();
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
		Test.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value in the wallet name",ExtentColor.GREEN));
		Test.Send_keys("dssdgsdgds");
		String su1=Test.Wallet_name().getText();
		try {Assert.assertEquals(su1, "dssdgsdgds, Enter wallet name");}catch(AssertionError e) {test.fail(e);passFailScreenshot("04");}
		test.log(Status.PASS, MarkupHelper.createLabel("2.Enter a value in the wallet name field",ExtentColor.GREEN));
		Test.DiscardButton_Click();
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
		Test.DiscardButton_Click();
		Test.Send_keys("AS Hhhj jj ");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a space between value",ExtentColor.GREEN));
		boolean da=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).isDisplayed();
		try {Assert.assertTrue(da, "it as accepting space between values");}catch(AssertionError e) {test.fail(e);passFailScreenshot("07");}
		Test.DiscardButton_Click();
		Test.Send_keys("1213232435");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a number in the text box",ExtentColor.GREEN));
		String f=driver.findElement(By.xpath("//android.widget.EditText[@text=\"1213232435, Enter wallet name\"]")).getAttribute("text");
		try {  Assert.assertEquals(f,"1213232435, Enter wallet name","Not accepting numbers");}catch(AssertionError e){test.fail(e);passFailScreenshot("08");}
		Test
		.DiscardButton_Click();
		String ad=Test.Wallet_name().getAttribute("text");
		try {Assert.assertEquals(ad, "Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("uoioi");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the cancel icon in the wallet name",ExtentColor.GREEN));
		driver.switchTo().activeElement();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the text box",ExtentColor.GREEN));
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter wallet name\"]")).equals(driver.switchTo().activeElement()));
		Test
		.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value",ExtentColor.GREEN));
		String Alberto5=Test.Wallet_name().getText();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Check the placeholder",ExtentColor.GREEN));
		System.out.println(Alberto5);
		test.log(Status.INFO,Alberto5);
		try {Assert.assertEquals(Alberto5, "Wallet Name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("yiytjgj");}
		Test.Send_keys("BAsvvgvjhakvhsjkvhkjavshfkjafd");
		String Alberto4=Test.Wallet_name().getText();
		System.out.println(Alberto4);
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a value in the text box",ExtentColor.GREEN));
		test.log(Status.INFO, "Entered value-> "+Alberto4+" text field");
		try {Assert.assertEquals(Alberto4, "BAsvvgvjhakvhsjkvhkjavshfkjafd, Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("uuyt");}
		Test.DiscardButton_Click();
		Test.Send_keys("SAggags");
		test.log(Status.PASS, MarkupHelper.createLabel("1.enter a value in the text box",ExtentColor.GREEN));
		Test.DoubleTap(167, 478);
		Test.Click_On_Copy();
		String df=driver.getClipboardText();
		System.out.println(df);
		try {Assert.assertEquals(df, "SAggags");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("sdfsf");}
		test.log(Status.PASS, MarkupHelper.createLabel("2.copy the entered value",ExtentColor.GREEN));
		Test.DiscardButton_Click();
		Test.DoubleTap(155, 474);
		Test.Click_On_PasteOnemptytextfieldText();
		String at=Test.Wallet_name().getAttribute("text");
		try {Assert.assertEquals(at, "SAggags, Enter wallet name");}catch(AssertionError e) {test.fail(e);
		passFailScreenshot("hj");}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Paste a value in the text box",ExtentColor.GREEN));
		Test.DiscardButton_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.clear the default value in the wallet name",ExtentColor.GREEN));
		Test.Send_keys("sgdgsdgdsgsdgdsgsgdgsfhdhdfhd");
		test.log(Status.PASS, MarkupHelper.createLabel("2.Enter a value above boundary limit in text box",ExtentColor.GREEN));
		String vas=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Enter valid name upto 15 characters\"]")).getAttribute("content-desc");
		test.log(Status.INFO,"Showing "+vas);
		System.out.println(vas);
		try {Assert.assertEquals(vas, "Enter valid name upto 15 characters");}catch(AssertionError e) {test.fail(e);passFailScreenshot("09");}
		Test.Scroll_Up();
		String vas8=driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas8, "English");}catch(AssertionError e) {test.fail(e);passFailScreenshot("10");}
Test.Scroll_Down();
		String vas9=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Italian\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas9, "Italian");}catch(AssertionError e) {test.fail(e);passFailScreenshot("11");}
test.log(Status.PASS, MarkupHelper.createLabel("1.Scroll the seed language function in both upward and downward",ExtentColor.GREEN));
Test.German_Langauge();
String vas10=driver.findElement(By.xpath("//android.view.View[@content-desc=\"German\"]")).getAttribute("content-desc");
try {Assert.assertEquals(vas10, "German");}catch(AssertionError e) {test.fail(e);passFailScreenshot("12");}
test.log(Status.PASS, MarkupHelper.createLabel("1.Select anyone language ",ExtentColor.GREEN));
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
Test
.Japanese_Langauge();
test.log(Status.PASS, MarkupHelper.createLabel("1.select any one language ",ExtentColor.GREEN));
Test.Portuguese_Langauge();
test.log(Status.PASS, MarkupHelper.createLabel("2.Select another language ",ExtentColor.GREEN));
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
	
	public void seed_Keys_Restore() throws IOException, InterruptedException {
		Test=new CreateNewWallet1(driver);
		ExistingWallet=new Use_Existing_Wallet(driver);
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
		ExistingWallet.Restore_from_SeedButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Restore from seed function",ExtentColor.GREEN));
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back to the previous screen");}catch(Exception e) {passFailScreenshot("78");test.fail(e);}
		ExistingWallet.Restore_from_KeysButton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Restore from keys function",ExtentColor.GREEN));
		Test.NavigateBACK();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click the back button",ExtentColor.GREEN));
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back to the previous screen");}catch(Exception e) {passFailScreenshot("79");test.fail(e);}
		ExistingWallet.Restore_from_SeedButton();
		Test.German_Langauge();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click any one language in the option",ExtentColor.GREEN));
		String vas10=driver.findElement(By.xpath("//android.view.View[@content-desc=\"German\"]")).getAttribute("content-desc");
		try {Assert.assertEquals(vas10, "German");}catch(AssertionError e) {test.fail(e);passFailScreenshot("12");}
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
		Test
		.Japanese_Langauge();
		test.log(Status.PASS, MarkupHelper.createLabel("1.select any one language ",ExtentColor.GREEN));
		Test.Portuguese_Langauge();
		test.log(Status.PASS, MarkupHelper.createLabel("2.Select another language ",ExtentColor.GREEN));
		String ga=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Japanese\"]")).getAttribute("clickable");
		try {Assert.assertEquals(ga,"true", "able to multiselect");}catch(AssertionError e) {test.fail(e);}
		
	}
	public void restore_From_Seed() throws IOException, InterruptedException {
		ExistingWallet=new Use_Existing_Wallet(driver);
		Test=new CreateNewWallet1(driver);
		ExistingWallet.Restore_from_SeedButton();
		ExistingWallet.Next_Button_Click();
		driver.navigate().back();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recovery Seed/Key\"]")).isDisplayed(), "Not able to navigate back");}catch(Exception e) {passFailScreenshot("03"); test.fail(e);}
		ExistingWallet.Restore_from_SeedButton();
		ExistingWallet.Next_Button_Click();
		ExistingWallet.Next_Button_Click();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Restore from Seed\"]")).isDisplayed(), "Able to navigate next screen without seed");}catch(Exception e) {passFailScreenshot("09");test.fail(e);}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Click the next button",ExtentColor.GREEN));
	    passFailScreenshot("099");
	    Test.DoubleTapGeneral(141 ,650 );
		driver.setClipboardText("Alberto");
		ExistingWallet.Paste_RfS_Click();
	    String sa=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
	    System.out.println(sa);
	    try {Assert.assertEquals(sa,sa);}catch(AssertionError e) {passFailScreenshot("088");test.fail(e);}
	    test.log(Status.PASS, MarkupHelper.createLabel("1.click the paste option",ExtentColor.GREEN));
	    test.log(Status.INFO, MarkupHelper.createLabel(sa,ExtentColor.GREEN));
	    passFailScreenshot("23");
	    driver.setClipboardText("Alberto jhsfhsaf");
		ExistingWallet.Paste_RfS_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("1.click the paste option",ExtentColor.GREEN));
		String as=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
	    System.out.println(as);
	    passFailScreenshot("678");
		ExistingWallet.Clear_RfS_Click();
		test.log(Status.PASS, MarkupHelper.createLabel("2.click the clear option",ExtentColor.GREEN));
		 String as134=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
		    System.out.println(as134);
		    passFailScreenshot("455");
		    try {Assert.assertEquals(as134,as134);}catch(AssertionError e) {passFailScreenshot("565");test.fail(e);}
		     
		    test.log(Status.INFO, MarkupHelper.createLabel(as134,ExtentColor.GREEN));
		Test.Send_keys("hjdsdg jkdgs dgdsgds gdsg dsgd gd gdgd");
		String aa=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
	    System.out.println(aa);
	    try {Assert.assertEquals(aa,aa);}catch(AssertionError e) {passFailScreenshot("088");test.fail(e);}
	    test.log(Status.INFO, MarkupHelper.createLabel(aa,ExtentColor.GREEN));
	    test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a seed value",ExtentColor.GREEN));
		ExistingWallet.Clear_RfS_Click();
		Test.Send_keys("hjdsdg jkdgs dgdsgds gdsg dsgd gdhg gdgd hjghj hjghjgh");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a InValid seed value",ExtentColor.GREEN));
	    ExistingWallet.Next_Button_Click();
	    
	    try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a valid seed\"]")).isDisplayed(),"Able to navigate to next screen");}catch(Exception e){passFailScreenshot("3456");test.fail(e);}
	    ExistingWallet.Clear_RfS_Click();
	    test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a InValid seed value",ExtentColor.GREEN));
	    Test.Send_keys("sovereign tissue benches pepper vitals unquoted suede gained bubble lava sniff asylum fleet thirsty tidy tulips height assorted dexterity lodge wiring putty testing touchy assorted");
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a Valid seed value",ExtentColor.GREEN));
		ExistingWallet.Next_Button_Click();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet Restore\"]")).isDisplayed(),"Able to navigate to next screen");}catch(Exception e){passFailScreenshot("3456");test.fail(e);}
		test.log(Status.PASS, MarkupHelper.createLabel("1.Enter a InValid seed value",ExtentColor.GREEN));
		
	}
	public void seed_keys() throws IOException, InterruptedException {
		Test=new CreateNewWallet1(driver);
		ExistingWallet=new Use_Existing_Wallet(driver);
		
		driver.toggleWifi();

		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		test=extent.createTest("Test Scenario:	To Check the working of the Restore from keys screen in the Use Existing Wallet", "<b><br /> Test case Id: TC_111<br />Test case description: Validate whether able to navigate back to the previous screen.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		ExistingWallet.Restore_from_KeysButton();
		ExistingWallet.Next_Button_Click();
		ExistingWallet.Enter_wallet_name().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter wallet name\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("11");test.fail(e);}
		ExistingWallet.Address().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Address\"]")).isEnabled());}catch(AssertionError e) {passFailScreenshot("12");test.fail(e);}
		ExistingWallet.View_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"View key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("13");test.fail(e);}
		ExistingWallet.Spend_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Spend key (private)\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("14");test.fail(e);}
		ExistingWallet.Restore_key().isEnabled();
		try {Assert.assertTrue(driver.findElement(By.xpath("//android.widget.EditText[@text=\"Restore from Blockheight\"]")).isEnabled());}catch(Exception e) {passFailScreenshot("15");test.fail(e);}
		ExistingWallet.Enter_wallet_name_text_field();
		Test.Send_keys("Alberto");
		ExistingWallet.Address_text_field();
		Test.Send_keys("bxcKuXcfrvjf3wBm8eyWubNvg1iwEmKzrimV4s7jdH6zCdFDE4TQoBH2z6uXJ9ejrLU621EdtLDfkGiZHXcF6dqC1KrGvC3mj");
		ExistingWallet.view_key_text_field();
		Test.Send_keys("6038c4ef5b0166628ac12e9f7d425e149674710126ffcb32bdef80ee2a946105");
		ExistingWallet.spend_key_text_field();
		Test.Send_keys("f7b4b0253e738ea4c3529ce48c6e26bc9adecdc46c17ef5ebac6e5fbd4b92a00");
		ExistingWallet.Restore_Options();
		ExistingWallet.restore_key_text_field();
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		//ur.Restore_Options();
		Test.swicthtodatebutton();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid value in all text boxes except date field.",ExtentColor.GREEN));
		//Test.Inputdateformate();
		Test.passdate().clear();
		Test.Send_keys("9/22/2023");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Select a invalid date.",ExtentColor.GREEN));
		Test.ClickOnOkButton();
		ExistingWallet.Reestore_Button();
	}
}
