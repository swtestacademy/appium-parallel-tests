package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SplashScreen extends BaseScreen {
    public SplashScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By animationViewBy = By.id("com.isinolsun.app:id/animation_view");

    /**Actions*/
    public void skipSplashScreen() {
        waitAndClick(animationViewBy);
    }
}
