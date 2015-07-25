import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by aprybysh on 7/11/15.
 */
public class Test1 {
    public static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capabilities.setCapability(MobileCapabilityType.APP, "/Users/aprybysh/Desktop/rzimuth_4.6.57983/Payload/Google_Maps.app");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
