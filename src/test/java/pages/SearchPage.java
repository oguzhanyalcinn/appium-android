package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchPage extends BasePage{

    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.takeaway.android:id/restaurantListHeroText")
    private AndroidElement suggestion;

    public void suggestionIsDisplayed() {
        isDisplayed(suggestion);
    }

    public void clickOnSuggestion() {
        click(suggestion);
    }
}
