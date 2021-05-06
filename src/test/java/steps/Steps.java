package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps {
    public JobApplicationSteps jobApplicationSteps;

    public Steps (AndroidDriver<MobileElement> driver){
        this.jobApplicationSteps = new JobApplicationSteps(driver);
    }

}
