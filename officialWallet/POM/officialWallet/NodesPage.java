package officialWallet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NodesPage { 
	AndroidDriver driver;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Settings\"]")
	private WebElement Settings;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"publicnode5.rpcnode.stream:29095\"]")
	private WebElement  publicNode5_rpcnode_stream_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"publicnode4.rpcnode.stream:29095\"]")
    private WebElement publicnode4_rpcnode_stream_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"publicnode3.rpcnode.stream:29095\"]")
	private WebElement publicnode3_rpcnode_stream_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"publicnode2.rpcnode.stream:29095\"]")
	private WebElement publicnode2_rpcnode_stream_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"publicnode1.rpcnode.stream:29095\"]")
	private WebElement publicnode1_rpcnode_stream_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"mainnet.beldex.io:29095\"]")
	private WebElement mainnet_beldex_io_29095;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"explorer.beldex.io:19091\"]")
	private WebElement explorer_beldex_io_19091;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Ok\"]")
	private WebElement Ok;
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"2\"]")
	private WebElement ResetSettings;
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=\"3\"]")
	private WebElement AddNode_plus;
	@AndroidFindBy(accessibility = "Cancel")
	private WebElement Cancel;
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"1\"]")
	private WebElement Node_Address;
	@AndroidFindBy(accessibility = "Test")
	private WebElement Test;
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"2\"]")
	private WebElement NodePort;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Add\"]")
	private WebElement AddNode;
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"3\"]")
	private WebElement Node_name;
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"4\"]")
	private WebElement User_name;
	@AndroidFindBy(xpath="//android.widget.EditText[@index=\"5\"]")
	private WebElement Password;
	
	public NodesPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void ExplorerNode() {
		explorer_beldex_io_19091.click();
	}
	public void MainnetNode() {
		mainnet_beldex_io_29095.click();
	}
	public void PublicNode1() {
		publicnode1_rpcnode_stream_29095.click();
	}
	public void PublicNode2() {
		publicnode2_rpcnode_stream_29095.click();
	}
	public void PublicNode3() {
		publicnode3_rpcnode_stream_29095.click();
	}
	public void PublicNode4() {
		publicnode4_rpcnode_stream_29095.click();
	}
	public void PublicNode5() {
		publicNode5_rpcnode_stream_29095.click();
	}
	public void SettingsOption() {
		Settings.click();
	}
	public void NodeChangeConfirmation() {
		Ok.click();
	}
	public void ResetNodeToDefault() {
		ResetSettings.click();
	}
	public WebElement Cancel_button() {
		return Cancel;
	}
	public NodesPage Cancel_button_click() {
		 this.Cancel_button().click();
		 return this;
	}
	public WebElement Add_Node_Plus_button() {
		return AddNode_plus;
	}
	public NodesPage Add_Node_Plus_button_click() {
		 this.Add_Node_Plus_button().click();
		 return this;
	}
	public WebElement Nodeaddress_button() {
		return Node_Address;
	}
	public NodesPage Nodeaddress_button_click() {
		 this.Nodeaddress_button().click();
		 return this;
	}
	
	public WebElement Test_button() {
		return Test;
	}
	public NodesPage Test_button_click() {
		 this.Test_button().click();
		 return this;
	}
	public WebElement Node_Port() {
		return NodePort;
	}
	public NodesPage Node_Port_click() {
		 this.Node_Port().click();
		 return this;
	}
	public WebElement Add_node() {
		return AddNode;
	}
	public NodesPage Add_Node_click() {
		 this.Add_node().click();
		 return this;
	}
	public WebElement Nodename() {
		return Node_name;
	}
	public NodesPage Nodename_click() {
		 this.Nodename().click();
		 return this;
	}
	public WebElement Username() {
		return User_name;
	}
	public NodesPage Username_click() {
		 this.Username().click();
		 return this;
	}
	public WebElement Password() {
		return Password;
	}
	public NodesPage Password_click() {
		 this.Password().click();
		 return this;
	}
	
	public NodesPage Scroll__Node(int a) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("miuix.stub:id/alertTitle"))));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@content-desc='Nodes']"))));
		Dimension windowSize = driver.manage().window().getSize();
		int screenHeight =windowSize.getHeight();
		int screenWidht =windowSize.getWidth();
		System.out.println(screenHeight);
		System.out.println(screenWidht);
		int xStartPoint =78*screenWidht/100;
		int xEndPoint =10*screenWidht/100;
		int yStartPoint =a*screenHeight/100;
		int yEndPoint =yStartPoint;
		PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
		@SuppressWarnings("rawtypes")
		PointOption endPoint =new PointOption().withCoordinates(xEndPoint, yEndPoint);
		//for(int i=0;i<=10;i++) {
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
		
	
		return this;
	}
	}
