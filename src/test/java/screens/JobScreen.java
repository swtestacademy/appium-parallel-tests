package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class JobScreen extends BaseScreen{
    public JobScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By toolBarTitleBy   = By.id("com.isinolsun.app:id/toolbarTitle");

    /**Actions*/
    public void assertToolBarTitleIsExpected() {
        String toolBarTitleStr = wait.until(ExpectedConditions.visibilityOfElementLocated(toolBarTitleBy)).getText();
        Assert.assertTrue(toolBarTitleStr.toLowerCase().contains("detay"));
    }
}
