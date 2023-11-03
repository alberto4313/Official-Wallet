package officialWallet_Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class turn_Off extends DesiredCapabilitesOfDevice {
	public void Turn_Off_Data_Wifi() throws InterruptedException, IOException {
		driver.activateApp("com.android.settings");
		driver.findElement(By.xpath("//*[@text=\"Wi-Fi\"]")).click();
		String va=driver.findElement(By.id("android:id/checkbox")).getAttribute("checked");
		//driver.navigate().back();
		//driver.findElement(By.xpath("//*[@text=\"SIM cards & mobile networks\"]")).click();
		//String rt=driver.findElement(By.className("android.widget.CheckBox")).getAttribute("checked");
		String av="true";
		if(va.equals(av)) {
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@text=\"Wi-Fi\"]")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			driver.navigate().back();
			//driver.findElement(By.xpath("//*[@text=\"SIM cards & mobile networks\"]")).click();
			//driver.findElement(By.className("android.widget.CheckBox")).click();
			//driver.navigate().back();
		}else {
			System.out.println("Already both Mobile data and wifi off");
			driver.navigate().back();
		}
	
	
}public void Turn_On_Data_Wifi() {
	driver.activateApp("com.android.settings");
	driver.findElement(By.xpath("//*[@text=\"Wi-Fi\"]")).click();
	String va=driver.findElement(By.id("android:id/checkbox")).getAttribute("checked");
	//driver.navigate().back();
	//driver.findElement(By.xpath("//*[@text=\"SIM cards & mobile networks\"]")).click();
	//String rt=driver.findElement(By.className("android.widget.CheckBox")).getAttribute("checked");
	String av="false";
	if(va.equals(av)) {driver.navigate().back();
	driver.findElement(By.xpath("//*[@text=\"Wi-Fi\"]")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.navigate().back();
		
		
		//driver.findElement(By.xpath("//*[@text=\"SIM cards & mobile networks\"]")).click();
		//driver.findElement(By.className("android.widget.CheckBox")).click();
		//driver.navigate().back();
	}else {System.out.println(" both Mobile data and wifi turned on");
	driver.navigate().back();
	}
}}
