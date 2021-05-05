package tests.candidate;

import org.testng.annotations.Test;
import tests.BaseTest;

public class ApplyToJob extends BaseTest {

    @Test
    public void applyToJob () {
        splashScreen.skipSplashScreen();
        selectionScreen.selectIsAriyorum();
        candidateMainScreen.allowNotification();
        candidateMainScreen.clickToJob();
    }
}
