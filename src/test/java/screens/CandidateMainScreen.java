package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CandidateMainScreen extends BaseScreen {
    public CandidateMainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * Mobile Elements
     */
    By allowWhenUsingBy = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By jobsBy           = By.id("com.isinolsun.app:id/rootRelativeView");

    /**
     * Actions
     */
    public void allowNotification() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).click();
        }
    }

    @SneakyThrows
    public void clickToJob() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(jobsBy)).get(1).click();
        Thread.sleep(4000); //Just Wait for a while
    }

    public void swipeDownAndClickToJob() {
        waitAndFindElements(jobsBy);

        mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);

        mobileActions.swipeByElements((AndroidElement) waitAndFindElements(jobsBy).get(1),
            (AndroidElement) waitAndFindElements(jobsBy).get(0));

        mobileActions.swipeByElements((AndroidElement) waitAndFindElements(jobsBy).get(0),
            (AndroidElement) waitAndFindElements(jobsBy).get(1));

        mobileActions.tapByElement((AndroidElement) waitAndFindElements(jobsBy).get(1));
    }
}
