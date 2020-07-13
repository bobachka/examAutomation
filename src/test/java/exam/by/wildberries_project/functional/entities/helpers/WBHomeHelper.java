package exam.by.wildberries_project.functional.entities.helpers;

import exam.by.wildberries_project.functional.entities.helpers.navigation.*;
import exam.by.wildberries_project.functional.entities.helpers.search.WBSearchHelper;
import exam.by.wildberries_project.functional.entities.pages.WBHomePage;
import exam.by.wildberries_project.functional.entities.pages.login.WBLoginPage;

public class WBHomeHelper extends AbstractHelper {
    private WBHomePage homePage = new WBHomePage();

    public WBHomeHelper navigateToHomePage() {
        homePage.navigateToWBHomePage();
        return this;
    }

    public WBSearchHelper searchViaBtn(String searchKey) {
        navigateToHomePage();
        homePage.fillSearchFld(searchKey).clickSearchBtn();
        return new WBSearchHelper();
    }

    public WBSearchHelper searchViaEnter(String searchKey) {
        navigateToHomePage();
        homePage.fillSearchFld(searchKey).pressEnterKey();
        return new WBSearchHelper();
    }

    public WBSearchHelper searchBook(String searchKey) {
        navigateToHomePage();
        homePage
                .fillSearchFld(searchKey)
                .clickSearchBtn();

        return new WBSearchHelper();
    }

    public WBVkHelper goToVkPage() {
        homePage.clickVkLink();
        return new WBVkHelper();
    }

    public boolean checkHomeLogo() {
        return homePage.isLogoPresent();
    }

    public WBFaqHelper goToFaqPage() {
        homePage.clickFaqLink();
        return new WBFaqHelper();
    }

    public boolean checkLocationChange(String searchKey) {
        return homePage
                .clickCityLink()
                .enterNewCity(searchKey)
                .changeCityToLida()
                .checkCity();
    }

    public WBKidsHelper goToKidsPage() {
        homePage.clickKidsLink();
        return new WBKidsHelper();
    }

    public WBPolishHelper goToPolishPage() {
        homePage.clickPolandLink();
        return new WBPolishHelper();
    }

    public WBRentHelper goToRentPage() {
        homePage.clickRentPageLink();
        return new WBRentHelper();
    }

    public WBAllBrandsHelper goToAllBrandsPage() {
        homePage.clickAllBrandsLink();
        return new WBAllBrandsHelper();
    }

    public WBPaymentOptionsHelper goToPaymentOptionsPage() {
        homePage.clickPaymentOptionsLink();
        return new WBPaymentOptionsHelper();
    }

    public WBYoutubeHelper goToYoutubePage() {
        homePage.clickYoutubeLink();
        return new WBYoutubeHelper();
    }

    public WBTwitterHelper goToTwitterPage() {
        homePage.clickTwitterLink();
        return new WBTwitterHelper();
    }

    public WBInstagramHelper goToInstagramPage() {
        homePage.clickInstagramLink();
        return new WBInstagramHelper();
    }

    public WBFacebookHelper goToFacebookPage() {
        homePage.clickFacebookLink();
        return new WBFacebookHelper();
    }

    public WBLoginPage clickLoginBtn() {
        homePage.clickLoginBtn();
        return new WBLoginPage();
    }
}
