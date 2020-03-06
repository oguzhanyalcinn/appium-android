package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CountryListPage extends BasePage {

    public CountryListPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.takeaway.android:drawable/ic_nl")
    private AndroidElement netherlandFlag;

    public void selectNetherlands() {
        click(netherlandFlag);
    }
}
