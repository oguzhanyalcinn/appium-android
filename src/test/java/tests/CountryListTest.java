package tests;

import org.testng.annotations.Test;
import pages.CountryListPage;
import pages.RestaurantListPage;

public class CountryListTest extends BaseTest {

    @Test
    public void checkListAndSelectNetherlands() {
        CountryListPage countryListPage = new CountryListPage(driver);
        RestaurantListPage homePage = new RestaurantListPage(driver);

        countryListPage.selectNetherlands();
        homePage.locationButtonIsDisplayed();
    }
}
