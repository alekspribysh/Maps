package com.SideMenu;

import com.Driver.CreateDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    public void sideMemu() throws MalformedURLException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.google.android.apps.gmm:id/watermark_image")));
        System.out.println("Passed!!!!!!!");
        TouchAction action0 = new TouchAction(driver).longPress(50, 1000, 3000).moveTo(1000, 1000);
        action0.release().perform();
        Assert.assertNotNull( driver.findElement(By.id("com.google.android.apps.gmm:id/layers_scrollview")));

    }






}
