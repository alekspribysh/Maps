package andr.tests;

import andr.constant.Data;
import andr.constant.Driver;
import andr.elements.BasePage;
import andr.elements.ResultPage;
import andr.elements.SearchPage;
import io.appium.java_client.android.AndroidDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by aprybysh on 6/24/16.
 */
public class TestBasePage {
    Driver driv = new Driver();
    BasePage base = new  BasePage();
    ResultPage res = new ResultPage();
    SearchPage serPage =new SearchPage();
    Data data = new Data();
    AndroidDriver driver;


    @BeforeTest
    public void getDriver() throws MalformedURLException {

        driver = driv.setUp();
    }

//
//    @Test
//    public void findElements(){
//
//        Assert.assertNotNull(base.searchbox(driver));
//        Assert.assertNotNull(base.menu(driver));
//        Assert.assertNotNull(base.microphone(driver));
//        Assert.assertNotNull(base.explore(driver));
//        Assert.assertNotNull(base.star(driver));
//        Assert.assertNotNull(base.watermark(driver));
//        Assert.assertNotNull(base.myLocation(driver));
//        Assert.assertNotNull(base.fabDirection(driver));
//        Assert.assertTrue(base.fabDirection(driver).isDisplayed());
//
//    }
//
//
//    @Test
//    public void findElements1(){
//
//        Assert.assertNotNull(base.searchbox(driver));
//        Assert.assertNotNull(base.menu(driver));
//        Assert.assertNotNull(base.microphone(driver));
//        Assert.assertNotNull(base.explore(driver));
//        Assert.assertNotNull(base.star(driver));
//        Assert.assertNotNull(base.watermark(driver));
//        Assert.assertNotNull(base.myLocation(driver));
//        Assert.assertNotNull(base.fabDirection(driver));
//        Assert.assertTrue(base.fabDirection(driver).isDisplayed());
//        System.out.println("YEEEEP");
//
//    }

   // @Parameters ({"searchPar", "searchPar1"})
    @Test
    public void  searchBusines(){
        base.searchbox(driver).click();
        serPage.search(driver).sendKeys(data.getSearchPizza());
        driver.tap(1, 1000, 1680,10);
        Assert.assertTrue(res.imagePresents(driver).isDisplayed());
        Assert.assertTrue(res.ratingIs(driver).isDisplayed());
        Assert.assertTrue(res.titleIs(driver).isDisplayed());


    }
    @Test
    public void searchLabel(){

        base.searchbox(driver).click();
        serPage.search(driver).sendKeys(data.getSearchLabel());
        driver.tap(1, 1000, 1680,10);
        Assert.assertEquals(res.labelIS(driver).getText().toString(), data.getSearchLabel());
        serPage.cancel(driver).click();

    }

    @Test
    public void searchZip(){

        base.searchbox(driver).click();
        serPage.search(driver).sendKeys(data.getSearchZIP());
        driver.tap(1, 1000, 1680,10);
        Assert.assertTrue(res.labelIS(driver).getText().contains("94040"));
        serPage.cancel(driver).click();

    }



}
