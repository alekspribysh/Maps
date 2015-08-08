package andr.constant;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by aprybysh on 6/24/16.
 */
public class Driver {

    public AndroidDriver setUp () throws MalformedURLException {

        AndroidDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Aleks");
        // capabilities.setCapability("app", "/Users/aprybysh/Desktop/com.google.android.apps.maps.apk");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.google.android.apps.maps");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.google.android.maps.MapsActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }
}

