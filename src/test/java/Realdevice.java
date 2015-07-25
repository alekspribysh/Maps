import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by aprybysh on 7/10/15.
 */
public class Realdevice {

    public static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

/*
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "iPhone");
        capabilities.setCapability("udid", "7DDEBA9B9D1B2350B346B071747CC8221526B5D7");
        capabilities.setCapability("bundleid", "com.google.Rzimuth");
        capabilities.setCapability("ipa", "/Users/aprybysh/Desktop/Build/rzimuth_4.7.60151.ipa");
        driver = new RemoteWebDriver( new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6_2");
        capabilities.setCapability(MobileCapabilityType.UDID,"18d51a2cbf1ccba146edb38c2abd2014fab78a69");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        capabilities.setCapability("bundleid", "com.google.Azimuth");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/aprybysh/Desktop/Build/rzimuth_4.7.60151.ipa");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


}
