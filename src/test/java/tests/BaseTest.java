package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import steps.Steps;
import utilities.DesiredCapabilitiesUtil;
import utilities.ThreadLocalDriver;

public class BaseTest {
    public        AndroidDriver<MobileElement> driver;
    private final ThreadLocalDriver            threadLocalDriver       = new ThreadLocalDriver();
    private final DesiredCapabilitiesUtil      desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();
    protected     Steps                        steps;

    @BeforeMethod
    @Parameters({ "udid", "platformVersion" })
    public void setup(String udid, String platformVersion) throws IOException {
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid, platformVersion);
        threadLocalDriver.setTLDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4444/wd/hub"), caps));
        driver = threadLocalDriver.getTLDriver();
        steps = new Steps(driver);
    }

    @AfterMethod
    public synchronized void teardown() {
        driver.quit();
    }

}
