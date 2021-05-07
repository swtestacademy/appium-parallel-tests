package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class JobDetailsSteps extends BaseSteps {
    public JobDetailsSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public JobDetailsSteps givenIAmOnJobsListingPage() {
        splashScreen.skipSplashScreen();
        selectionScreen.clickIamSearchingJob();
        candidateMainScreen.allowNotification();
        return this;
    }

    public JobDetailsSteps whenIClickToJob() {
        candidateMainScreen.clickToJob();
        return this;
    }

    public JobDetailsSteps thenIShouldSeeJobDetails() {
        jobScreen.assertToolBarTitleIsExpected();
        return this;
    }
}