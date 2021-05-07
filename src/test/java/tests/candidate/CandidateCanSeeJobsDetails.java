package tests.candidate;

import org.testng.annotations.Test;
import tests.BaseTest;

public class CandidateCanSeeJobsDetails extends BaseTest {
    @Test
    public void CandidateCanSeeJobsDetailsTest() {
       steps.jobDetailsSteps
           .givenIAmOnJobsListingPage()
           .whenIClickToJob()
           .thenIShouldSeeJobDetails();
    }
}