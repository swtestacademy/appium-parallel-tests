package cucumber.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ThreadLocalDriver;

public class JobsDetailsSteps extends BaseSteps {

    @Before
    public void setupLoginSteps() {
        setupScreens(ThreadLocalDriver.getTLDriver());
    }

    @Given("Candidate is on the jobs listing screen")
    public void candidateIsOnTheJobsListingScreen() {
        splashScreen.skipSplashScreen();
        selectionScreen.clickIamSearchingJob();
        candidateMainScreen.allowNotification();
    }

    @When("Candidate opens a job which has index of {int}")
    public void candidateOpensTheIndexOfJobScreen(int index) {
        candidateMainScreen.clickToJob(index);
    }

    @Then("Candidate should see the jobs details")
    public void candidateShouldSeeTheJobsDetails() {
        jobScreen.assertToolBarTitleIsExpected();
    }
}
