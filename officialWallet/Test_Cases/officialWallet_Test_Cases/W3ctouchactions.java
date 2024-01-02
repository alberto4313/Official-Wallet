package officialWallet_Test_Cases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import officialWallet.AddressBook;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.ReceiveScreen;
import officialWallet.Wallet_Settings;
import officialWallet_Test_Cases.W3cswipeactions.SwipeDirection;

public class W3ctouchactions extends DesiredCapabilitesOfDevice {
	CreateNewWallet1 password; 
	HomescreenPage Homepage;
	ReceiveScreen Receive;
	AddressBook book;
	Wallet_Settings settings;
	//private WebElement ele;
    private PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	@Test(priority=1)
	public void PIN() throws InterruptedException {
		Homepage=new 	HomescreenPage(driver);
		 settings=new Wallet_Settings(driver);
		password=new CreateNewWallet1(driver);
		password.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage.clickOnReceiveButton();
		Receive=new ReceiveScreen(driver);
		Receive.ClickshareQR();
		
		Thread.sleep(2000);
for(int i=0;i<=10;i++) {
		swipe(SwipeDirection.SWIPE_RIGHT);
}
for(int i=0;i<=10;i++) {
	swipe(SwipeDirection.SWIPE_LEFT);
}
	}
    public void swipe(SwipeDirection direction) {
    	//this.ele=driver.findElement(AppiumBy.accessibilityId("Address Book"));
    	  Sequence dragNDrop = new Sequence(finger, 1);
          int startX, startY, endX, endY;
          Dimension windowSize = driver.manage().window().getSize();
          int screenHeight =windowSize.getHeight();
    		int screenWidht =windowSize.getWidth();
    		System.out.println(screenHeight);
    		System.out.println(screenWidht);
    		int xStartPoint =50*screenWidht/100;
    		int xEndPoint =xStartPoint;
    		int yStartPoint =96*screenHeight/100;
    		int yEndPoint =7*screenHeight/100;
          switch (direction) {
         
         
              case SWIPE_RIGHT:
            	  startX = 75*screenWidht/100;
                  startY = 79*screenHeight/100;
                  endX = 24*screenWidht/100;
                  endY = 79*screenHeight/100;
                  break;
              case SWIPE_LEFT:
            	  startX = 24*screenWidht/100;
                  startY = 79*screenHeight/100;
                  endX = 75*screenWidht/100;
                  endY = 79*screenHeight/100;
                  break;
              case SWIPE_DOWN:
            	  startX = 86*screenWidht/100;
                  startY = 20*screenHeight/100;
                  endX = 15*screenWidht/100;
                  endY = 20*screenHeight/100;
                  break;
              case SWIPE_UP:
                  startX = 50*screenWidht/100;
                  startY = 20*screenHeight/100;
                  endX = startX;
                  endY = 7*screenHeight/100;
                  break;
              default:
                  throw new IllegalArgumentException("Invalid swipe direction: " + direction);
          }
          dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                  PointerInput.Origin.viewport(), startX, startY));
          dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
          dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                  PointerInput.Origin.viewport(), endX, endY));
          dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
          driver.perform(Arrays.asList(dragNDrop));
         }

}
