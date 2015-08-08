package com.MyLocation;

import com.Driver.CreateDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by aprybysh on 8/7/15.
 */
public class BlueDot {

    public AndroidDriver driver;
//    public void getSideMenu(){
//        TouchAction action0 = new TouchAction(driver).longPress(50, 1000, 3000).moveTo(1000, 1000);
//        action0.release().perform();
//
//
//    }


    @BeforeClass
    public void setUp() throws MalformedURLException {
        CreateDriver setdriver = new CreateDriver();

        driver = setdriver.setUp1();

    }


    @Test

    public void moveMap() throws InterruptedException {

        MobileElement mapview = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                "/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]");

        MultiTouchAction multiTouch = new MultiTouchAction(driver);

        TouchAction action0 = new TouchAction(driver).press(mapview, 100, 0).moveTo(mapview, 0,-80).release();
        TouchAction action1 = new TouchAction(driver).press(mapview, 100, 50).moveTo(mapview, 0,80).release();
        multiTouch.add(action0).add(action1).perform();
//        action0.perform();
//        Thread.sleep(6000);
//        driver.closeApp();
//        driver.quit();


    }

}
