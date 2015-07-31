import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;



/**
 * Created by aprybysh on 6/27/15.
 */
public class Test {

/*    public static  WebDriver driver ;

    public static void main(String[] args) throws MalformedURLException {




        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capabilities.setCapability(MobileCapabilityType.APP, "/Users/aprybysh/Desktop/rzimuth_4.6.57983/Payload/Google_Maps.app");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/

    public WebDriver driver;

    /**
     * Instantiates the {@link #driver} instance by using DesiredCapabilities which specify the
     * 'iPhone Simulator' device and 'safari' app.
     * @throws Exception
     */
    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Navigates to http://saucelabs.com/test/guinea-pig and interacts with the browser.
     *
     * @throws Exception
     */
    @org.testng.annotations.Test
    public void runTest() throws Exception {
        driver.get("http://saucelabs.com/test/guinea-pig");
        Thread.sleep(1000);
        WebElement idElement = driver.findElement(By.id("i_am_an_id"));
        Assert.assertNotNull(idElement);
        Assert.assertEquals("I am a div", idElement.getText());
        WebElement commentElement = driver.findElement(By.id("comments"));
        Assert.assertNotNull(commentElement);
        commentElement.sendKeys("This is an awesome comment");
        WebElement submitElement = driver.findElement(By.id("submit"));
        Assert.assertNotNull(submitElement);
        submitElement.click();
        Thread.sleep(7000);
        WebElement yourCommentsElement = driver.findElement(By.id("your_comments"));
        Assert.assertNotNull(yourCommentsElement);
        Assert.assertTrue(driver.findElement(By.id("your_comments")).getText().contains("This is an awesome comment"));

        System.out.println(driver.getCurrentUrl());
    }

    /**
     * Closes the {@link #driver} instance.
     *
     * @throws Exception
     */
   /* @After
    public void tearDown() throws Exception {
        driver.quit();
    }*/






}
