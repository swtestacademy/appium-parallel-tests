package tests.candidate;

import org.testng.annotations.Test;
import tests.BaseTest;

public class AppiumMobileActions extends BaseTest {
    @Test
    public void MobileActionsTest() {
       steps.jobDetailsSteps
           .givenIAmOnJobsListingPage()
           .whenIDoMobileActionsAndClickToJob()
           .thenIShouldSeeJobDetails();
    }
}