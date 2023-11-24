package officialWallet_Test_Cases;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import officialWallet.AccountsScreen;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.ShowKeys;
import officialWallet.ShowSeed_Screen;
import officialWallet.Wallet_Settings;


public class ShowSeed_functionality extends DesiredCapabilitesOfDevice{
	CreateNewWallet1 password; 
	HomescreenPage Homepage;
	Wallet_Settings settings;
	AccountsScreen account;
	ShowSeed_Screen seed;
	@Test(priority=1)
	public void TC_277() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_277 <br />Test case description: Validate Whether able to navigate to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
		 Homepage.clickOnSettingsButton();
			seed.ClickonShowSeed();
			test.log(Status.PASS,MarkupHelper.createLabel("1.click the show seed option",ExtentColor.GREEN));
			 password.Enter_1()
				.Enter_5()
				.Enter_9()
				.Enter_3();
			 seed.ClickonYesimsurebutton();
			 seed.Clickonbackbutton();
			 test.log(Status.PASS,MarkupHelper.createLabel("2.click the back button",ExtentColor.GREEN));
			 try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());test.log(Status.INFO,MarkupHelper.createLabel("Able to navigate to the previous screen",ExtentColor.BLUE));}catch(Exception|AssertionError e) {test.fail("Not able to navigate to the previous screen");passFailScreenshot("0.0.0.0.2");}
			 
	}
	@Test(priority=2)
	public void TC_278() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_278 <br />Test case description: Validate the Pin field with Valid pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 test.log(Status.PASS,MarkupHelper.createLabel("1.click the show seed option",ExtentColor.GREEN));
			password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid pin",ExtentColor.GREEN));
			try {Assert.assertTrue(seed.Yesimsurebutton().isDisplayed(),"Navigated to next screen");test.log(Status.INFO,MarkupHelper.createLabel("Navigated to the next screen",ExtentColor.BLUE));}catch(Exception|AssertionError e) {test.fail("Not able to navigate to next screen"+e);passFailScreenshot("0.0.0.0.3");}
			seed.ClickonYesimsurebutton();
			driver.navigate().back();
	}
	@Test(priority=3)
	public void TC_279() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_279 <br />Test case description: Validate the Pin field with InValid pin</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 test.log(Status.PASS,MarkupHelper.createLabel("1.click the show key option",ExtentColor.GREEN));
			password.Enter_1()
			.Enter_5()
			.Enter_6()
			.Enter_3();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a Invalid pin",ExtentColor.GREEN));
			try {Assert.assertTrue(seed.WrongPINMessage().isDisplayed(),"Showing error message entering wrong PIN");String tr=seed.WrongPINMessage().getAttribute("content-desc");test.log(Status.PASS,MarkupHelper.createLabel("3.validate the error message",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel(tr,ExtentColor.BLUE));}catch(Exception|AssertionError e) {test.fail("Not Showing error message upon entering wrong PIN"+e);passFailScreenshot("0.0.0.0.4");}
			
			
			
			driver.navigate().back();
}
	@Test(priority=4)
	public void TC_280() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_280 <br />Test case description: Validate the Pin field with InValid pin for multiple times</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 test.log(Status.PASS,MarkupHelper.createLabel("1.click the show key option",ExtentColor.GREEN));
			password.Enter_1()
			.Enter_5()
			.Enter_6()
			.Enter_3();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a Invalid pin",ExtentColor.GREEN));
			try {Assert.assertTrue(seed.WrongPINMessage().isDisplayed(),"Showing error message entering wrong PIN");String tr=seed.WrongPINMessage().getAttribute("content-desc");test.log(Status.PASS,MarkupHelper.createLabel("3.validate the error message",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Showing error message\"Wrong pin\"",ExtentColor.BLUE));}catch(Exception|AssertionError e) {test.fail("Not Showing error message upon entering wrong PIN"+e);passFailScreenshot("0.0.0.0.5");}
			
				password.Enter_1()
				.Enter_5()
				.Enter_6()
				.Enter_3();
			
			test.log(Status.PASS,MarkupHelper.createLabel("4.Repeat step 2 for multiple times",ExtentColor.GREEN));
			try {Assert.assertFalse(seed.Yesimsurebutton().isDisplayed(),"Not navigating to next screen");test.fail("Navigated to the next screen");}catch(Exception|AssertionError e) {test.log(Status.INFO,MarkupHelper.createLabel("Not navigated to the next screen",ExtentColor.BLUE));passFailScreenshot("0.0.0.0.6");}

			driver.navigate().back();
	
}
	@Test(priority=5)
	public void TC_281() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_281 <br />Test case description: Validate the Contents and user guidelines in the screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
			
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("IMPORTANT")).isDisplayed());
			Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Never Give your Beldex Wallet Seed to Anyone!")).isDisplayed());
			Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Never input your Beldex wallet Seed into any software or website other than the official Beldex wallets downloaded directly from the Play Store,the beldex website, or the beldex GitHub.")).isDisplayed());
			Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Are you Sure you want to access your Seed?")).isDisplayed());
			String 	Important=driver.findElement(AppiumBy.accessibilityId("IMPORTANT")).getAttribute("content-desc");
			String 	NeverGive=driver.findElement(AppiumBy.accessibilityId("Never Give your Beldex Wallet Seed to Anyone!")).getAttribute("content-desc");
			String 	Neverinput=driver.findElement(AppiumBy.accessibilityId("Never input your Beldex wallet Seed into any software or website other than the official Beldex wallets downloaded directly from the Play Store,the beldex website, or the beldex GitHub.")).getAttribute("content-desc");
			String 	AreyouSure=driver.findElement(AppiumBy.accessibilityId("Are you Sure you want to access your Seed?")).getAttribute("content-desc");
			test.log(Status.PASS,MarkupHelper.createLabel("1.check the contents in the screen",ExtentColor.GREEN));
			test.log(Status.INFO,MarkupHelper.createLabel("<br />Showing content<br /> "+Important+"<br />"+NeverGive+"<br />"+Neverinput+"<br />"+AreyouSure,ExtentColor.BLUE));
				}catch(Exception|AssertionError e) {test.fail("Not showing proper contents"+e);passFailScreenshot("0.0.0.0.7");}
	Thread.sleep(8000);
	driver.navigate().back();}
	
	
	@Test(priority=6)
	public void TC_282() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_282 <br />Test case description: Validate Whether yes,I'msure function is enable</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
		 Thread.sleep(2000);
			try {Assert.assertTrue(seed.Yesimsurebutton().isDisplayed(), "showing");Assert.assertTrue(seed.Yesimsurebutton().isEnabled());}catch(Exception|AssertionError e) {test.fail(e);passFailScreenshot("0.0.0.0.8");}		
			seed.ClickonYesimsurebutton();
			test.log(Status.PASS,MarkupHelper.createLabel("1.click the yes,i'm sure! function",ExtentColor.GREEN));
			try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Recovery Seed")).isDisplayed(), "showing");test.log(Status.INFO,MarkupHelper.createLabel("Responding for the touch action",ExtentColor.BLUE));}catch(Exception|AssertionError e) {test.fail(e);passFailScreenshot("0.0.0.0.9");}
			driver.navigate().back();}
	@Test(priority=7)
	public void TC_283() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_283 <br />Test case description: Validate the working of the copy option</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
		 seed.ClickonYesimsurebutton();
		Thread.sleep(1000);
		 seed.ClickOnCopyseed();
		 try{Assert.assertTrue(seed.Copiedbutton().isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.click the copy option",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Allowing to copy",ExtentColor.BLUE));}catch(Exception|AssertionError e){test.fail("Not able to copy or copied toast message is not displayed");passFailScreenshot("00.00.09");}
driver.navigate().back();
	}
	@Test(priority=8)
	public void TC_284() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_284 <br />Test case description: Validate the wroking of the save option</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);
		 seed.ClickonShowSeed();
		 password.Enter_1()
			.Enter_5()
			.Enter_9()
			.Enter_3();
		 seed.ClickonYesimsurebutton();
		 seed.ClickOnSavebutton();
		 test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save",ExtentColor.GREEN));
		 Thread.sleep(2000);
		 try {Assert.assertTrue(driver.findElement(AppiumBy.id("miuix.stub:id/parentPanel")).isDisplayed()); test.log(Status.PASS,MarkupHelper.createLabel("2.Check the option showing",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("showing all possible option in device",ExtentColor.BLUE));passFailScreenshot("00.00.010");}catch(Exception | AssertionError e) {test.fail("Not showing all possible option in device");passFailScreenshot("00.00.011");}
		driver.findElement(By.xpath("//*[@text=\"Cancel\"]")).click(); //*[@text=\"Beldex Official Wallet\"]"
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=9)
	public void TC_285() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.    ", "<b><br /> Test case Id:TC_285 <br />Test case description: Validate the value of the seed</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		 account=new AccountsScreen(driver);
		 password=new CreateNewWallet1(driver);
		 seed=new ShowSeed_Screen(driver);

			seed.ClickonShowSeed();
			
			password.Enter_1()
				.Enter_5()
				.Enter_9()
			.Enter_3();
			 seed.ClickonYesimsurebutton();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Recovery Seed")));
String trans=driver.findElement(By.xpath("//android.view.View[@index=\"2\"]")).getAttribute("content-desc");
String[] seedvalue=trans.split("\\s");
System.out.println(Arrays.toString(seedvalue));
test.log(Status.PASS,MarkupHelper.createLabel("1.Check the value of the seed",ExtentColor.GREEN));
int a=trans.split("\\s").length;
try {Assert.assertEquals(a, 25);test.log(Status.INFO,MarkupHelper.createLabel("contains 25 seed value",ExtentColor.BLUE));test.log(Status.INFO,MarkupHelper.createLabel(Arrays.toString(seedvalue),ExtentColor.WHITE));}catch(Exception|AssertionError e) {test.fail("Not contains 25 seed value");passFailScreenshot("0.0.0.0.1");}
      System.out.println(a);
	driver.navigate().back();}
      @Test(priority=10)
		public void TC_286() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.   ", "<b><br /> Test case Id:TC_286 <br />Test case description: Validate whether able to take screenshot of the screen  </b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			 account=new AccountsScreen(driver);
			 password=new CreateNewWallet1(driver);
			 seed=new ShowSeed_Screen(driver);
			 seed.ClickonShowSeed();
				
				password.Enter_1()
					.Enter_5()
					.Enter_9()
				.Enter_3();
				 seed.ClickonYesimsurebutton();
			 Thread.sleep(2000);
		passFailScreenshot("00.00.017");
		 test.log(Status.PASS,MarkupHelper.createLabel("1.Take a screen shot",ExtentColor.GREEN));
		 test.log(Status.INFO,MarkupHelper.createLabel("Able to take screenshot",ExtentColor.BLUE));
		driver.navigate().back(); 
      }
			
      @Test(priority=11)
		public void TC_287() throws IOException, InterruptedException {
			test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.   ", "<b><br /> Test case Id:TC_287 <br />Test case description: Verify the screen action from the device screen lock and after the screen unlock.  </b>");
			test.assignAuthor("Alberto");
			test.assignCategory("Smoke Testing");
			test.assignDevice("Redmi Note 9 Pro");
			Homepage=new HomescreenPage(driver);
			settings=new Wallet_Settings(driver);
			 account=new AccountsScreen(driver);
			 password=new CreateNewWallet1(driver);
			 seed=new ShowSeed_Screen(driver);  
			 seed.ClickonShowSeed();
				
				password.Enter_1()
					.Enter_5()
					.Enter_9()
				.Enter_3();
				 seed.ClickonYesimsurebutton();
			 Thread.sleep(2000);
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
				try{Actions act=new Actions(driver);
				act.sendKeys(Keys.NUMPAD9)
				.sendKeys(Keys.NUMPAD8)
				.sendKeys(Keys.NUMPAD7)
				.sendKeys(Keys.NUMPAD6).build().perform();}catch(Exception e) {}
				Thread.sleep(3000);
				try {Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Enter Your PIN")).isDisplayed(), "Asking the pin");passFailScreenshot("126");}catch(AssertionError e) {test.fail(e);passFailScreenshot("125");}
				password
				.Enter_1()
				.Enter_5()
				.Enter_9()
				.Enter_3();
				
      seed.ClickOnokbutton();}
      @Test(priority=11)
    		public void TC_288() throws IOException, InterruptedException {
    			test=extent.createTest("Test Scenario:	To Check the working of the Show Seed functionality in the Settings Screen.   ", "<b><br /> Test case Id:TC_288 <br />Test case description: Validate the working of the screen activity without internet connection  </b>");
    			test.assignAuthor("Alberto");
    			test.assignCategory("Smoke Testing");
    			test.assignDevice("Redmi Note 9 Pro");
    			Homepage=new HomescreenPage(driver);
    			settings=new Wallet_Settings(driver);
    			 account=new AccountsScreen(driver);
    			 password=new CreateNewWallet1(driver);
    			 seed=new ShowSeed_Screen(driver);  
    			
    			 driver.toggleWifi();
					driver.findElement(By.id("android:id/button1")).click();
					test.log(Status.PASS,MarkupHelper.createLabel("1.Turn Off the device internet connection",ExtentColor.GREEN));
					Thread.sleep(4000);
					 seed.ClickonShowSeed();
    				password.Enter_1()
    					.Enter_5()
    					.Enter_9()
    				.Enter_3();
    				 seed.ClickonYesimsurebutton();
    			 Thread.sleep(2000);
    			 seed.ClickOnCopyseed();
    			 try{Assert.assertTrue(seed.Copiedbutton().isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.click the copy option",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("Allowing to copy",ExtentColor.BLUE));}catch(Exception|AssertionError e){test.fail("Not able to copy or copied toast message is not displayed");passFailScreenshot("00.00.099999");}
    			 Thread.sleep(1000);
    			 seed.ClickOnSavebutton();
    			 test.log(Status.PASS,MarkupHelper.createLabel("1.Click the save",ExtentColor.GREEN));
    			 try {Assert.assertTrue(driver.findElement(AppiumBy.id("miuix.stub:id/parentPanel")).isDisplayed()); test.log(Status.PASS,MarkupHelper.createLabel("2.Check the option showing",ExtentColor.GREEN));test.log(Status.INFO,MarkupHelper.createLabel("showing all possible option in device",ExtentColor.BLUE));passFailScreenshot("00.00.0108979879798");}catch(Exception | AssertionError e) {test.fail("Not showing all possible option in device");passFailScreenshot("00.00.01rtrteg1");}
    			driver.findElement(By.xpath("//*[@text=\"Cancel\"]")).click();
    			Thread.sleep(2000);
    			String trans=driver.findElement(By.xpath("//android.view.View[@index=\"2\"]")).getAttribute("content-desc");
    			String[] seedvalue=trans.split("\\s");
    			System.out.println(Arrays.toString(seedvalue));
    			test.log(Status.PASS,MarkupHelper.createLabel("1.Check the value of the seed",ExtentColor.GREEN));
    			int a=trans.split("\\s").length;
    			try {Assert.assertEquals(a, 25);test.log(Status.INFO,MarkupHelper.createLabel("contains 25 seed value",ExtentColor.BLUE));test.log(Status.INFO,MarkupHelper.createLabel(Arrays.toString(seedvalue),ExtentColor.WHITE));}catch(Exception|AssertionError e) {test.fail("Not contains 25 seed value");passFailScreenshot("0.0.0.0.156465");}
    			      System.out.println(a);
      
    			      test.log(Status.PASS,MarkupHelper.createLabel("2.Check the working of the screen function",ExtentColor.GREEN));
      }
      
			
			{//----------------------------------------------------------------------------------------------------------------				
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


}}




