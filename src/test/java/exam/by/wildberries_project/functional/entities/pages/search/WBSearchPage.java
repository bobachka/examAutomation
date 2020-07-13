package exam.by.wildberries_project.functional.entities.pages.search;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBTheoryOfEverythingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WBSearchPage extends AbstractPage {
    private static String results = "//div[@class=\"l_class\"]";
    private static String resultsCounter = "//span[@class = 'goods-count j-goods-count']";
    private static String resultsTitle = "//h1[@class = 'searching-results-title']";
    private static String resultsReplaced = "//span[@class = 'searching-results-text searching-results-text-replaced']";
    private static String theory = "//img[@alt='Теория Всего Издательство АСТ']";
    private static String priceFilter = "//*[@id=\"price\"]";
    private static String brand = "//input[@id=\"tBrandSearch\"]";
    private static String domiraCheckbox = "//*[@id=\"brand_list_left\"]/label";
    private static String pagination = "//a[@class=\"pagination-next\"]";
    private static String result1 = "//div[@id=\"c11847653\"]";
    private static String result2 = "//div[@id=\"c13015586\"]";
    private static String result3 = "//div[@id=\"c11396172\"]";

    public static WBSearchPage getSearchPage() {
        WBSearchPage searchPage = new WBSearchPage();
        System.out.println("Search page is opened");
        return searchPage;
    }

    public int getResultsPerPage() {
        return getElements(results).size();
    }

    public String getResultsTotal() {
        return getElement(resultsCounter).getText();
    }

    public boolean isResultsTitleDisplayed() {
        WebElement element = getElement(resultsTitle);
        if (element == null) {
            return false;
        } else
            return element.isDisplayed();
    }

    public int getResultsTitleSize() {
        return getElement(resultsTitle).getText().length();
    }

    public boolean isResultsReplacedDisplayed() {
        return getElement(resultsReplaced).isDisplayed();
    }

    public WBTheoryOfEverythingPage clickTheoryOfEverything() {
        getElement(theory).click();
        return WBTheoryOfEverythingPage.getTheoryOfEverythingPage();
    }

    public WBSearchPage clickPriceFilter() {
        waitForElementVisible(getElementBy(priceFilter));
        getElement(priceFilter).click();
        return getSearchPage();
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) AbstractPage.getDriver();
        js.executeScript("window.scrollBy(0,900)");
    }

    public void scrollPageToFoot() {
        JavascriptExecutor js = (JavascriptExecutor) AbstractPage.getDriver();
        js.executeScript("window.scrollBy(0,100000)");
    }

    public WBSearchPage clickNextPage() {
        waitForElementVisible(getElementBy(pagination));
        getElement(pagination).click();
        return getSearchPage();
    }

    public boolean isResultFound1() {
        WebElement res = getElement(result1);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public boolean isResultFound2() {
        WebElement res = getElement(result2);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public WBSearchPage inputBrand(String searchKey) {
        waitForElementVisible(getElementBy(brand));
        getElement(brand).sendKeys(searchKey);
        return getSearchPage();
    }

    public WBSearchPage enableDomiraCheckbox() {
        waitForElementVisible(getElementBy(domiraCheckbox));
        getElement(domiraCheckbox).click();
        return getSearchPage();
    }

    public boolean isResultFound3() {
        WebElement res = getElement(result3);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }
}
