package driverFactory;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverFactory {

	public static AppiumDriver driver;

	public void setUp() throws Exception {  

        DesiredCapabilities capabilities = new DesiredCapabilities(); 
        
        capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.2");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", "/Users/rushmila/Documents/appium testing/OSS-IOS-6.app");
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

	}
	
    public void tearDown() throws Exception {  
        driver.quit();  
    }
	
}
