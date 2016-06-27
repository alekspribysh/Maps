package andr.elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by aprybysh on 6/24/16.
 */
public class ResultPage {

    public MobileElement imagePresents(AndroidDriver driver){

        MobileElement image = (MobileElement)  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/" +
                "android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]\n"));

        return image;
    }

    public  MobileElement titleIs (AndroidDriver driver){

        MobileElement title = (MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/title"));

        return title;
    }

    public  MobileElement ratingIs (AndroidDriver driver){

        MobileElement rating = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/" +
                "android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]\n"));

        return rating;
    }

    public  MobileElement labelIS (AndroidDriver driver){

        MobileElement label = (MobileElement) driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/" +
                "android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/" +
                "android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ViewSwitcher[1]/android.widget.FrameLayout[1]" +
                "/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.TextView[1]"));
        return label;
    }


}
