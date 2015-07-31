import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by aprybysh on 7/24/15.
 */
public class Tutorial1 {
    public WebDriver driver;

    @BeforeTest
    public void setUp () throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Aleks");
        // capabilities.setCapability("app", "/Users/aprybysh/Desktop/com.google.android.apps.maps.apk");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.google.android.apps.maps");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.google.android.maps.MapsActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @org.testng.annotations.Test

    public void reset (){
        WebElement e = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.ImageView[1]"));
        e.click();
        WebElement e1 = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.EditText[1]"));
        e1.click();
        e1.sendKeys("$$reset");

        WebElement e2 = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]" +
                "/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
        e2.click();




    }



}
