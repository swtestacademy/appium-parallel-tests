package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import screens.CandidateMainScreen;
import screens.SelectionScreen;
import screens.SplashScreen;

public class BaseTest {

    public    AndroidDriver<MobileElement> driver;
    public    WebDriverWait                wait;
    private   ThreadLocalDriver            threadLocalDriver   = new ThreadLocalDriver();

    //Base Screens for all cases
    protected SplashScreen                 splashScreen        = null;
    protected SelectionScreen              selectionScreen     = null;
    protected CandidateMainScreen          candidateMainScreen = null;

    @BeforeMethod
    @Parameters({ "udid", "platformVersion" })
    public void setup(String udid, String platformVersion) throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("udid", udid);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.isinolsun.app");
        caps.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("noReset", "false");
        threadLocalDriver.setTLDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4444/wd/hub"), caps));
        driver = threadLocalDriver.getTLDriver();
        wait = new WebDriverWait(driver, 10);

        //Unlock the device if it is locked.
        //final Runtime rt = Runtime.getRuntime();
        //rt.exec("adb shell input keyevent 224");

        //Base Screen Initialization
        splashScreen = new SplashScreen(driver);
        selectionScreen = new SelectionScreen(driver);
        candidateMainScreen = new CandidateMainScreen(driver);
    }

    @AfterMethod
    public synchronized void teardown() {
        driver.quit();
    }

}
