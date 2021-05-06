package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class JobApplicationSteps extends BaseSteps {
    public JobApplicationSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public JobApplicationSteps givenIAmOnJobsListingPage() {
        splashScreen.skipSplashScreen();
        selectionScreen.clickIamSearchingJob();
        candidateMainScreen.allowNotification();
        return this;
    }

    public JobApplicationSteps whenIClickToJob() {
        candidateMainScreen.clickToJob();
        return this;
    }

    public JobApplicationSteps thenIShouldSeeJobsDetails() {
        jobScreen.assertToolBarTitleIsExpected();
        return this;
    }
}