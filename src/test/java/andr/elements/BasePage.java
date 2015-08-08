package andr.elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

/**
 * Created by aprybysh on 6/24/16.
 */
public class BasePage {


    public MobileElement searchbox(AndroidDriver driver) {

        MobileElement searchbox = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.EditText[1]/android.widget.TextView[1]\n"));

        return searchbox;
    }


    public MobileElement menu(AndroidDriver driver) {

        MobileElement menu = (MobileElement) driver.findElementByXPath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/" +
                "android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]\n");
        return menu;
    }

    public MobileElement microphone(AndroidDriver driver) {

        MobileElement microphone = (MobileElement) driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]" +
                "/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.ImageButton[1]\n"));

        return microphone;
    }

    public MobileElement star(AndroidDriver driver) {

        MobileElement star = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.ImageView[1]\n"));

        return star;
    }


    public MobileElement explore(AndroidDriver driver) {

        MobileElement explore = (MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/textbox"));

        return explore;
    }


    public MobileElement watermark(AndroidDriver driver) {

        MobileElement watermark = (MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/watermark_image"));

        return watermark;
    }


    public MobileElement fabDirection(AndroidDriver driver) {

        MobileElement fab = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]" +
                "/android.view.View[1]/android.widget.FrameLayout[5]/android.widget.FrameLayout[1]/android.widget.ImageView[2]\n"));

        return fab;
    }

    public MobileElement myLocation(AndroidDriver driver) {

        MobileElement myLocation = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[6]/android.widget.FrameLayout[1]/" +
                "android.widget.ImageView[2]"));

        return myLocation;

    }

}
