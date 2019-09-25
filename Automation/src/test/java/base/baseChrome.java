package base;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.lang.Runtime;

public class baseChrome {
	
	public static int count=0;
	
		public static void initialise() throws InterruptedException
		{
			if(count==0)
			{
			String[] appiumstart = {"cmd.exe", "/C", "Start", "C:\\Users\\ambl02\\AppData\\Appium_Run.bat"};
			Thread.sleep(10000);
			String[] emulatorstart = {"cmd.exe", "/C", "Start", "C:\\Users\\ambl02\\AppData\\Start_Emulator.bat"};
			Thread.sleep(10000);
			try {
				Process run = Runtime.getRuntime().exec(appiumstart);
				Process run1=Runtime.getRuntime().exec(emulatorstart);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			System.out.println("Called initialise method");
			Thread.sleep(10000);
			}
			
			
		}

		public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub
						
			
			initialise();
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Avinash");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			System.setProperty("webdriver.http.factory", "apache");
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			return driver;

		}

	}

	

