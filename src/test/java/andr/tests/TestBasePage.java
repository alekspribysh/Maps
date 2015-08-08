package andr.tests;

import andr.constant.Driver;
import andr.elements.BasePage;
import andr.elements.ResultPage;
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
    ResultPage res = new ResultPage();
    AndroidDriver driver;


    @BeforeTest
    public void getDriver() throws MalformedURLException {

        driver = driv.setUp();
    }


    @Test
    public void findElements(){

        Assert.assertNotNull(base.searchbox(driver));
        Assert.assertNotNull(base.menu(driver));
        Assert.assertNotNull(base.microphone(driver));
        Assert.assertNotNull(base.explore(driver));
        Assert.assertNotNull(base.star(driver));
        Assert.assertNotNull(base.watermark(driver));
        Assert.assertNotNull(base.myLocation(driver));
        Assert.assertNotNull(base.fabDirection(driver));
        Assert.assertTrue(base.fabDirection(driver).isDisplayed());

    }


    @Test
    public void findElements1(){

        Assert.assertNotNull(base.searchbox(driver));
        Assert.assertNotNull(base.menu(driver));
        Assert.assertNotNull(base.microphone(driver));
        Assert.assertNotNull(base.explore(driver));
        Assert.assertNotNull(base.star(driver));
        Assert.assertNotNull(base.watermark(driver));
        Assert.assertNotNull(base.myLocation(driver));
        Assert.assertNotNull(base.fabDirection(driver));
        Assert.assertTrue(base.fabDirection(driver).isDisplayed());

    }


    @Test void  searchBusines(){

        //base.searchbox(driver).click();
        base.searchbox(driver).sendKeys("pizza");
        Assert.assertTrue(res.imagePresents(driver).isDisplayed());
        Assert.assertTrue(res.ratingIs(driver).isDisplayed());
        Assert.assertTrue(res.titleIs(driver).isDisplayed());


    }


}
