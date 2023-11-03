package vee4.officialWallet;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Uninstall   {

	ExtentTest test;
	ExtentReports extent;
	ExtentSparkReporter spark;
	AndroidDriver driver;
	@SuppressWarnings("deprecation")
	@Test()
	public void unistalltheapp() throws InterruptedException, IOException {
		spark = new ExtentSparkReporter("Spark.html");
        extent = new ExtentReports();
		extent.attachReporter(spark);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");// This value is device specific open CMD and type adb.exe devices
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		dc.setCapability("udid","ceaae327");
		dc.setCapability("appPackage" , "com.android.settings");//appPackage can be found using APKInfo application
		dc.setCapability("appActivity" , "com.android.settings.MainSettings");//appActivity can be found using APKInfo application
		//dc.setCapability("unicodeKeyboard", true);
		URL d =new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(d,dc); 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		test=extent.createTest("TC_3", "Validate Whether able to uninstall the App");
		test.assignAuthor("Alberto");
		test.assignCategory("Regression Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(5000);
		test.log(Status.PASS, "Open Settings and scrolldown to Apps");
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		Thread.sleep(5000);//.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
		//"Canada\")";
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Apps\"]"))));
		test.log(Status.PASS, "Click on Apps");
		driver.findElement(By.xpath("//*[@text=\"Apps\"]")).click();
		Thread.sleep(4000);
		test.log(Status.PASS, "Click on Manage Apps");
		driver.findElement(By.xpath("//*[@text=\"Manage apps\"]")).click();
		Thread.sleep(4000);
		test.log(Status.PASS, "Click on Search Bar to Searh for the application");
		driver.findElement(By.id("android:id/inputArea")).click();
		Thread.sleep(4000);
		test.log(Status.PASS, "Entered application name");
		Actions action = new Actions(driver);            
		action.sendKeys("Beldex Wallet").perform(); 
		//driver.findElement(By.id("android:id/inputArea")).sendKeys("bel");
		Thread.sleep(4000);
		try{List<WebElement> chkBx = driver.findElements(By.xpath("//*[@text=\"Beldex Wallet\"]"));
		Thread.sleep(4000);
		String a=chkBx.get(0).getAttribute("text");
		Thread.sleep(4000);
		System.out.println("Searched Application"+" " + a);
		Thread.sleep(4000);
		if((a.trim().equals("Beldex Wallet"))) {
			String Alberto=Takeit("Alberto");
			test.log(Status.PASS, "Searched application is available", MediaEntityBuilder.createScreenCaptureFromPath(Alberto).build());
			System.out.println("Searched application  is present in device");
			Thread.sleep(4000);
			test.log(Status.PASS, "Click on application");
			driver.findElement(By.xpath("//*[@text=\"Beldex Wallet\"]")).click();
			Thread.sleep(4000);
			test.log(Status.PASS, "Click on uninstall to uninstall the application");
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Uninstall\"]")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("android:id/button1")).click();
			test.log(Status.PASS, "Application uninstalled successfully");
			Thread.sleep(3000);
			WebElement vasd=driver.findElement(By.id("com.miui.securitycenter:id/am_search_prompt"));
			Thread.sleep(2000);
			String va=vasd.getAttribute("text");
			Assert.assertEquals(va, "Couldn't find results? Try showing results from all apps.", "Application is not uninstalled");
			extent.flush();
			Thread.sleep(4000);
			Desktop.getDesktop().browse(new File("Spark.html").toURI());
		}}catch(Exception e) {
			String Alberto=Takeit("Alberto");
			test.log(Status.FAIL, "beldex official wallet is already  uninstalled", MediaEntityBuilder.createScreenCaptureFromPath(Alberto).build());
			System.out.println("beldex official wallet is already  uninstalled");
			Thread.sleep(4000);
			extent.flush();
			Thread.sleep(4000);
			Desktop.getDesktop().browse(new File("Spark.html").toURI());}}
	public  String Takeit(String fileName) throws IOException {
        TakesScreenshot takesScreenshot =(TakesScreenshot)driver;
		File sourceFile= takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destiFile = new File("./Screenshots/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destiFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot taken succesfully");
		return destiFile.getAbsolutePath();
	}
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public  void Me() throws InterruptedException, IOException {
		spark = new ExtentSparkReporter("Spark.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");// This value is device specific open CMD and type adb.exe devices
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		dc.setCapability("udid","ceaae327");
		dc.setCapability("appPackage" , "com.android.settings");//appPackage can be found using APKInfo application
		dc.setCapability("appActivity" , "com.android.settings.MainSettings");//appActivity can be found using APKInfo application
		//dc.setCapability("unicodeKeyboard", true);
		URL d =new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(d,dc); 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		test=extent.createTest("TC_3", "Validate Whether able to uninstall the App");
		test.assignAuthor("Alberto");
		test.assignCategory("Regression Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(5000);
		test.log(Status.PASS, "Open Settings and scrolldown to Apps");
		String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()";
		WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		Thread.sleep(5000);//.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
		//"Canada\")";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Apps\"]"))));
		test.log(Status.PASS, "Click on Apps");
		driver.findElement(By.xpath("//*[@text=\"Apps\"]")).click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Click on Manage Apps");
		driver.findElement(By.xpath("//*[@text=\"Manage apps\"]")).click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Click on Search Bar to Searh for the application");
		driver.findElement(By.id("android:id/inputArea")).click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Entered application name");
		Actions action = new Actions(driver);            
		action.sendKeys("Beldex Wallet").perform(); 
		Thread.sleep(2000);
		List<WebElement> chkBx = driver.findElements(By.xpath("//*[@text=\"Beldex Wallet\"]"));
		Thread.sleep(2000);
		String a=chkBx.get(0).getAttribute("text");
		Thread.sleep(2000);
		System.out.println("Searched Application"+" " + a);
		Thread.sleep(2000);
		try{if((a.trim().equals("Beldex Wallet"))) {
			String Alberto=Takeit("Alberto");
			test.log(Status.PASS, "Click on application");
			driver.findElement(By.xpath("//*[@text=\"Beldex Wallet\"]")).click();
			Thread.sleep(4000);
			test.log(Status.PASS, "Click on uninstall to uninstall the application");
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Uninstall\"]")).isDisplayed();
			test.log(Status.PASS, "Searched application is available", MediaEntityBuilder.createScreenCaptureFromPath(Alberto).build());
			System.out.println("Application is already downloaded from playstore");
			Thread.sleep(3000);
			extent.flush();
			Thread.sleep(3000);
			Desktop.getDesktop().browse(new File("Spark.html").toURI());
		}}catch(Exception e){
			Thread.sleep(4000);
			System.out.println("Opening Google Play Store ");
			driver.activateApp("com.android.vending");
			Thread.sleep(4000);
			test.log(Status.PASS, "Clicking on search bar to search Official wallet");
			driver.findElement(By.xpath("//*[@text=\"Search Apps & Games\"]")).click();
			Thread.sleep(2000);
			Actions action3 = new Actions(driver);            
			action3.sendKeys("beldex official wallet").perform(); 
			Thread.sleep(2000);
			test.log(Status.PASS, "Entering Beldex Official wallet on search bar");
			TouchAction touchAction1 = new TouchAction(driver);       
			touchAction1.tap(PointOption.point(369, 291)).perform(); 
			Thread.sleep(2000);
			test.log(Status.PASS, "Clicking on found officail wallet application and clicking on install");
			driver.findElement(By.xpath("//*[@text=\"Beldex Official Wallet\"]")).click();
			Thread.sleep(2000);
			System.out.println("Downloading application from playstore");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@index=\"2\"]")).click();
			Thread.sleep(2000);
			String Alberto=Takeit("Alberto");
			test.log(Status.PASS, "Installing ", MediaEntityBuilder.createScreenCaptureFromPath(Alberto).build());
			Thread.sleep(18000);
			driver.findElement(By.xpath("//*[@text=\"Open\"]")).click();
			Thread.sleep(2000);
			test.log(Status.PASS, "Application is succefully downloaded");
			extent.flush();
			Thread.sleep(2000);
			WebElement Beldex=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Create New Wallet\"]"));
			Thread.sleep(2000);
			String a13=Beldex.getAttribute("content-desc");
			System.out.println(a13);
			System.out.println("now cll");
			
			Thread.sleep(6000);
			Assert.assertEquals(a13, "Create New Wallet", "Beldex Application is not download");
			
			Thread.sleep(2000);
			Desktop.getDesktop().browse(new File("Spark.html").toURI());
			Thread.sleep(2000);
			} 
		    }
	        }

