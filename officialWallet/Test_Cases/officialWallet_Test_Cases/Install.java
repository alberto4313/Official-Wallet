package officialWallet_Test_Cases;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Install   extends Uninstall{

	ExtentTest test;
	ExtentReports extent;
	ExtentSparkReporter spark;
	AndroidDriver driver;
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Test()
	public void unistalltheapp() throws InterruptedException, IOException {
		spark = new ExtentSparkReporter("Spark.html");
		String Alberto = "Beldex Wallet";
		extent = new ExtentReports();
		extent.attachReporter(spark);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");// This value is device specific open CMD and type adb.exe devices
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		dc.setCapability("udid","ceaae327");
		dc.setCapability("appPackage" , "com.android.vending");//appPackage can be found using APKInfo application
		dc.setCapability("appActivity" , "com.android.vending.AssetBrowserActivity");//appActivity can be found using APKInfo application
		//dc.setCapability("unicodeKeyboard", true);
		URL d =new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(d,dc); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		test=extent.createTest("TC_3", "Validate Whether able to install the App");
		test.assignAuthor("Alberto");
		test.assignCategory("Regression Testing");
		test.assignDevice("Redmi Note 9 Pro");
		Thread.sleep(2000);
		test.log(Status.PASS, "Open Settings and scrolldown to Apps");
		//String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()";
		//WebElement sen=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
		//Thread.sleep(5000);//.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
		//"Canada\")";

		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Apps\"]"))));
		test.log(Status.PASS, "Click on Apps");
		driver.findElement(By.xpath("//*[@text=\"Search Apps & Games\"]")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);            
		action.sendKeys("beldex official wallet").perform(); 
		Thread.sleep(2000);
		test.log(Status.PASS, "Click on Manage Apps");
		TouchAction touchAction = new TouchAction(driver);       
		touchAction.tap(PointOption.point(369, 291)).perform(); 
		Thread.sleep(2000);
		test.log(Status.PASS, "Click on Search Bar to Searh for the application");
		driver.findElement(By.xpath("//*[@text=\"Beldex Official Wallet\"]")).click();
		Thread.sleep(1000);
		try{List<WebElement> chkBx = driver.findElements(By.xpath("//*[@text=\"Beldex Official Wallet\"]"));
		Thread.sleep(1000);
		String a=chkBx.get(0).getAttribute("text");
		Thread.sleep(1000);
		System.out.println("Searched Application"+" " + a);
		Thread.sleep(1000);
		if((a.trim().equals("Beldex Official Wallet"))) {
			Uninstall Alberto1=new Uninstall();
			Alberto1.Me();
			
		} }finally{}}}

