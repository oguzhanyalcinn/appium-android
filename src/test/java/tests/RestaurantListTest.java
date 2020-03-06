package tests;

import org.testng.annotations.Test;
import pages.CountryListPage;
import pages.RestaurantListPage;
import pages.SearchPage;

public class RestaurantListTest extends BaseTest {

    @Test
    public void noRestaurantListedWhenTheAppOpenFirstTime() {
        CountryListPage countryListPage = new CountryListPage(driver);
        RestaurantListPage homePage = new RestaurantListPage(driver);

        countryListPage.selectNetherlands();
        homePage.noRestaurantDisplayed();
    }

    @Test
    public void enterPostCodeAndSeeRestaurants() {
        String postcode = "7513CX";

        CountryListPage countryListPage = new CountryListPage(driver);
        RestaurantListPage homePage = new RestaurantListPage(driver);
        SearchPage searchPage = new SearchPage(driver);

        countryListPage.selectNetherlands();
        homePage.locationButtonIsDisplayed();
        homePage.enterLocation(postcode);
        searchPage.suggestionIsDisplayed();
        searchPage.clickOnSuggestion();
        homePage.locationButtonIsDisplayed();
        homePage.locationIsSet("7513 Enschede");
    }
}