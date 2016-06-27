package andr.elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by aprybysh on 6/27/16.
 */
public class SearchPage {



    public MobileElement search(AndroidDriver driver){

        MobileElement searchBox = (MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_edit_text"));

        return searchBox;
    }

    public MobileElement cancel (AndroidDriver driver) {

        MobileElement cancel = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]" +
                "/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/" +
                "android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]"));

        return cancel;
    }



}
