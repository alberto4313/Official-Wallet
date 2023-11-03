package officialWallet_Test_Cases;

import java.io.IOException; 
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumBy;import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import officialWallet.CreateNewWallet1;
import officialWallet.HomescreenPage;
import officialWallet.NodesPage;
import officialWallet.Wallet_Settings;
import officialWallet.Wallets;

public class Node_screen_functionality extends DesiredCapabilitesOfDevice{

	Wallets wallet;
	CreateNewWallet1 password;
	HomescreenPage Homepage;
	Wallet_Settings settings;
	NodesPage node;
	String rt;
	final String dat="true";
	String comp;
	int befor;
	int y;
	@Test(priority = 1)
	public void TC_172() throws IOException, InterruptedException {
		wallet=new Wallets(driver);
		password=new CreateNewWallet1(driver);
		Homepage=new HomescreenPage(driver);
		settings=new Wallet_Settings(driver);
		node=new NodesPage(driver);
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Homepage.clickOnSettingsButton();
		settings.Wallet_settings_Click();
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id: TC_172<br />Test case description: Validate Whether able to navigate back to the previous screen</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		List<WebElement> awd=driver.findElements(By.className("android.view.View"));//clicking on node option using list interface
		awd.get(3).click();
		driver.navigate().back();
		try{Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Wallet Settings")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("1.Click the back button",ExtentColor.GREEN));
		}catch(Exception e) {test.fail("Not able to navigate back");passFailScreenshot("10");}}
	@Test(priority  = 2)
	public void TC_173() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_173 <br />Test case description: Validate the working of the node  without internet connection</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		List<WebElement> awd1=driver.findElements(By.className("android.view.View"));//clicking on node option using list interface
		awd1.get(3).click();		
		driver.toggleWifi();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		test.log(Status.PASS,MarkupHelper.createLabel("1.Turn Off the device internet connection",ExtentColor.GREEN));
		for(int i=0;i<=1;i++) {node.ResetNodeToDefault();
		password.OkbuttoninUEWclick();
		}Thread.sleep(2000);
		passFailScreenshot("11");
		test.log(Status.PASS,MarkupHelper.createLabel("2.Check the screen",ExtentColor.GREEN));
	}
	@Test(priority = 3)
	public void TC_174() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_174 <br />Test case description: Validate the working of the reset function.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		turn_Off off=new turn_Off();
		off.Turn_On_Data_Wifi();
		driver.navigate().back();
		Thread.sleep(5000);
		password
		.Enter_1()
		.Enter_5()
		.Enter_9()
		.Enter_3();
		Thread.sleep(2000);
		List<WebElement> das1 = driver.findElements(By.className("android.view.View"));
		for(int i=3;i<=14;i++) { 
			if(dat.equals(das1.get(i).getAttribute("scrollable")) ) {
				String d40=das1.get(i).getAttribute("scrollable");
				// Print element of list
				Thread.sleep(1000);   
				System.out.println(d40);      
				i--;
				String d41=das1.get(i).getAttribute("content-desc");
				Thread.sleep(1000);
				System.out.println(d41);      
				i++;
				i++;
			}else {  int x=i;
			this.befor=x; i--; String d42=das1.get(i).getAttribute("content-desc");this.comp=d42;
			System.out.println("This is inde of node "+befor);
			System.out.println("This is name of Node "+comp);
			System.out.println(d42+" "+"This node is selected");test.log(Status.INFO,MarkupHelper.createLabel("Before resetting following node is selected ",ExtentColor.GREEN));	passFailScreenshot("100");break;}}
		for(int i1=0;i1<=2;i1++) { node.ResetNodeToDefault();
		test.log(Status.PASS,MarkupHelper.createLabel("1.click the reset function",ExtentColor.GREEN));
		password.OkbuttoninUEWclick();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Click Ok",ExtentColor.GREEN));
		}
		List<WebElement> das = driver.findElements(By.className("android.view.View"));
		for(int i2=3;i2<=14;i2++) { 
			if(dat.equals(das.get(i2).getAttribute("scrollable")) ) {
				String d45=das.get(i2).getAttribute("scrollable");
				Thread.sleep(1000);   
				System.out.println(d45);      
				i2--; 
				String d46=das.get(i2).getAttribute("content-desc");
				Thread.sleep(1000);
				System.out.println(d46);      
				i2++;
				i2++;
			}else {  i2--; String d47=das.get(i2).getAttribute("content-desc"); 	
			System.out.println(d47+" "+"This node is selected");test.log(Status.INFO,MarkupHelper.createLabel("After resetting "+d47+" this node is selected ",ExtentColor.GREEN));	passFailScreenshot("101");;break;}}
		List<WebElement> das6 = driver.findElements(By.className("android.view.View"));
		String tar=das6.get(befor).getAttribute("scrollable");
		try {Assert.assertEquals(tar, "true");}catch(Exception e) {test.fail("Not able to reset node");}}

	@Test(priority = 4)
	public void TC_TC_177() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_177 <br />Test case description: Validate Whether able to change the current node.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		List<WebElement> das = driver.findElements(By.className("android.view.View"));
		int i1=3;
		Thread.sleep(2000);
		if(dat.equals(das.get(i1).getAttribute("scrollable")) ) {
			das.get(3).click();test.log(Status.PASS,MarkupHelper.createLabel("1.Click and Hold the other node ",ExtentColor.GREEN));try {Assert.assertEquals(true, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure to change current node to publicnode1.rpcnode.stream:29095?\"]")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("2.Check the message",ExtentColor.GREEN));test.info(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure to change current node to publicnode1.rpcnode.stream:29095?\"]")).getAttribute("content-desc"));}catch(Exception e) {test.fail("not able to select the node");}}else {das.get(5).click();test.log(Status.PASS,MarkupHelper.createLabel("1.Click and Hold the other node ",ExtentColor.GREEN));try {Assert.assertEquals(true, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure to change current node to explorer.beldex.io:19091?\"]")).isDisplayed());test.log(Status.PASS,MarkupHelper.createLabel("2.Check the message",ExtentColor.GREEN));test.info(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure to change current node to explorer.beldex.io:19091?\"]")).getAttribute("content-desc"));}catch(Exception e) {test.fail("not able to select the node");}}
		node.NodeChangeConfirmation();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click Ok",ExtentColor.GREEN));
		List<WebElement> das1 = driver.findElements(By.className("android.view.View"));
		for(int i=3;i<=14;i++) { 
			if(dat.equals(das1.get(i).getAttribute("scrollable")) ) {
				String d40=das1.get(i).getAttribute("scrollable");
				// Print element of list
				Thread.sleep(1000);   
				System.out.println(d40);      
				i--;
				String d41=das1.get(i).getAttribute("content-desc");
				Thread.sleep(1000);
				System.out.println(d41);      
				i++;
				i++;
			}else {  
				i--; String d42=das1.get(i).getAttribute("content-desc");

				System.out.println(d42+" "+"This node is selected");test.log(Status.INFO,MarkupHelper.createLabel("Able to change the node "+d42+" this is the current node after changing ",ExtentColor.GREEN));	passFailScreenshot("100");break;
}}}
	@Test(priority = 5)      
	public void TC_175() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_175 <br />Test case description: Validate whether able to Delete the nodes.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		node.ResetNodeToDefault();
		password.OkbuttoninUEWclick();
		Thread.sleep(2000);
		List<WebElement> dae = driver.findElements(By.className("android.view.View"));
		for(int i=3;i<=4;i++) { 
			if(dat.equals(dae.get(i).getAttribute("scrollable")) ) {
				node.Scroll__Node(18);
				test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the node from right end to left",ExtentColor.GREEN));
				node .NodeChangeConfirmation();List<WebElement> rty = driver.findElements(By.className("android.view.View"));
				String ta5=rty.get(2).getAttribute("content-desc");
				try {Assert.assertEquals(ta5,"explorer.beldex.io:19091");test.log(Status.INFO,MarkupHelper.createLabel("Removed this node-: publicnode1.rpcnode.stream:29095",ExtentColor.GREEN));passFailScreenshot("000004444");}catch(Exception e) {test.fail("not able to delet");passFailScreenshot("101020");}
				i++;

			}else {  node.Scroll__Node(25);test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the node from right end to left",ExtentColor.GREEN));
			node.NodeChangeConfirmation();Thread.sleep(2000); List<WebElement> dbty = driver.findElements(By.className("android.view.View"));String ta6=dbty.get(4).getAttribute("content-desc"); try {Assert.assertEquals(ta6,"mainnet.beldex.io:29095");test.log(Status.INFO,MarkupHelper.createLabel("Removed this node Removed this node-: explorer.beldex.io:19091",ExtentColor.GREEN));passFailScreenshot("1010");}catch(Exception e) {test.fail("not able to delet");passFailScreenshot("101000");}}}}

	@Test(priority = 6)
	public void TC_TC_176() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_176 <br />Test case description: Validate whether able to Delete the Current node.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");

		List<WebElement> das1 = driver.findElements(By.className("android.view.View"));
		for(int i=3;i<=14;i++) { 
			if(dat.equals(das1.get(i).getAttribute("scrollable")) ) {
				String d40=das1.get(i).getAttribute("scrollable");
				// Print element of list
				Thread.sleep(1000);   
				System.out.println(d40);      
				i--;
				String d41=das1.get(i).getAttribute("content-desc");
				Thread.sleep(1000);
				System.out.println(d41);      
				i++;
				i++;
			}else {this.y=i; i--;break;
			}}
		switch(y) {
		case 3:
			node.Scroll__Node(18);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("traying to delete 1st node which is selected");
			break;
		case 5:
			node.Scroll__Node(25);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("traying to delete 2nd node which is selected");
			break;
		case 7:
			node.Scroll__Node(35);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("3rd not assigned traying to delete first node which is selected");
			break;
		case 9:
			node.Scroll__Node(39);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("4th not assigned traying to delete first node which is selected");
			break;
		case 11:
			node.Scroll__Node(47);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("5th not assigned traying to delete first node which is selected");
			break;
		case 13:
			node.Scroll__Node(56);
			try {Assert.assertEquals(false, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Remove node\r\n"
					+ "Are you sure that you want to remove selected node?\"]")).isDisplayed());test.fail("able to remove selected");}catch(Exception e) {test.pass("Not able to delete the current node");}
			test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the current node from right end to left",ExtentColor.GREEN));
			System.out.println("6th not assigned traying to delete first node which is selected");
			break;
		}


	}
	@Test(priority =7)
	public void TC_TC_182() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:182 <br />Test case description: Validate the working of the New  node without entering a value in the optional fields..</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");
		node.ResetNodeToDefault();
		password.OkbuttoninUEWclick();
		List<WebElement> das = driver.findElements(By.className("android.view.View"));

		// Adding elements to the List
		// Custom inputss
		for(int i=3;i<=4;i++) { 
			if(dat.equals(das.get(i).getAttribute("scrollable")) ) {
				node.Scroll__Node(18);
				test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the node from right end to left",ExtentColor.GREEN));
				node.NodeChangeConfirmation();List<WebElement> da = driver.findElements(By.className("android.view.View"));
				String ta5=da.get(2).getAttribute("content-desc");
				try {Assert.assertEquals(ta5,"explorer.beldex.io:19091");test.log(Status.INFO,MarkupHelper.createLabel("Removed this node-: publicnode1.rpcnode.stream:29095",ExtentColor.GREEN));passFailScreenshot("000004444");}catch(Exception e) {test.fail("not able to delet");passFailScreenshot("101020");}
				i++;

			}else {  node.Scroll__Node(25);test.log(Status.PASS,MarkupHelper.createLabel("1.Swipe the node from right end to left",ExtentColor.GREEN));
			node.NodeChangeConfirmation();List<WebElement> db = driver.findElements(By.className("android.view.View"));String ta6=db.get(3).getAttribute("content-desc"); try {Assert.assertEquals(ta6,"mainnet.beldex.io:29095");test.log(Status.INFO,MarkupHelper.createLabel("Removed this node Removed this node-: explorer.beldex.io:19091",ExtentColor.GREEN));passFailScreenshot("1010");}catch(Exception e) {test.fail("not able to delet");passFailScreenshot("101000");}}}
		List<WebElement> das7= driver.findElements(By.className("android.view.View"));

		String ta=	das7.get(2).getAttribute("content-desc");
		String	da7="publicnode1.rpcnode.stream:29095";
		if(da7.equals(ta)) {	
			//to test apart from public node
			node.Add_Node_Plus_button_click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
			node.Nodeaddress_button_click();

			Actions act=new Actions(driver);
			act.sendKeys("explorer.beldex.io").perform();
			node.Node_Port_click();
			act.sendKeys("19091").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text boxes",ExtentColor.GREEN));    
			node.Test_button_click();
			node.Add_Node_click();
			String result = driver.findElement(By.id("android:id/alertTitle")).getText();
			System.out.println("Alert text Is -> " + result);
			test.log(Status.PASS,MarkupHelper.createLabel("3.click the save option",ExtentColor.GREEN));}
		else {
			node.Add_Node_Plus_button_click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
			node.Nodeaddress_button_click();

			Actions act=new Actions(driver);
			act.sendKeys("publicnode1.rpcnode.stream").perform();
			node.Node_Port_click();
			act.sendKeys("29095").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text boxes",ExtentColor.GREEN));
			node.Test_button_click();
			node.Add_Node_click();	
			test.log(Status.PASS,MarkupHelper.createLabel("3.click the save option",ExtentColor.GREEN));

		}
		Thread.sleep(2000);
		List<WebElement> das8= driver.findElements(By.className("android.view.View"));
		String r56=das8.get(12).getAttribute("content-desc");
		System.out.println(r56);
		String r66="publicnode1.rpcnode.stream:29095";
		String r67="explorer.beldex.io:19091";
		if(r56.equals(r66)) {
			try {Assert.assertEquals(r66,das8.get(12).getAttribute("content-desc") );test.info("Added node "+das8.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");}catch(Exception e) {test.fail("Added node is not showing");}
		}	else {try{Assert.assertEquals(r67,das8.get(12).getAttribute("content-desc") );test.info("Added node "+das8.get(12).getAttribute("content-desc"));passFailScreenshot("0.2454665464");}catch(Exception e) {test.fail("Added node is not showing");}}

	}
	@Test(priority =8)
	public void TC_180() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_180 <br />Test case description: Validate the working of the New node without entering a value in all the fields.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.ResetNodeToDefault();
		password.OkbuttoninUEWclick();
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Test_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Test button",ExtentColor.GREEN));
		try {Assert.assertEquals(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Node port can only contain numbers between 0 and 65535\"]")).isDisplayed(),driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a iPv4 address\"]")).isDisplayed());passFailScreenshot("0.2302");}catch(Exception e) {test.fail(e);}
        driver.navigate().back();
}
	@Test(priority =9)
	public void TC_181() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_181 <br />Test case description: Validate the working of the New node without entering a value in the mandatory fields.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodename_click();
		Actions act=new Actions(driver);
		act.sendKeys("Node1").perform();
		node.Username_click();
		act.sendKeys("Alberto").perform();
		node.Password_click();
		act.sendKeys("Al@123").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a value in optional text box fields",ExtentColor.GREEN));
		node.Test_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Click Test option",ExtentColor.GREEN));
		
		try {Assert.assertEquals(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Node port can only contain numbers between 0 and 65535\"]")).isDisplayed(),driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a iPv4 address\"]")).isDisplayed());
		
	test.info("<b>Showing below mentioned error message</b><br>"+driver.findElement(By.xpath("//android.view.View[@content-desc=\"Node port can only contain numbers between 0 and 65535\"]")).getAttribute("content-desc")+"<br>"+driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a iPv4 address\"]")).getAttribute("content-desc"));passFailScreenshot("0.232");}catch(Exception e) {test.fail(e);passFailScreenshot("01203");}

		driver.navigate().back();


}
	@Test(priority =10)
	public void TC_183() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_183 <br />Test case description: Validate the working of the New node with valid Node Address, Valid Node port, Valid Login and Valid Password.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		List<WebElement> das = driver.findElements(By.className("android.view.View"));
		for(int i=3;i<=4;i++) { 
			if(dat.equals(das.get(i).getAttribute("scrollable")) ) {
				node.Scroll__Node(18);
				node.NodeChangeConfirmation();List<WebElement> da = driver.findElements(By.className("android.view.View"));
				String ta5=da.get(2).getAttribute("content-desc");
				try {Assert.assertEquals(ta5,"explorer.beldex.io:19091");}catch(Exception e) {test.fail("not able to delete");passFailScreenshot("101020");}
				i++;

			}else {  node.Scroll__Node(25);
			 node.NodeChangeConfirmation();List<WebElement> db = driver.findElements(By.className("android.view.View"));String ta6=db.get(4).getAttribute("content-desc"); try {Assert.assertEquals(ta6,"mainnet.beldex.io:29095");}catch(Exception e) {test.fail("not able to delet");passFailScreenshot("101000");}}}
		Thread.sleep(2000);
		List<WebElement> das7= driver.findElements(By.className("android.view.View"));
		List<WebElement> das12= driver.findElements(By.className("android.view.View"));
		String ta=	das12.get(2).getAttribute("content-desc");
		String	da7="publicnode1.rpcnode.stream:29095";
		if(da7.equals(ta)) {	
			//to test apart from public node
			node.Add_Node_Plus_button_click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
			node.Nodeaddress_button_click();

			Actions act=new Actions(driver);
			act.sendKeys("explorer.beldex.io").perform();
			node.Node_Port_click();
			act.sendKeys("19091").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text boxes",ExtentColor.GREEN));    
			node.Username_click();
			act.sendKeys("albert").perform();
			node.Password_click();
			act.sendKeys("Al1@23").perform();
			
			node.Test_button_click();
			node.Add_Node_click();
			
			test.log(Status.PASS,MarkupHelper.createLabel("3.click the save option",ExtentColor.GREEN));
			passFailScreenshot("0.000213");}
		else {
			node.Add_Node_Plus_button_click();
			test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
			node.Nodeaddress_button_click();

			Actions act=new Actions(driver);
			act.sendKeys("publicnode1.rpcnode.stream").perform();
			node.Node_Port_click();
			act.sendKeys("29095").perform();
			test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text boxes",ExtentColor.GREEN));
			node.Username_click();
			act.sendKeys("albert").perform();
			node.Password_click();
			act.sendKeys("Al1@23").perform();
			
			node.Test_button_click();
			node.Add_Node_click();		
			test.log(Status.PASS,MarkupHelper.createLabel("3.click the save option",ExtentColor.GREEN));
			passFailScreenshot("0.0001");
		}
		Thread.sleep(2000);
		List<WebElement> das8= driver.findElements(By.className("android.view.View"));
		String r56=das8.get(12).getAttribute("content-desc");
		if(r56==null) {test.pass("<b>Not able to add node with username and passwaord</b>");}else {
		System.out.println(r56);
		String r66="publicnode1.rpcnode.stream:29095";
		String r67="explorer.beldex.io:19091";
		if(r56.equals(r66)) {
			try {Assert.assertEquals(r66,das8.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das8.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r67,das8.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das8.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b> ");}}


		 }
		driver.navigate().back();
	
	}
	
	@Test(priority =11)
	public void TC_184() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_184 <br />Test case description: Validate the working of the New node with valid Node Address, Valid Node port, Valid Login and InValid Password.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();

		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcnode.stream").perform();
		node.Node_Port_click();
		act.sendKeys("29095").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Username_click();
		act.sendKeys("albert").perform();
		node.Password_click();
		act.sendKeys("   @                  @").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.00021");
		Thread.sleep(2000);
		List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		String r6=das089.get(12).getAttribute("content-desc");
		if(r6==null) {test.pass("<b>Not able to add node with invalid password</b>");}else {
		System.out.println(r6);
		String r677="publicnode1.rpcnode.stream:29095";
		String r6799="explorer.beldex.io:19091";
		if(r6.equals(r677)) {
			try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b> ");}}
		System.out.println("Adding in vliad pass passed");


}
		
	
	driver.navigate().back();
	
	
	}
	


	@Test(priority =12)
	public void TC_185() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_185 <br />Test case description: Validate the working of the New node with valid Node Address, Valid Node port, InValid Login and Valid Password.</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();



		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcnode.stream").perform();
		node.Node_Port_click();
		act.sendKeys("29095").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Username_click();
		act.sendKeys("      #     ").perform();
		node.Password_click();
		act.sendKeys("Al@12340").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.0002112");
		Thread.sleep(2000);
		List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		String r6=das089.get(12).getAttribute("content-desc");
		if(r6==null) {test.pass("<b>Not able to add node with invalid username</b>");}else {
		System.out.println(r6);
		String r677="publicnode1.rpcnode.stream:29095";
		String r6799="explorer.beldex.io:19091";
		if(r6.equals(r677)) {
			try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");}catch(AssertionError e) {test.fail("<b>Added node is not showing or not able to add</b> ");}}
		System.out.println("Adding in vliad pass passed");


}

driver.navigate().back();

}
	



	@Test(priority =13)
	public void TC_186() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_186 <br />Test case description: Validate the working of the New node with valid Node Address, InValid Node port, Valid Login and Valid Password .</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();



		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcnode.stream").perform();
		node.Node_Port_click();
		act.sendKeys("100101").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Username_click();
		act.sendKeys("Alberto02").perform();
		node.Password_click();
		act.sendKeys("Al@12340").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.0002115");
		Thread.sleep(2000);
		//List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		//String r6=das089.get(12).getAttribute("content-desc");
		//if(r6==null) {test.pass("Not able to add node with invalid node port");}else {
		System.out.println();
		//String r677="publicnode1.rpcnode.stream:29095";
		//String r6799="explorer.beldex.io:19091";
		//if(r6.equals(r677)) {
			//try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");test.fail("Able to add node with invalid node port");}catch(AssertionError e) {test.pass("Not able to add node with invalid node port");}
		//}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");test.fail("Able to add node with invalid node port");}catch(AssertionError e) {test.pass("Not able to add node with invalid node port");}}
		//System.out.println("Adding in vliad pass passed");
try {Assert.assertEquals(true, driver.findElement(By.xpath("//android.view.View[@content-desc=\"Node port can only contain numbers between 0 and 65535\"]")).isDisplayed());test.pass("<b>Not able to add invalid Node port</b>");passFailScreenshot("0.12222");}catch(Exception e) {test.fail("<b>Able to add Invalid node port</b>");passFailScreenshot("0.1331");}
		driver.navigate().back();
}





	@Test(priority =14)
	public void TC_187() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_187 <br />Test case description: Validate the working of the New node with Invalid Node Address, Valid Node port, Valid Login and Valid Password .</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();



		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcno").perform();
		node.Node_Port_click();
		act.sendKeys("29095").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Username_click();
		act.sendKeys("Alberto02").perform();
		node.Password_click();
		act.sendKeys("Al@12340").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.0002118");
		Thread.sleep(2000);
		List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		String r6=das089.get(12).getAttribute("content-desc");
		if(r6==null) {test.pass("<b>Not able to add node with invalid node Address</b>");}else {
		System.out.println(r6);
		String r677="publicnode1.rpcnode.stream:29095";
		String r6799="explorer.beldex.io:19091";
		if(r6.equals(r677)) {
			try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");test.fail("<b>Able to add node with invalid node Address</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("<b>Added node</b> "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");test.fail("<b>Able to add node with invalid node Address</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}}
		System.out.println("<b>Adding in vliad pass passed</b>");


}

driver.navigate().back();

}
	@Test(priority =15)
	public void TC_188() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_188 <br />Test case description: Validate the wroking of the New node with Invalid Node Address and Invalid Node port .</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();



		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcno").perform();
		node.Node_Port_click();
		act.sendKeys("22").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Username_click();
		act.sendKeys("Alberto02").perform();
		node.Password_click();
		act.sendKeys("Al@12340").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.21");
		Thread.sleep(2000);
		List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		String r6=das089.get(12).getAttribute("content-desc");
		if(r6==null) {test.pass("<b> Not able to add node with invalid node Address and invalid Node port</b>");}else {
		System.out.println(r6);
		String r677="publicnode1.rpcnode.stream:29095";
		String r6799="explorer.beldex.io:19091";
		if(r6.equals(r677)) {
			try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");test.fail("<b>Able to add node with invalid node port and invalid node address</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");test.fail("<b>Able to add node with invalid node port and invalid node address</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}}
		System.out.println("Adding in vliad pass passed");


}

driver.navigate().back();

}

	@Test(priority =16)
	public void TC_189() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_189 <br />Test case description: Validate the working of the Save function. .</b>");
		test.assignAuthor("Alberto");
		test.assignCategory("Smoke Testing");
		test.assignDevice("Redmi Note 9 Pro");	
		node.Add_Node_Plus_button_click();
		test.log(Status.PASS,MarkupHelper.createLabel("1.Click the Plus icon",ExtentColor.GREEN));
		node.Nodeaddress_button_click();



		Actions act=new Actions(driver);
		act.sendKeys("publicnode1.rpcnode.stream").perform();
		node.Node_Port_click();
		act.sendKeys("29095").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("2.Enter a valid value in all text box fields except Password field",ExtentColor.GREEN));
		node.Nodename_click();
		act.sendKeys("Pubblicnode1").perform();
		node.Username_click();
		act.sendKeys("Albert02").perform();
		node.Password_click();
		act.sendKeys("Al@12340").perform();
		test.log(Status.PASS,MarkupHelper.createLabel("3.Enter a Invalid value in password field",ExtentColor.GREEN));
		node.Test_button_click();
		node.Add_Node_click();		
		test.log(Status.PASS,MarkupHelper.createLabel("4.Click save option",ExtentColor.GREEN));
		passFailScreenshot("0.2");
		Thread.sleep(2000);
		List<WebElement> das089= driver.findElements(By.className("android.view.View"));
		String r6=das089.get(12).getAttribute("content-desc");
		if(r6==null) {test.pass("<b> Not able to add node entering values in text box fields</b>");}else {
		System.out.println(r6);
		String r677="publicnode1.rpcnode.stream:29095";
		String r6799="explorer.beldex.io:19091";
		if(r6.equals(r677)) {
			try {Assert.assertEquals(r677,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.232");test.fail("<b>Able to add node with invalid node port</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}
		}	else {try{Assert.assertEquals(r6799,das089.get(12).getAttribute("content-desc") );test.info("Added node "+das089.get(12).getAttribute("content-desc"));passFailScreenshot("0.2");test.fail("<b>Able to add node with invalid node port</b>");}catch(AssertionError e) {test.pass("<b>Added node is not showing or not able to add</b>");}}
		System.out.println("Adding in vliad pass passed");


}

driver.navigate().back();

}

	@Test(priority =17)
	public void TC_191() throws IOException, InterruptedException {
		test=extent.createTest("Test Scenario:	To Check the working of the Nodes functionality in the wallet Settings Screen ", "<b><br /> Test case Id:TC_191 <br />Test case description: Verify the screen action from the device screen lock and after the screen unlock..</b>");
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



}	
	



