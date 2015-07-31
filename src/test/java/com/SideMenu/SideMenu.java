package com.SideMenu;

import com.Driver.CreateDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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


    }




}
