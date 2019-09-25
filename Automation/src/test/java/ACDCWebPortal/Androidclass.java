package ACDCWebPortal;
import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import base.baseChrome;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Androidclass extends baseChrome {
	
	
	  public static AndroidDriver<AndroidElement> capability() throws
	  MalformedURLException { File f=new File("src/test/java"); 
	  File fs= new File(f, "ApiDemos-debug.apk"); 
	  
	  DesiredCapabilities cap1=new DesiredCapabilities();
	  
	  cap1.setCapability(MobileCapabilityType.DEVICE_NAME, "Avinash");
	  cap1.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	  cap1.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2"); //
	  //cap1.getBrowserName();
	  //cap1.setCapability(MobileCapabilityType.BROWSER_NAME,cap1.getBrowserName());
	  System.setProperty("webdriver.http.factory", "apache");
	  AndroidDriver<AndroidElement> driver1 = new AndroidDriver<>(new
	  URL("http://127.0.0.1:4723/wd/hub"), cap1); return driver1; }
	 
	@Test(priority=1)
	public void Androidtest() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(20000);
		baseChrome.initialise();

        Thread.sleep(20000);
		
		AndroidDriver<AndroidElement> driver=capability();
	//	driver.get("https://www.seleniumhq.org/download/");
	//	AndroidDriver<AndroidElement> driver= Capabilities();
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='9. Switch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/switch_widget")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.closeApp();	
		driver.close();
		
	/*
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='views']");
        
        TouchAction t =new TouchAction(driver);
        
        t.tap(tapOptions().withElement(element(expandList))).perform();
        
        
		
		
		
		
		
		
		/*
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/edit")).sendKeys("abhijeet");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		
		*/
	}

}
