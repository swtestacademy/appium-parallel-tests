package tests.candidate;

import org.testng.annotations.Test;
import tests.BaseTest;

public class UserCanSeeJobsDetails extends BaseTest {
    @Test
    public void UserCanSeeJobsDetailsTest () {
       steps.jobApplicationSteps
           .givenIAmOnJobsListingPage()
           .whenIClickToJob()
           .thenIShouldSeeJobsDetails();
    }
}