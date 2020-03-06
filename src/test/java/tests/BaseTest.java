package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AppiumDriver<MobileElement> driver;
    private final static String APP_PACKAGE_NAME = "com.takeaway.android";
    private final static String APP_ACTIVITY_NAME = "com.takeaway.android.activity.RestaurantListActivity";

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "TestDevice");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("appPackage", APP_PACKAGE_NAME);
        cap.setCapability("appActivity", APP_ACTIVITY_NAME);

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}