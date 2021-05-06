package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {
    private static final ThreadLocal<AndroidDriver<MobileElement>> tlDriver = new ThreadLocal<>();

    public synchronized void setTLDriver(AndroidDriver<MobileElement> driver) { tlDriver.set(driver); }

    public synchronized AndroidDriver<MobileElement> getTLDriver() {
        return tlDriver.get();
    }
}
