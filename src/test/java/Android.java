
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


/**
 * Created by aprybysh on 7/21/15.
 */
public class Android {

    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

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

    //Find and swipe element
    @org.testng.annotations.Test
    public void pizza() {


        MobileElement e = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.ImageView[1]"));
        e.click();
        MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.EditText[1]"));
        e1.click();
        e1.sendKeys("pizza");
        MobileElement e2 = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]" +
                "/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
        e2.click();
        MobileElement e3 = (MobileElement) driver.findElement(By.id("com.google.android.apps.gmm:id/title"));
        System.out.printf(e3.getText().toString());
        Assert.assertTrue(e3.getText().contains("Pizza"));
        System.out.printf("Pass");
        e3.click();
        MobileElement e4 = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]" +
                "/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ViewSwitcher[1]" +
                "/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
        e4.swipe(SwipeElementDirection.LEFT, 10, 20, 1000);

          driver.resetApp();


    }
    //Long press and double touch(wait)
    @Test
    public void MultiGestureSingleActionTest() throws InterruptedException {
        //the underlying java library for Appium doesn't like multi-gestures with only a single action.
        //but java-client should handle it, silently falling back to just performing a single action.

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.google.android.apps.gmm:id/watermark_image")));
        System.out.println("Passed!!!!!!!");
        MultiTouchAction multiTouch = new MultiTouchAction(driver);
        TouchAction action0 = new TouchAction(driver).longPress(400,1002,3000);
        multiTouch.add(action0).perform();
        //multiTouch.perform();
//        Assert.assertEquals(driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
//                "/android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]" +
//                "/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ViewSwitcher[1]/android.widget.FrameLayout[1]" +
//                "/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]\n").getText().toString(), "US-101");
        MultiTouchAction multiTouch1 = new MultiTouchAction(driver);
        TouchAction action1 = new TouchAction(driver).tap(400,1200);
        TouchAction action2 = new TouchAction(driver).tap(300,1300);
        multiTouch1.add(action1);
        multiTouch1.add(action2);
        multiTouch1.perform();
        Thread.sleep(2000);
        multiTouch1.perform();
        Thread.sleep(5000);
        driver.closeApp();


    }


//    @After
//
//    public void quit (){
//        driver.close();
//
//    }


}
