package officialWallet;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShowSeed_Screen {
AndroidDriver driver;

@AndroidFindBy(accessibility = "Show Seed")
private WebElement ShowSeedbutton;

@AndroidFindBy(accessibility = "Copy Seed")
private WebElement Copyseedbutton;

@AndroidFindBy(accessibility = "Save")
private WebElement Savebutton;

@AndroidFindBy(accessibility = "Ok")
private WebElement Okbutton;

@AndroidFindBy(accessibility = "Copied")
private WebElement Copied;

@AndroidFindBy(className = "android.widget.ImageView")
private WebElement backbutton;

@AndroidFindBy(accessibility = "Failed authentication. Wrong PIN")
private WebElement failedauthentication;

@AndroidFindBy(accessibility = "Yes, I'm sure!")
private WebElement YesImsure;



public ShowSeed_Screen (AndroidDriver driver) {
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
}
	
public WebElement ShowSeed() {
	return ShowSeedbutton;
	
}	
public ShowSeed_Screen ClickonShowSeed() {
	this.ShowSeed().click();
	return this;
}

public WebElement CopySeed() {
	return Copyseedbutton;
	
}	
public ShowSeed_Screen ClickOnCopyseed() {
	this.CopySeed().click();
	return this;
}

public WebElement Savebutton() {
	return Savebutton;
	
}	
public ShowSeed_Screen ClickOnSavebutton() {
	this.Savebutton().click();
	return this;
}
public WebElement Okbutton() {
	return Okbutton;
	
}	
public ShowSeed_Screen ClickOnokbutton() {
	this.Okbutton().click();
	return this;
}
public WebElement Copiedbutton() {
	 return Copied;
}

public WebElement Backbutton() {
	 return backbutton;
}
	public ShowSeed_Screen Clickonbackbutton() {
		this.Backbutton().click();
		return this;
		
	}
	 public WebElement WrongPINMessage() {
		 return failedauthentication;
	 }
	 private PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	 public void tap(int x, int y) {
		    Sequence tap = new Sequence(finger, 1);
		    tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
		    tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		    tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		    driver.perform(Arrays.asList(tap));
		}
	 public void longpress(int x, int y) {
	    	PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
	    	Sequence swipe = new Sequence(input, 0);
	    	swipe.addAction(input.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),x,y ));
	        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	        swipe.addAction(input.createPointerMove(Duration.ofSeconds(2),PointerInput.Origin.viewport(), x, y));
	        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
}
	 public WebElement Yesimsurebutton() {
		 return YesImsure;
	 }
		public ShowSeed_Screen ClickonYesimsurebutton() {
			this.Yesimsurebutton().click();
			return this;
			
		}
}
