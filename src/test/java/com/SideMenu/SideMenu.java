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
    public void getSideMenu(){
        TouchAction action0 = new TouchAction(driver).longPress(50, 1000, 3000).moveTo(1000, 1000);
        action0.release().perform();


    }


    @BeforeClass
    public void setUp() throws MalformedURLException {
    CreateDriver setdriver = new CreateDriver();

            driver = setdriver.setUp1();

    }


    @Test

    public void sideMemu() throws MalformedURLException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.google.android.apps.gmm:id/watermark_image")));
        getSideMenu();
        Assert.assertNotNull( driver.findElement(By.id("com.google.android.apps.gmm:id/layers_scrollview")));

    }

    @Test

    public void trafficLayer () throws MalformedURLException {
        getSideMenu();
        driver.findElement(By.id("com.google.android.apps.gmm:id/traffic_button")).click();
    }


    @Test

    public void publicLayer () throws MalformedURLException {
        getSideMenu();
        driver.findElement(By.id("com.google.android.apps.gmm:id/transit_button")).click();
    }


    @Test

    public void tips (){
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.google.android.apps.gmm:id/layers_scrollview")));
        TouchAction action0 = new TouchAction(driver).longPress(620, 1620, 3000).moveTo(620, 800);
        action0.release().perform();
        Assert.assertEquals(driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]" +
                "/android.widget.TextView[1]").getText().toString(), "Tips & tricks");

    }










}
