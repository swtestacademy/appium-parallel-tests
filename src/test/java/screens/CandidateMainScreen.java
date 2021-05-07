package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CandidateMainScreen extends BaseScreen {
    public CandidateMainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By allowWhenUsingBy = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By jobsBy           = By.id("com.isinolsun.app:id/rootRelativeView");
    By profileIconBy    = By.xpath("//android.widget.LinearLayout[4]/android.widget.ImageView");

    /**Actions*/
    public void allowNotification() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).click();
        }
    }

    @SneakyThrows
    public void clickToJob(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(jobsBy)).get(index).click();
        Thread.sleep(4000); //Just Wait for a while
    }
}
