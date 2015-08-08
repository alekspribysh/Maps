package andr.tests;

import andr.constant.Driver;
import andr.elements.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by aprybysh on 6/24/16.
 */
public class TestBasePage {
    Driver driv = new Driver();
    BasePage base = new  BasePage();
    AndroidDriver driver;


    @BeforeTest
    public void getDriver() throws MalformedURLException {

        driver = driv.setUp();
    }


    @Test
    public void findElements(){

//        Assert.assertNotNull(base.searchbox(driver));
//        Assert.assertNotNull(base.menu(driver));
//        Assert.assertNotNull(base.microphone(driver));
//        Assert.assertNotNull(base.explore(driver));
//        Assert.assertNotNull(base.star(driver));
        Assert.assertNotNull(base.watermark(driver));
        Assert.assertNotNull(base.myLocation(driver));
        Assert.assertNotNull(base.fabDirection(driver));
        Assert.assertTrue(base.fabDirection(driver).isDisplayed());

    }


}
