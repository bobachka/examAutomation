package exam.by.wildberries_project.functional.entities.pages;

import exam.by.wildberries_project.functional.entities.pages.login.WBLoginPage;
import exam.by.wildberries_project.functional.entities.pages.navigation.*;
import exam.by.wildberries_project.functional.entities.pages.search.WBSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class WBHomePage extends AbstractPage {
    private static String logo = "//a[@class='header-logo']";
    //private static String logo = "//img[@alt='Wildberries']";
    private static String searchFld = "//input[@id=\"tbSrch\"]";
    private static String searchBtn = "//span[@id=\"btnSrch\"]";
    private static String loginBtn = "//*[@id=\"basketContent\"]/div[2]/a";
    private static String vkLink = "//a[@href='http://vk.com/club42631504']";
    private static String bottomLabel = "//span[(contains(text(),'Мы в соцсетях'))]";
    private static String faqLink = "//a[@class='faq-btn']";
    private static String cityLocation = "//li[@class='geocity item']/child::*";
    private static String cityInputFld = "//input[@id='geo-city-input']";
    private static String cityLidaSearch = "//div[@title='Лида|г Лида, Беларусь, Гродненская обл|']";
    private static String cityLidaLocation = "//span[(contains(text(),'Лида'))]";
    private static String guideLogo = "//a[@aria-label='Гид по Wildberries']";
    private static String wbKidsLink = "//a[@href='https://wbkids.ru' and (contains(text(),'WB Kids'))]";
    private static String countriesLink = "//span[(contains(text(),'Сменить страну'))]";
    private static String polandLink = "//a[@href='https://pl.wildberries.eu']";
    private static String rentLink = "//a[@href='https://www.wildberries.by/promo/rent']";
    private static String popularBrandsLogo = "//h3[@class='c-h1 title']";
    private static String popularBrandsLink = "//a[@class='see-all']";
    private static String paymentOptionsLink = "//a[@href='https://www.wildberries.by/services/sposoby-oplaty']";
    private static String youTubeLink = "//a[@href='https://www.youtube.com/Wildberriesshop']";
    private static String twitterLink = "//a[@href='https://twitter.com/wildberries_ru']";
    private static String instagramLink = "//a[@href='http://instagram.com/wildberriesru']";
    private static String facebookLink = "//a[@href='http://www.facebook.com/wildberries.by']";


    public static WBHomePage getHomePage() {
        WBHomePage homePage = new WBHomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("Home page is opened");
        return homePage;
    }

    public WBHomePage navigateToWBHomePage() {
        openUrl(baseUrl);
        return getHomePage();
    }

    public boolean isLogoPresent() {
        changeWindow();
        if (getElement(logo).isDisplayed()) {
            System.out.println("Home logo is present!");
            return true;
        } else {
            System.out.println("Logo is not displayed!");
            return false;
        }
    }

    public WBHomePage fillSearchFld(String searchKey) {
        //        waitForElementVisible(getElementBy(searchField));
        getElement(searchFld).sendKeys(searchKey);
        return getHomePage();
    }

    public WBSearchPage clickSearchBtn() {
        //        waitForElementVisible(getElementBy(searchField));
        getElement(searchBtn).click();
        return WBSearchPage.getSearchPage();
    }

    public WBSearchPage pressEnterKey() {
        getElement(searchFld).sendKeys(Keys.ENTER);
        return WBSearchPage.getSearchPage();
    }

    public WBLoginPage clickLoginBtn() {
        waitForElementVisible(getElementBy(loginBtn));
        getElement(loginBtn).click();
        return WBLoginPage.getWbLoginPage();
    }

    public WBVkPage clickVkLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(vkLink).click();
        return WBVkPage.getVkWildberriesPage();
    }

    public WBFaqPage clickFaqLink() {
        getElement(faqLink).click();
        return WBFaqPage.getFAQPage();
    }

    public WBHomePage clickCityLink() {
        getElement(cityLocation).click();
        wait(500);
        return getHomePage();
    }

    public WBHomePage enterNewCity(String searchKey) {
        getElement(cityInputFld).sendKeys(searchKey);
        wait(500);
        return getHomePage();
    }

    public WBHomePage changeCityToLida() {
        getElement(cityLidaSearch).click();
        wait(500);
        return getHomePage();
    }

    public boolean checkCity() {
        return getElement(cityLidaLocation).isDisplayed();
    }

    public WBKidsPage clickKidsLink() {
        hoverOnItem(guideLogo);
        getElement(wbKidsLink).click();
        changeWindow();
        return WBKidsPage.getWildberriesKidsPage();
    }

    public WBPolishPage clickPolandLink() {
        hoverOnItem(countriesLink);
        getElement(polandLink).click();
        return WBPolishPage.getWildberriesPolishPage();
    }

    public WBRentPage clickRentPageLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(rentLink).click();
        changeWindow();
        return WBRentPage.getWildberriesRentPage();
    }

    public WBAllBrandsPage clickAllBrandsLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(popularBrandsLogo));
        scroll.perform();
        getElement(popularBrandsLink).click();
        return WBAllBrandsPage.getWildberriesAllBrandsPage();
    }

    public WBPaymentOptionsPage clickPaymentOptionsLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(paymentOptionsLink).click();
        return WBPaymentOptionsPage.getPaymentOptionsPage();
    }

    public WBYoutubePage clickYoutubeLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(youTubeLink).click();
        return WBYoutubePage.getYoutubePage();
    }

    public WBTwitterPage clickTwitterLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(twitterLink).click();
        return WBTwitterPage.getTwitterPage();
    }

    public WBInstagramPage clickInstagramLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(instagramLink).click();
        return WBInstagramPage.getInstagramPage();
    }

    public WBFacebookPage clickFacebookLink() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(facebookLink).click();
        return WBFacebookPage.getFacebookPage();
    }
}