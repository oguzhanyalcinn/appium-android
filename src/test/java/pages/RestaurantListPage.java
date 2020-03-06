package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RestaurantListPage extends BasePage {

    public RestaurantListPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Select your location")
    private AndroidElement locationButton;

    @AndroidFindBy(accessibility = "No delivery restaurants")
    private AndroidElement noDeliveryRestaurant;

    @AndroidFindBy(id = "com.takeaway.android:id/searchInput")
    private AndroidElement searchInput;

    public void locationButtonIsDisplayed() {
        isDisplayed(locationButton);
    }

    public void enterLocation(String postcode) {
        isDisplayed(locationButton);
        click(locationButton);
        searchInput.sendKeys(postcode);
    }

    public void noRestaurantDisplayed(){
        isDisplayed(noDeliveryRestaurant);
    }

    public void locationIsSet(String text){
        isTextDisplayed(locationButton,text);
    }
}