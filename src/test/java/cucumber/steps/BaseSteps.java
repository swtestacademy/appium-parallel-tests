package cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.CandidateMainScreen;
import screens.JobScreen;
import screens.SelectionScreen;
import screens.SplashScreen;

public class BaseSteps {
    protected SplashScreen        splashScreen;
    protected SelectionScreen     selectionScreen;
    protected CandidateMainScreen candidateMainScreen;
    protected JobScreen           jobScreen;

    public void setupScreens(AndroidDriver<MobileElement> driver) {
        splashScreen = new SplashScreen(driver);
        selectionScreen = new SelectionScreen(driver);
        candidateMainScreen = new CandidateMainScreen(driver);
        jobScreen = new JobScreen(driver);
    }
}