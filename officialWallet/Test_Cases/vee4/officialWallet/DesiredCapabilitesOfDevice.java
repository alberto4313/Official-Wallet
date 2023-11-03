package vee4.officialWallet;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.applitools.eyes.appium.Eyes;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import com.applitools.eyes.appium.Eyes;
public class DesiredCapabilitesOfDevice {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	static AndroidDriver driver;
	static ExtentTest test;
	
	String concatenate=".";
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() throws Exception {
	spark = new ExtentSparkReporter(System.getProperty("user.dir")+"./Report/Official_Wallet_Report.html").viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD,ViewName.TEST,ViewName.AUTHOR,ViewName.CATEGORY,ViewName.DEVICE,ViewName.EXCEPTION,ViewName.LOG}).apply();
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Official Wallet Automation Test Report");
		spark.config().setDocumentTitle("Report");
		spark.config().getReportName();
		spark.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
        extent = new ExtentReports();
		extent.attachReporter(spark);
		
		try  {
            DesiredCapabilities dc= new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");// This value is device specific open CMD and type adb.exe devices
			dc.setCapability(MobileCapabilityType.NO_RESET, "true");
			//dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\admin\\Downloads\\Beldex-official-wallet-mainnet-24-07-23.apk");
			dc.setCapability("udid","ceaae327");
			dc.setCapability("appPackage" , "io.beldex.wallet");//appPackage can be found using APKInfo application
			dc.setCapability("appActivity" , "io.beldex.wallet.MainActivity");//appActivity can be found using APKInfo application
			dc.setCapability("unicodeKeyboard", true);
			URL d =new URL("http://localhost:4723/wd/hub");
			driver = new AndroidDriver(d,dc); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			  
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
			}
            }
	@AfterTest
	public void teardown() throws IOException {
		extent.flush();
		//Desktop.getDesktop().browse(new File("/officialWallet data 2.0.0/Report/Official_Wallet_Report.html").toURI());
		//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File("screen.jpg"));
		try  {	
			DesiredCapabilities dc1= new DesiredCapabilities();
			dc1.setCapability("unicodeKeyboard", false);
			driver = new AndroidDriver(dc1);
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
		}
		//finally {

            // Close the app.
          //  driver.quit();

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            //eyes.abortIfNotClosed();

        //}
		}
	public void passFailScreenshot(String name) throws IOException {
		String screenshotName = concatenate+AppScreenshots.getScreenshot(name);
		screenCapture("",screenshotName);
		}
public  static Object screenCapture(String logdetails,String imagepath) {
test.log(Status.INFO, logdetails,MediaEntityBuilder.createScreenCaptureFromPath(imagepath).build());	
return test;
}
}
