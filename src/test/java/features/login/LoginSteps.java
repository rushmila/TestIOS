package features.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginSteps{
	public static AppiumDriver driver;

	
	@Before  public void setUp() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
        
        capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", "/Users/rushmila/Documents/appium testing/OSS-IOS-6.app");
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }


    
	@Given("^user is in get started page$")
	public void user_is_in_get_started_page() throws Throwable {
		if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]").getAttribute("label").equals("Login"))			
		{ 
			System.out.println("Pass :: In login page");
		}
		else
			System.out.println("Fail :: Not in login page");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
//	    throw new PendingException();
	}

	@Then("^user gets the User name text box$")
	public void user_gets_the_User_name_text_box() throws Throwable {
		if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]").getAttribute("value").equals("Username"))			
		{ 
			System.out.println("Pass :: User name text box");
		}
		else
			System.out.println("Fail :: User name Text box not found");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//	    throw new PendingException();
	}

	@Then("^user gets the Password text box$")
	public void user_gets_the_Password_text_box() throws Throwable {
//		
//		assertTrue(driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]/UIASecureTextField[1]").isDisplayed());
		if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]").getAttribute("value").equals("password"))			
		{ 
			System.out.println("Pass :: Password text box");
		}
		else
			System.out.println("Fail :: Password Text box not found");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//	    throw new PendingException();
	}

	@Then("^user gets the Login button$")
	public void user_gets_the_Login_button() throws Throwable {
		if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]").getAttribute("label").equals("Login"))			
		{ 
			System.out.println("Pass :: 'Login' button found");
		}
		else
			System.out.println("Fail :: 'Login' button not found");
		
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		
		
//	    throw new PendingException();
	}

    @After  
    public void tearDown() throws Exception {  
       driver.quit();  
    }  
}
