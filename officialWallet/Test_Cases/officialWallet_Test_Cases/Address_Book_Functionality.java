package officialWallet_Test_Cases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import officialWallet.AddressBook;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.NodesPage;
import officialWallet.Wallet_Settings;
import officialWallet.Wallets;

public class Address_Book_Functionality extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 password; 
	HomescreenPage Homepage;
	Wallet_Settings settings;
	AddressBook book; 

	@Test(priority=1)
	public void PIN() {
		password=new CreateNewWallet1(driver);
		password.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();}



	@Test(priority=2)
	public void TC_231() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_231 <br />Test case description: Validate Whether able to navigate back to the previous screen.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		book=new AddressBook(driver);
		book.clickOnAddressbookButton();
		Thread.sleep(3000);
		List<WebElement> Backbutton=driver.findElements(By.className("android.widget.ImageView"));
		Backbutton.get(0).click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		List<WebElement> Flash=driver.findElements(By.xpath("//android.widget.ImageView[@index=\"1\"]"));
		try {Assert.assertTrue(Flash.get(1).isDisplayed());test.pass("<b>Navigated back<b>");}catch(Exception e) {test.fail("Not able to navigate back"+e);passFailScreenshot("0.0");}
	}
		//	driver.navigate().back();
//----------------------------------------------------------------------------------------		
		@Test(priority=3)
		public void TC_232() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_232 <br />Test case description: Validate the contents in the Screen</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.clickOnAddressbookButton();
			List<WebElement> AddressbookHeading=driver.findElements(By.xpath("//android.view.View[@index=\"1\"]"));
			String Heading=AddressbookHeading.get(0).getAttribute("content-desc");
			System.out.println(Heading);
			try {Assert.assertEquals("Address Book", Heading);test.pass("Showing content on app bar "+Heading);}catch(AssertionError e) {test.fail("<b>Not showing \"Address Book \" on app bar<b>");passFailScreenshot("0.1");}
		
		//driver.navigate().back();
		//List<WebElement> Backbutton1=driver.findElements(By.className("android.widget.ImageView"));
		//Backbutton1.get(0).click();
		book.clickOnAddAddress();
String Content=		driver.findElement(AppiumBy.accessibilityId("Add Address")).getAttribute("content-desc");
    System.out.println("Showing text on appbar "+Content);	try {Assert.assertEquals("Add Address", Content);test.pass("Showing content on app bar "+Content);}catch(AssertionError e) {test.fail("<b>Not showing \"Add Address \" on app bar<b>");passFailScreenshot("0.2");}
    test.log(Status.PASS,MarkupHelper.createLabel("1.Check the contents",ExtentColor.GREEN));
		}
//----------------------------------------------------------------------------------------------------------------
		@Test(priority=4)
		public void TC_234() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_234 <br />Test case description: Validate the working of the Contact by using valid Contact Name and InValid Address</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
		book.ClickonEnterNameTextField(); 
		Actions sendtext2=new Actions(driver);
		sendtext2.sendKeys("ALBERTO").perform();
		try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.pass("<b>Able to add valid name <b>");passFailScreenshot("0.000000008");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);passFailScreenshot("0.000000007");}
		test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid Contact name",ExtentColor.GREEN));
		book.clickOnEnterAddressTextField();
		Actions sendtext3=new Actions(driver);
		sendtext3.sendKeys("bxcvQMDfw6w5hT851fUfP2aC7KbPdueMcN1cp38w").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a invalid address",ExtentColor.GREEN));
		try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.fail("<b>Not showing the error message for entering invalid Address<b>");passFailScreenshot("0.000.12");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.pass("<b>Showing error <b> "+rat);passFailScreenshot("0.01012457");}

		Thread.sleep(4000);
		List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
		AddButton1.get(1).click();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click the save option",ExtentColor.GREEN));
		Thread.sleep(3000);
		book.clickOnResetButton();
		
		}
//----------------------------------------------------------------------------------------------------------------
		@Test(priority=5)
		public void TC_235() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_235 <br />Test case description: Validate the working of the Contact by using Invalid Contact Name and Valid Address</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");

			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys(",").perform();
			Thread.sleep(3000);
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.fail("<b>Not showing error for invalid name <b>");passFailScreenshot("0.00789");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.pass("<b>Showing error <b> "+ra);passFailScreenshot("0.00788");}
			//try {Assert.assertTrue(book.Invalidname().isDisplayed());test.pass("<b>Showing Contact name can't contain','\"symbols and must be between 1 and 32 characters long\" <b>");}catch(Exception e) {test.fail("Not showing Invalid  name");passFailScreenshot("0.4");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a Invalid Contact name( , comma synbol)",ExtentColor.GREEN));
			book.clickOnEnterAddressTextField();
			Actions sendtext8=new Actions(driver);
			sendtext8.sendKeys("bxcvQMDfw6w5hT851fUfP2aC7KbPdueMcN1cp38wvSwDJDRcL5E73ePZVRoG1s7qMuVr9DeiDCzos85APDGdePEC1X6FXoWwW").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid address",ExtentColor.GREEN));
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.00787");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.00786");}
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			Thread.sleep(3000);
			book.clickOnResetButton();}
//----------------------------------------------------------------------------------------------------------------
		@Test(priority=6)
		public void TC_236() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_236 <br />Test case description: Validate the working of the Contact by using Invalid Contact Name and InValid Address</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys(",").perform();
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.fail("<b>Not showing error for invalid name <b>");passFailScreenshot("0.00785");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.pass("<b>Showing error <b> "+ra);passFailScreenshot("0.00784");}
			//try {Assert.assertTrue(book.Invalidname().isDisplayed());test.pass("<b>Showing Contact name can't contain','\"symbols and must be between 1 and 32 characters long\" <b>");}catch(Exception e) {test.fail("Not showing Invalid name");passFailScreenshot("0.5");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a Invalid Contact name( , comma synbol)",ExtentColor.GREEN));

			book.clickOnEnterAddressTextField();
			Actions sendtext8=new Actions(driver);
			sendtext8.sendKeys("ePEC1X6FXoWwW").perform();
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.fail("<b>Not showing the error message for  invalid Address<b>");passFailScreenshot("0.00783");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.pass("<b>Showing error <b> "+rat);passFailScreenshot("0.00782");}
			//try {Assert.assertTrue(book.InvalidAddress().isDisplayed());test.pass("<b>Showing Invalid BDX address <b>");}catch(Exception e) {test.fail("Not showing Invalid BDX address");passFailScreenshot("0.6");}
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a invalid address",ExtentColor.GREEN));
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			Thread.sleep(3000);
			book.clickOnResetButton();
		
		}
		
		
		
//----------------------------------------------------------------------------------------------------------------		
		@Test(priority=7)
		public void TC_238() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_238 <br />Test case description: Validate the Working of the Scanner functionality by scanning Invalid Beldex BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//Scan invalid QR
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the scan function",ExtentColor.GREEN));
			String Scanner=driver.findElement(By.className("android.widget.TextView")).getAttribute("text");
			try {Assert.assertEquals("FLASH ON",Scanner);test.pass("<b>Opened scanner<b>");}catch(Exception e) {test.fail("Not able t o open scanner");passFailScreenshot("0.00781");}
			System.out.println("Please scan invalid QR ");
			test.log(Status.PASS,MarkupHelper.createLabel("2.scan with Invalid barcode",ExtentColor.GREEN));
			Thread.sleep(10000);
			book.clickOnResetButton();
		}
//----------------------------------------------------------------------------------------------------------------		
		
		@Test(priority=8)
		public void TC_240() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_240 <br />Test case description: Validate the working of the Contact by using valid Contact Name and scanning Invalid BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys("Albetro2").perform();
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.pass("<b>Able to add valid name <b>");passFailScreenshot("0.11111111");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);passFailScreenshot("0.222222222");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid Contact name",ExtentColor.GREEN));
			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//scan invalid QR
			System.out.println("Please scan invalid QR ");
			//try {Assert.assertEquals("FLASH ON",Scanner);test.pass("<b>Opened scanner<b>");}catch(Exception e) {test.fail("Not able t o open scanner");passFailScreenshot("0.8");}
			Thread.sleep(3000);
			
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.fail("<b>Not showing the error message for scanning the invalid QR code<b>");passFailScreenshot("0.00780");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.pass("<b>Showing error <b> "+rat);passFailScreenshot("0.00779");}
			Thread.sleep(4000);
			//try {Assert.assertTrue(book.InvalidAddress().isDisplayed());test.pass("<b>Showing invalid address scanning the invalid QR code<b>");}catch(Exception e) {test.fail("Not showing inavlid address ");passFailScreenshot("0.9");}
		
			test.log(Status.PASS,MarkupHelper.createLabel("2.Scan with Invalid barcode",ExtentColor.GREEN));
			Thread.sleep(6000);
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			Thread.sleep(3000);
			book.clickOnResetButton();
			try {Assert.assertTrue(book.nameshouldnotbeempty().isDisplayed());book.addressshouldnotbeempty().isDisplayed();test.pass("able to reset");}catch(Exception e) {test.fail("Not able reset");passFailScreenshot("0.00778");}
		}
//----------------------------------------------------------------------------------------------------------------		
		@Test(priority=9)
		public void TC_241() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_241 <br />Test case description: Validate the working of the Contact by using Invalid Contact Name and scanning valid Beldex BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys(",").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a Invalid Contact name",ExtentColor.GREEN));
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.fail("<b>Not showing error for invalid name <b>");passFailScreenshot("0.00777");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.pass("<b>Showing error <b> "+ra);passFailScreenshot("0.00776");}

			//try {Assert.assertTrue(book.Invalidname().isDisplayed());test.pass("<b>Showing Contact name can't contain','\"symbols and must be between 1 and 32 characters long\" <b>");}catch(Exception e) {test.fail("Not showing Invalid name");passFailScreenshot("0.11");}
			
			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//scan valid QR
			test.log(Status.PASS,MarkupHelper.createLabel("2.Scan with valid Beldex barcode",ExtentColor.GREEN));
			System.out.println("Please scan valid QR ");
			Thread.sleep(4000);
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.00775");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.00774");}
			Thread.sleep(4000);
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			Thread.sleep(2000);
			book.clickOnResetButton();
		try {Assert.assertTrue(book.nameshouldnotbeempty().isDisplayed());book.addressshouldnotbeempty().isDisplayed();test.pass("able to reset");}catch(Exception e) {test.fail("Not able reset");passFailScreenshot("0.00773");}
		}
		
		
		
		
//----------------------------------------------------------------------------------------------------------------
		@Test(priority=10)
		public void TC_242() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_242 <br />Test case description: Validate the working of the Contact by using Invalid Contact Name and scanning Invalid BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys(",").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a Invalid Contact name",ExtentColor.GREEN));
			
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.fail("<b>Not showing error for invalid name <b>");passFailScreenshot("0.00772");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.pass("<b>Showing error <b> "+ra);passFailScreenshot("0.00771");}

			//try {Assert.assertTrue(book.Invalidname().isDisplayed());test.pass("<b>Showing Contact name can't contain','\"symbols and must be between 1 and 32 characters long\" <b>");}catch(Exception e) {test.fail("Not showing Invalid name");passFailScreenshot("0.13");}
			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//scan invalid QR
			test.log(Status.PASS,MarkupHelper.createLabel("2.Scan with Invalid barcode",ExtentColor.GREEN));
			System.out.println("Please scan invalid QR ");
			Thread.sleep(4000);
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.fail("<b>Not showing the error message for scanning the invalid QR code<b>");passFailScreenshot("0.00770");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.pass("<b>Showing error <b> "+rat);passFailScreenshot("0.00769");}

			//try {Assert.assertTrue(book.InvalidAddress().isDisplayed());test.pass("<b>Showing invalid address scanning the invalid QR code<b>");}catch(Exception e) {test.fail("Not showing inavlid address ");passFailScreenshot("0.14");}
			Thread.sleep(4000);
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			Thread.sleep(2000);
			book.clickOnResetButton();
		}
		
		
		
		
		
		
//----------------------------------------------------------------------------------------------------------------
		@Test(priority=11)
		public void TC_237() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_237 <br />Test case description: Validate the Working of the Scanner functionality by scanning valid Beldex BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
		
		

			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//Scan valid QR
			System.out.println("Please scan valid QR ");
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the scan function",ExtentColor.GREEN));
			Thread.sleep(4000);
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.00768");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.00767");}

			//try {Assert.assertFalse(book.InvalidAddress().isDisplayed());test.pass("<b>Showing the address scanning the valid QR code<b>");}catch(Exception e) {test.fail("Not showing valid address ");passFailScreenshot("0.15");}
			test.log(Status.PASS,MarkupHelper.createLabel("2.scan with valid Beldex barcode",ExtentColor.GREEN));
			
			Thread.sleep(4000);
			book.clickOnResetButton();
		
		
		
		}
		
		
//----------------------------------------------------------------------------------------------------------------		
		@Test(priority=12)
		public void TC_239() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_239 <br />Test case description: Validate the working of the Contact by using valid Contact Name and scanning valid Beldex BarCode</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.ClickonEnterNameTextField();
			Actions sendtext7=new Actions(driver);
			sendtext7.sendKeys("Alberto3").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid Contact name",ExtentColor.GREEN));
			
			try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.pass("<b>Able to add valid name <b>");passFailScreenshot("0.00766");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);passFailScreenshot("0.00765");}

			//try {Assert.assertFalse(book.Invalidname().isDisplayed());test.pass("<b>Able to add valid name <b>");}catch(Exception e) {test.fail("Not showing valid name");passFailScreenshot("0.17");}
		
			List<WebElement> Scannerbutton=driver.findElements(By.className("android.widget.ImageView"));
			Scannerbutton.get(1).click();//scan valid QR
			System.out.println("Please scan valid QR ");
			Thread.sleep(4000);
			try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.00764");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.00763");}

			//try {Assert.assertFalse(book.InvalidAddress().isDisplayed());test.pass("<b>Showing the address scanning the valid QR code<b>");}catch(Exception e) {test.fail("Not showing valid address ");passFailScreenshot("0.19");}
			test.log(Status.PASS,MarkupHelper.createLabel("2.Scan with valid Beldex barcode",ExtentColor.GREEN));
			
			Thread.sleep(6000);
			List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
			AddButton1.get(1).click();
			test.log(Status.PASS,MarkupHelper.createLabel("3.Click the save option",ExtentColor.GREEN));
			Thread.sleep(3000);
			List<WebElement> AddedAddress=driver.findElements(By.className("android.widget.ImageView"));
			String split=AddedAddress.get(2).getAttribute("content-desc");
			split.split(" ");
			String yt=split.replaceAll("\\s","");
			//System.out.println(yt);
			String r6="Alberto3\r\n"
					+ "bxdSr5jZwVNGoVe5USNtrWCec1TWuFn85D8sPKs1okiSfc5mKqKAE8ZgZgquUPNeR8MTkDFC12spHGfsTHmndY731WiG3qzDK";	
			r6.split(" ");
			String tt=r6.replaceAll("\\s","");
			try{Assert.assertEquals(yt,tt);test.info("Saved and showing the address in the Address book </br>"+split);;}catch(AssertionError e) {test.fail("Not saved, Not showing the address in the Address book");passFailScreenshot("0.00762");}

			Thread.sleep(3000);
			
		
		}
		
		
		
//----------------------------------------------------------------------------------------------------------------		
		@Test(priority=13)
		public void TC_246() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_246 <br />Test case description: Validate whether able to Delete the added address</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.Swipe_Rightend_to_Left(12);
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the address from right end to left",ExtentColor.GREEN));
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Edit")).isDisplayed());test.pass("Swiped right to left");}catch(Exception e) {test.fail("Not able to swipe ");passFailScreenshot("0.00761");}
			
			book.clickOnDeleteAddressButton();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Click the delete option",ExtentColor.GREEN));
			password.Okbuttclick();
			List<WebElement> AddedAddress=driver.findElements(By.className("android.widget.ImageView"));
			String split=AddedAddress.get(2).getAttribute("content-desc");
			System.out.println(split);
			Thread.sleep(4000);
			
		}
		
		
//----------------------------------------------------------------------------------------------------------------		
		@Test(priority=14)
		public void TC_233() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_233 <br />Test case description: Validate the working of the Contact by using valid Contact Name and Valid Address</b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			book.clickOnAddAddress();
			 book.ClickonEnterNameTextField();
				Actions sendtext5=new Actions(driver);
				sendtext5.sendKeys("Alberto1").perform();
				test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid Contact name",ExtentColor.GREEN));
				
				try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.pass("<b>Able to add valid name <b>");passFailScreenshot("0.00760");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);passFailScreenshot("0.00759");}

				//try {Assert.assertFalse(book.Invalidname().isDisplayed());test.pass("<b>Able to add valid name <b>");}catch(Exception e) {test.fail("Not showing valid name");passFailScreenshot("0.24");}

				book.clickOnEnterAddressTextField();
				Actions sendtext6=new Actions(driver);
				sendtext6.sendKeys("bxcvQMDfw6w5hT851fUfP2aC7KbPdueMcN1cp38wvSwDJDRcL5E73ePZVRoG1s7qMuVr9DeiDCzos85APDGdePEC1X6FXoWwW").perform();
				test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid address",ExtentColor.GREEN));
				
				try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.00758");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.00757");}

				//try {Assert.assertFalse(book.InvalidAddress().isDisplayed());test.pass("<b>Able to add valid name <b>");}catch(Exception e) {test.fail("Not showing valid name");passFailScreenshot("0.24");}

				List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
				AddButton1.get(1).click();
				test.log(Status.PASS,MarkupHelper.createLabel("3.Click the save option",ExtentColor.GREEN));
				Thread.sleep(3000);
				List<WebElement> AddedAddress=driver.findElements(By.className("android.widget.ImageView"));
				String split=AddedAddress.get(2).getAttribute("content-desc");
				split.split(" ");
				String yt=split.replaceAll("\\s","");
				//System.out.println(yt);
				String r6="Alberto1\r\n"
						+ "bxcvQMDfw6w5hT851fUfP2aC7KbPdueMcN1cp38wvSwDJDRcL5E73ePZVRoG1s7qMuVr9DeiDCzos85APDGdePEC1X6FXoWwW";	
				String tt=r6.replaceAll("\\s","");
				try{Assert.assertEquals(yt,tt);System.out.println("Saved and showing the address in the Address book");System.out.println(split);}catch(AssertionError e) {System.out.println("Not saved, Not showing the address in the Address book");}}

		
		
		
		
//----------------------------------------------------------------------------------------------------------------		
				@Test(priority=15)
				public void TC_247() throws IOException, InterruptedException {
					test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_247 <br />Test case description: Validate Whether able to edit the added address</b>");
					test.assignAuthor("Alberto");
					test.assignCategory("Smoke Testing");
					test.assignDevice("Redmi Note 9 Pro");
					book.Swipe_Rightend_to_Left(12);
					book.clickOneditAddressButton();
					 book.ClickonEnterNameTextField();
						Actions sendtext5=new Actions(driver);
					for(int i=0;i<=3;i++) {	sendtext5.sendKeys(Keys.BACK_SPACE).perform();} 
					//List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
					//AddButton1.get(1).click();
					//List<WebElement> AddedAddress=driver.findElements(By.className("android.widget.ImageView"));
					//String split=AddedAddress.get(2).getAttribute("content-desc");
					String rtttt=driver.findElement(By.className("android.widget.EditText")).getAttribute("text");
					String Editedname=rtttt.substring(0, rtttt.length()-12);
					System.out.println(rtttt);
					//split.split(" ");
					try {if(Editedname.contains("Albe")){Assert.assertTrue(true);test.pass("Able to edit the Name Text Filed");}else{test.fail("Not able to edit");passFailScreenshot("0.00756");}}catch(Exception e) {test.fail(e);}
						try{book.clickOnEnterAddressTextField();
						Actions sendtext6=new Actions(driver);
						for(int i=0;i<=96;i++) {	sendtext6.sendKeys(Keys.BACK_SPACE).perform();}
						book.clickOnEnterAddressTextField();
						Actions sendtext11=new Actions(driver);
						sendtext11.sendKeys("bxcvQMDfw6w5hT851fUfP2aC7KbPdueMcN1cp38wvSwDJDRcL5E73ePZVRoG1s7qMuVr9DeiDCzos85APDGdePEC1X6FXoWwW").perform();
						List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
						AddButton1.get(1).click();}catch(Exception e) {test.fail("Only able to edit Name text field not able to edit Address text field");List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
						AddButton1.get(1).click();}
				}
				
				
				@Test(priority=16)
				public void TC_248() throws IOException, InterruptedException {
					test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_248 <br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.</b>");
					test.assignAuthor("Alberto");
					test.assignCategory("Smoke Testing");
					test.assignDevice("Redmi Note 9 Pro");
					driver.lockDevice();
					test.log(Status.PASS,MarkupHelper.createLabel("1.Lock the Screen of the device",ExtentColor.GREEN));
					driver.unlockDevice();
					test.log(Status.PASS,MarkupHelper.createLabel("2.Unlock the screen",ExtentColor.GREEN));
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
					Thread.sleep(3000);
					try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter Your PIN")).isDisplayed(), "Asking the pin");passFailScreenshot("126");}catch(AssertionError e) {test.fail(e);passFailScreenshot("125");}
					password
					.Enter_1()
					.Enter_5()
					.Enter_9()
					.Enter_3();
				
				}
				@Test(priority=17)
				public void TC_249() throws IOException, InterruptedException {
					test=extent.createTest("Test Scenario:	To Check the working of the Address Book functionality in the Settings Screen.  ", "<b><br /> Test case Id:TC_249 <br />Test case description: Validate the screen action without internet connection.</b>");
					test.assignAuthor("Alberto");
					test.assignCategory("Smoke Testing");
					test.assignDevice("Redmi Note 9 Pro");
					driver.toggleWifi();
					driver.findElement(By.id("android:id/button1")).click();
					book.clickOnAddAddress();
					 book.ClickonEnterNameTextField();
						Actions sendtext5=new Actions(driver);
						sendtext5.sendKeys("Alberto479").perform();
						test.log(Status.PASS,MarkupHelper.createLabel("1.Enter a valid Contact name",ExtentColor.GREEN));
						
						try {Assert.assertFalse(book.Invalidname().isDisplayed());String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);}catch(Exception e) {test.pass("<b>Able to add valid name <b>");passFailScreenshot("0.760");}catch(AssertionError e) {String ra=book.Invalidname().getAttribute("content-desc");test.fail(ra);passFailScreenshot("0.759");}

						//try {Assert.assertFalse(book.Invalidname().isDisplayed());test.pass("<b>Able to add valid name <b>");}catch(Exception e) {test.fail("Not showing valid name");passFailScreenshot("0.24");}

						book.clickOnEnterAddressTextField();
						Actions sendtext6=new Actions(driver);
						sendtext6.sendKeys("bxdSr5jZwVNGoVe5USNtrWCec1TWuFn85D8sPKs1okiSfc5mKqKAE8ZgZgquUPNeR8MTkDFC12spHGfsTHmndY731WiG3qzDK").perform();
						test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid address",ExtentColor.GREEN));
						
						try {Assert.assertFalse(book.InvalidAddress().isDisplayed());String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);}catch(Exception e) {test.pass("<b>Showing the address scanning the valid QR code<b>");passFailScreenshot("0.758");}catch(AssertionError e) {String rat=book.InvalidAddress().getAttribute("content-desc");test.fail(rat);passFailScreenshot("0.757");}

						//try {Assert.assertFalse(book.InvalidAddress().isDisplayed());test.pass("<b>Able to add valid name <b>");}catch(Exception e) {test.fail("Not showing valid name");passFailScreenshot("0.24");}

						List<WebElement> AddButton1=driver.findElements(By.className("android.widget.Button"));
						AddButton1.get(1).click();
						test.log(Status.PASS,MarkupHelper.createLabel("3.Click the save option",ExtentColor.GREEN));
						Thread.sleep(3000);
						List<WebElement> AddedAddress=driver.findElements(By.className("android.widget.ImageView"));
						String split=AddedAddress.get(2).getAttribute("content-desc");
						split.split(" ");
						String yt=split.replaceAll("\\s","");
						//System.out.println(yt);
						String r6="Alberto479\r\n"
								+ "bxdSr5jZwVNGoVe5USNtrWCec1TWuFn85D8sPKs1okiSfc5mKqKAE8ZgZgquUPNeR8MTkDFC12spHGfsTHmndY731WiG3qzDK";	
						String tt=r6.replaceAll("\\s","");
						try{Assert.assertEquals(yt,tt);System.out.println("Saved and showing the address in the Address book");System.out.println(split);}catch(AssertionError e) {System.out.println("Not saved, Not showing the address in the Address book");}
				
				}
//----------------------------------------------------------------------------------------------------------------				
			/*	
				List<WebElement> AddButton=driver.findElements(By.className("android.widget.Button"));
	AddButton.get(1).click();
	book.ClickonEnterNameTextField();
	Actions sendtext=new Actions(driver);
	sendtext.sendKeys("dsgsdgds").perform();
	book.clickOnEnterAddressTextField();
	Actions sendtext1=new Actions(driver);
	sendtext1.sendKeys("dsgsdg67").perform();
	book.clickOnResetButton();*/
//------------------------------------------------------------------------------------------------------------------	
	
	
//---------------------------------------------------------------------------------------------------------------------	
	
//------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	
		
//-------------------------------------------------------------------------------------------------------------------    
   //-------------------------------------------------------------------------------------------------------------------------

	/*Thread.sleep(1000);
		settings.Wallet_settings_Click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@index=\"4\"]")).click();
		Thread.sleep(1000);
		va.click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(6000);
		List<WebElement> tau=driver.findElements(By.className("android.view.View"));
		System.out.println(tau.get(2).getAttribute("content-desc"));
		String at= tau.get(2).getAttribute("content-desc");	
		String decimal_values= at.replaceAll("[^0-9\\.]", "");
		System.out.println(decimal_values);
		try { this.rtr=  removeFirstandLast(decimal_values);
		String findMe =this.rtr;
		int searchMeLength = at.length();
		int findMeLength = findMe.length();
		boolean foundIt = false;
		for (int i = 0; 
				i <= (searchMeLength - findMeLength);
				i++) {
			if (at.regionMatches(i, findMe, 0, findMeLength)) {
				foundIt = true;
				System.out.println(at.substring(i, i + findMeLength));
				break;
			}
		}
		if (!foundIt)
			System.out.println("No match found.");
		System.out.println(foundIt);
		try{Assert.assertTrue(foundIt);test.pass("<b>Showing as per the selected option<b> "+yu);passFailScreenshot(ty);}catch(AssertionError e){test.fail("Not showing as per the selected option");passFailScreenshot(ty);}}catch(Exception e) {test.pass("Not showing as per the selected option");passFailScreenshot(ty);}    
	}

	// Java program to remove the first and
	// the last character of a string

	// Function to remove the first and
	// the last character of a string
	public static String
	removeFirstandLast(String str)
	{

		// Removing first and last character
		// of a string using substring() method
		str = str.substring(3, str.length() - 4);

		// Return the modified string
		return str;
	}

	@DataProvider(name="login")
	public Object[][] loginData(){
		settings=new Wallet_Settings(driver);
		Object[][] data =new Object[4][4];
		data[0][0]=settings.Five();
		data[0][1]="<b>Selecting Beldex available Balance option<b>";
		data[0][2]="123.321";
		data[0][3]="<b>Selected 5 decimal point<b>";
		data[1][0]=settings.Four();
		data[1][1]="<b>Selecting Beldex Full Balance option<b>";
		data[1][2]="123.456";
		data[1][3]="<b>Selected 4 decimal point<b>";
		data[2][0]=settings.Two();
		data[2][1]="<b>Selecting Beldex hidden Balance option<b>";
		data[2][2]="123.687";
		data[2][3]="<b>Selected 2 decimal point<b>";
		data[3][0]=settings.Zero();
		data[3][1]="<b>Selecting Beldex hidden Balance option<b>";
		data[3][2]="123.78";
		data[3][3]="<b>Selected 0 decimal point<b>";
		return data;
	}



	@Test(priority=3,dataProvider = "lo")
	public void TC_197_And_TC_198_TC_199(WebElement va,String tb,String tt,String yo,String u3,String u2,String u1) throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallet Settings Screen ", "<b><br /> Test case Id:TC_197_And_TC_198_TC_199 <br />Test case description: Validate whether able to switch to all options in Fee Priority..</b>");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		driver.findElement(By.xpath("//android.view.View[@index=\"7\"]")).click();
		va.click();
		test.log(Status.PASS,MarkupHelper.createLabel(u3,ExtentColor.GREEN));
		driver.navigate().back();
		driver.navigate().back();
		Homepage.clickOnSendButton();
		test.log(Status.PASS,MarkupHelper.createLabel(u2,ExtentColor.GREEN));
		Thread.sleep(2000);
		String getflash=	driver.findElement(AppiumBy.accessibilityId(tt)).getAttribute("content-desc");

		System.out.println(getflash);
		try{Assert.assertEquals(getflash,tt);test.pass(tb+"<b>Showing estimated fee<b> "+getflash);passFailScreenshot(yo);}catch(AssertionError e){test.fail("Not Showing estimated fee\"0.004596\"");passFailScreenshot(yo);}    
		Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel(u1,ExtentColor.GREEN));
		driver.navigate().back();
	}


	@DataProvider(name="lo")
	public Object[][] loginTa(){
		settings=new Wallet_Settings(driver);
		Object[][] data =new Object[2][7];
		data[0][0]=settings.Currency_flash();
		data[0][1]="<b>Selecting flash option <b>";
		data[0][2]="0.004596";
		data[0][3]="0.00";
		data[0][4]="1.select the flash option";
		data[0][5]="2.Check the send screen";				
		data[0][6]="3.Check the Estimated fee";
		data[1][0]=settings.Currency_slow();
		data[1][1]="<b>Selected slow option <b>";
		data[1][2]="0.001532";
		data[1][3]="0.00789";
		data[1][4]="1.select the slow option";
		data[1][5]="2.Check the send screen";				
		data[1][6]="3.Check the Estimated fee";
		return data;
	}

	@SuppressWarnings({ "rawtypes", "deprecation", "unlikely-arg-type" })
	@Test(priority=4)
	public void TC_19() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallet Settings Screen ", "<b><br /> Test case Id:TC_200_And_TC_201 <br />Test case description: Validate working of the save recipient Address in both On and off Condition.</b>");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		Thread.sleep(5000);

		//Homepage.clickOnSettingsButton();
		//settings.Wallet_settings_Click();
		@SuppressWarnings("deprecation")
		TouchAction touchAction1=new TouchAction(driver);
		Thread.sleep(1000);
		//touchAction1.tap(PointOption.point(1010, 1282)).perform();
		//driver.navigate().back();
		//driver.navigate().back();
		Homepage.clickOnTransactionsButton();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.ImageView[@index=\"1\"]")).click();
		Thread.sleep(1000);
		List<WebElement> tra=driver.findElements(By.xpath("//android.view.View[@index=\"1\"]"));
		String e=tra.get(2).getAttribute("content-desc");
		System.out.println(e);
		//if(driver.findElement(By.xpath("//*[@text=\"Recipient Address\"]")).isDisplayed()) {System.out.println("Save rescipt is turned on");}else {System.out.println("Save rescipt is turned off");}
		//String tra=driver.findElement(By.xpath("//android.view.View[@index=\"1\"]")).getAttribute("content-desc");
		//System.out.println(tra);
		if(e.contains("bxdmvujj6UG8Q2Cj2Z1VVydUADYL9LKmHerGRDcwNozhHajKDh1iSQ2es7fsCeSUYQMnHJvr3z6qy6n6HZN9MU5p2fgQeASwm")) {System.out.println("Save rescipt is turned on");test.pass("<b>Save rescipt is turned on showing recipent adrress<b>");passFailScreenshot("^&^");}else {System.out.println("Save rescipt is turned off");test.pass("<b>Save rescipt is turned off showing recipent adrress<b>");passFailScreenshot("^&5");}
		Thread.sleep(1000);
		driver.navigate().back();
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();


		Thread.sleep(1000);
		touchAction1.tap(PointOption.point(1010, 1282)).perform();
		driver.navigate().back();
		driver.navigate().back();
		Homepage.clickOnTransactionsButton();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.ImageView[@index=\"1\"]")).click();
		Thread.sleep(1000);
		List<WebElement> ta=driver.findElements(By.xpath("//android.view.View[@index=\"1\"]"));
		String e1=ta.get(2).getAttribute("content-desc");
		System.out.println(e1);
		if(e1.contains("bxdmvujj6UG8Q2Cj2Z1VVydUADYL9LKmHerGRDcwNozhHajKDh1iSQ2es7fsCeSUYQMnHJvr3z6qy6n6HZN9MU5p2fgQeASwm")) {System.out.println("Save rescipt is turned on");test.pass("<b>Save rescipt is turned on showing recipent adrress<b>");passFailScreenshot("^&^");}else {System.out.println("Save rescipt is turned off");test.pass("<b>Save rescipt is turned off showing recipent adrress<b>");passFailScreenshot("^&");}
		Thread.sleep(1000);

		driver.navigate().back();}
	@Test(priority=7)
	public void TC_194_And_TC_195() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallet Settings Screen ", "<b><br /> Test case Id:TC_194_And_TC_195 <br />Test case description: Validate the working of the Enable Fiat Currency conversion in On Condition both On and off Condition.</b>");

		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@index=\"6\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys("AUD").perform();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("AUD")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		List<WebElement> tar=driver.findElements(By.className("android.view.View"));
		System.out.println(tar.get(2).getAttribute("content-desc"));
		String at= tar.get(2).getAttribute("content-desc");	
		boolean at1=at.endsWith("AUD");
		try {Assert.assertTrue(at1);test.pass("<b>FIAT currency is turned on<b>");passFailScreenshot(".0.0.0");}catch(AssertionError e) { test.pass(" <b>FIAT currency conversion is turned off<b>");passFailScreenshot("01");}
		Thread.sleep(1000);
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		TouchAction touchAction1=new TouchAction(driver);
		Thread.sleep(1000);
		touchAction1.tap(PointOption.point(1010, 917)).perform();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		List<WebElement> tr=driver.findElements(By.className("android.view.View"));
		System.out.println(tr.get(2).getAttribute("content-desc"));
		String aqt= tr.get(2).getAttribute("content-desc");	
		boolean aqt1=aqt.endsWith("AUD");
		try {Assert.assertTrue(aqt1);test.pass("<b>FIAT currency is turned on <b>");passFailScreenshot(".0.0.0.1");}catch(AssertionError e) { test.pass(" <b>FIAT currency conversion is turned off<b>");passFailScreenshot("21");}
		Thread.sleep(1000);
	}

	@Test(priority =6,dataProvider = "login1")
	public void TC_192(WebElement va,String tb) throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallet Settings Screen ", "<b><br /> Test case Id:TC_192 <br />Test case description: Validate whether able to switch to all options in Display Balanace..</b>");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		driver.findElement(By.xpath("//android.view.View[@index=\"3\"]")).click();
		va.click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(6000);
		List<WebElement> tau=driver.findElements(By.className("android.view.View"));
		System.out.println(tau.get(2).getAttribute("content-desc"));
		String at= tau.get(2).getAttribute("content-desc");	
		String decimal_values= at.replaceAll("[^0-9\\.]", "");
		System.out.println(decimal_values);
		try { this.rtr=  removeFirstand_Last(decimal_values);
		String findMe =this.rtr;
		int searchMeLength = at.length();
		int findMeLength = findMe.length();
		boolean foundIt = false;
		for (int i = 0; 
				i <= (searchMeLength - findMeLength);
				i++) {
			if (at.regionMatches(i, findMe, 0, findMeLength)) {
				foundIt = true;
				System.out.println(at.substring(i, i + findMeLength));
				break;
			}
		}
		if (!foundIt)
			System.out.println("No match found.");
		System.out.println(foundIt);
		try{Assert.assertTrue(foundIt);test.pass(tb);passFailScreenshot("0009");}catch(AssertionError e){test.fail(tb);passFailScreenshot("2135");}}catch(Exception e) {test.pass(tb);passFailScreenshot("0-1");}    
	}

	// Java program to remove the first and
	// the last character of a string

	// Function to remove the first and
	// the last character of a string
	public static String
	removeFirstand_Last(String str)
	{

		// Removing first and last character
		// of a string using substring() method
		str = str.substring(3, str.length() - 4);

		// Return the modified string
		return str;
	}

	@DataProvider(name="login1")
	public Object[][] loginData1(){
		settings=new Wallet_Settings(driver);
		Object[][] data =new Object[3][2];
		data[0][0]=settings.Beldex_available_Balance();
		data[0][1]="<b>Selecting Beldex available Balance option<b>";
		data[1][0]=settings.Beldex_hidden_Balance();
		data[1][1]="<b>Selecting Beldex hidden Balance option<b>";
		data[2][0]=settings.Beldex_Full_Balance();
		data[2][1]="<b>Selecting Beldex Full Balance option<b>";
		return data;
	}  
	@Test(priority =5,dataProvider  = "gin" )
	public void TC_196(String data, String data1,String data2) throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Wallets functionality in the Wallet Settings Screen ", "<b><br /> Test case Id:TC_196 <br />Test case description: Validate whether able to switch to all options in the currency..</b>");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@index=\"6\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(data).perform();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId(data)).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(22000);
		List<WebElement> tar=driver.findElements(By.className("android.view.View"));
		System.out.println(tar.get(2).getAttribute("content-desc"));
		String at= tar.get(2).getAttribute("content-desc");	
		boolean at1=at.endsWith(data1);
		try {Assert.assertFalse(at1);test.pass("<br/><b>Showing as per the selected option</b><br/>"+at);}catch(AssertionError e) { test.log(Status.WARNING, at+" <b>showing 0 equivalent currency value</b><br/>");passFailScreenshot(data2);}
		System.out.println(at1);
	}
	@DataProvider(name="gin")
	public Object[][] CurrencyData(){
		Object[][] data =new Object[33][3];
		data[0][0]="AUD";
		data[0][1]="0.00 AUD";
		data[0][2]="0.0090";
		data[1][0]="BGN";
		data[1][1]="0.00 BGN";
		data[1][2]="0.0091";
		data[2][0]="BRL";
		data[2][1]="0.00 BRL";
		data[2][2]="0.00992";
		data[3][0]="CAD";
		data[3][1]="0.00 CAD";
		data[3][2]="0.0093";
		data[4][0]="CHF";
		data[4][1]="0.00 CHF";
		data[4][2]="0.0094";
		data[5][0]="CNY";
		data[5][1]="0.00 CNY";
		data[5][2]="0.0095";
		data[6][0]="CZK";
		data[6][1]="0.00 CZK";
		data[6][2]="0.0096";
		data[7][0]="EUR";
		data[7][1]="0.00 EUR";
		data[7][2]="0.0097";
		data[8][0]="DKK";
		data[8][1]="0.00 DKK";
		data[8][2]="0.0098";
		data[9][0]="GBP";
		data[9][1]="0.00 GBP";
		data[9][2]="0.0099";
		data[10][0]="HKD";
		data[10][1]="0.00 HKD";
		data[10][2]="0.0100";
		data[11][0]="HRK";
		data[11][1]="0.00 HRK";
		data[11][2]="0.0101";
		data[12][0]="HUF";
		data[12][1]="0.00 HUF";
		data[12][2]="0.0102";
		data[13][0]="IDR";
		data[13][1]="0.00 IDR";
		data[13][2]="0.0103";
		data[14][0]="ILS";
		data[14][1]="0.00 ILS";
		data[14][2]="0.0104";
		data[15][0]="INR";
		data[15][1]="0.00 INR";
		data[15][2]="0.0105";
		data[16][0]="ISK";
		data[16][1]="0.00 ISK";
		data[16][2]="0.0106";
		data[17][0]="JPY";
		data[17][1]="0.00 JPY";
		data[17][2]="0.0107";
		data[18][0]="KRW";
		data[18][1]="0.00 KRW";
		data[18][2]="0.0108";
		data[19][0]="MXN";
		data[19][1]="0.00 MXN";
		data[19][2]="0.0109";
		data[20][0]="MYR";
		data[20][1]="0.00 MYR";
		data[20][2]="0.0200";
		data[21][0]="NOK";
		data[21][1]="0.00 NOK";
		data[21][2]="0.0201";
		data[22][0]="NZD";
		data[22][1]="0.00 NZD";
		data[22][2]="0.0202";
		data[23][0]="PHP";
		data[23][1]="0.00 PHP";
		data[23][2]="0.0203";
		data[24][0]="PLN";
		data[24][1]="0.00 PLN";
		data[24][2]="0.0204";
		data[25][0]="RON";
		data[25][1]="0.00 RON";
		data[25][2]="0.0205";
		data[26][0]="RUB";
		data[26][1]="0.00 RUB";
		data[26][2]="0.0206";
		data[27][0]="SEK";
		data[27][1]="0.00 SEK";
		data[27][2]="0.0207";
		data[28][0]="SGD";
		data[28][1]="0.00 SGD";
		data[28][2]="0.0208";
		data[29][0]="THB";
		data[29][1]="0.00 THB";
		data[29][2]="0.0209";
		data[30][0]="USD";
		data[30][1]="0.00 USD";
		data[30][2]="0.0300";
		data[31][0]="ZAR";
		data[31][1]="0.00 ZAR";
		data[31][2]="0.0301";
		data[32][0]="VEF";
		data[32][1]="0.00 VEF";
		data[32][2]="0.0302";
		return data;
	}
	@Test(priority=8)
	public void TC_203() throws IOException, InterruptedException {
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		test=extent.createTest("Test Scenario:	To Check the working of the wallet Settings screen ", "<b><br /> Test case Id: TC_203<br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(2000);
		Homepage.clickOnSettingsButton();
		Thread.sleep(1000);
		settings.Wallet_settings_Click();
		Thread.sleep(1000);
		driver.lockDevice();
		Thread.sleep(2000);
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
	}
*/


}




