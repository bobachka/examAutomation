package exam.by.wildberries_project.functional.entities.pages;

import org.openqa.selenium.Keys;

public class WBHomePage extends AbstractPage {
    private static String logo = "//a[@class='header-logo']";
    private static String searchFld = "//input[@id=\"tbSrch\"]";
    private static String searchBtn = "//span[@id=\"btnSrch\"]";

    public static WBHomePage getHomePage() {
        WBHomePage homePage = new WBHomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("Home page is opened");
        return homePage;
    }

    public WBHomePage navigateToHomePage() {
        openUrl(baseUrl);
        return getHomePage();
    }

    public WBHomePage fillSearchFld(String searchKey) {
        getElement(searchFld).sendKeys(searchKey);
        return getHomePage();
    }

    public WBSearchPage clickSearchBtn() {
        getElement(searchBtn).click();
        return WBSearchPage.getSearchPage();
    }

    public WBSearchPage pressEnterKey() {
        getElement(searchFld).sendKeys(Keys.ENTER);
        return WBSearchPage.getSearchPage();
    }
}
