package com.SideMenu;

import com.Driver.CreateDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by aprybysh on 7/30/15.
 */
public class SideMenu {

    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
    CreateDriver setdriver = new CreateDriver();

            driver = setdriver.setUp1();

    }


    @Test

    public  void  sideMemu () throws MalformedURLException {

        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.ImageView[1]")).click();
       // e.click();

    }

    @Test
    public void MultiGestureSingleActionTest() throws InterruptedException {
        //the underlying java library for Appium doesn't like multi-gestures with only a single action.
        //but java-client should handle it, silently falling back to just performing a single action.

        MultiTouchAction multiTouch = new MultiTouchAction(driver);
        TouchAction action0 = new TouchAction(driver).longPress(438,102);
        multiTouch.add(action0).perform();

    }

}
