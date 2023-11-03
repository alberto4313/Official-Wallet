package vee4.officialWallet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Seed {

	AndroidDriver driver;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Copy seed\"]")
	private WebElement Copy_seed; 
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Save\"]")
	private WebElement Save;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Continue\"]")
	private WebElement Continue;

	@AndroidFindBy(id="android:id/button2")
	private WebElement Cancel;
	
	public Seed(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	public WebElement CopySeed() {
		return Copy_seed;
	}
	public Seed Copy_seed_button() {
		this.CopySeed().click();
		return this;
	}
	public WebElement Save() {
		return Save;
	}
	public Seed Save_button() {
		this.Save().click();
		return this;
	}
	public WebElement Continue() {
		return Continue;
	}
	public Seed Continue_button() {
		this.Continue().click();
		return this;
	}
	public WebElement Cancel() {
		return Cancel;
	}
	public Seed Cancel_button() {
		this.Cancel().click();
		return this;
	}
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public Seed Scroll() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("miuix.stub:id/alertTitle"))));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text='Share seed']"))));
		Dimension windowSize = driver.manage().window().getSize();
		int screenHeight =windowSize.getHeight();
		int screenWidht =windowSize.getWidth();
		System.out.println(screenHeight);
		System.out.println(screenWidht);
		int xStartPoint =50*screenWidht/100;
		int xEndPoint =10*screenWidht/100;
		int yStartPoint =88*screenHeight/100;
		int yEndPoint =yStartPoint;
		PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
		@SuppressWarnings("rawtypes")
		PointOption endPoint =new PointOption().withCoordinates(xEndPoint, yEndPoint);
		for(int i=0;i<=10;i++) {
		try{TouchAction touchaction = new TouchAction(driver);
		touchaction
		.press(startPoint)
		.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
		.moveTo(endPoint).release()
		.perform();
		touchaction
		.press(endPoint)
		.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
		.moveTo(startPoint).release()
		.perform();}catch(Exception e) {System.out.println("Swipe OPtins are ended");}
		
	}
		return this;
	}}
