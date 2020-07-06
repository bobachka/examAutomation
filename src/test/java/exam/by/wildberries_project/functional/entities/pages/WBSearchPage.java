package exam.by.wildberries_project.functional.entities.pages;

import org.openqa.selenium.WebElement;

public class WBSearchPage extends AbstractPage {
    private static String logo = "//a[@class=\"header-logo\"]";
    private static String results = "//div[@class=\"l_class\"]";
    private static String resultsCounter = "//span[@class = 'goods-count j-goods-count']";
    private static String resultsTitle = "//h1[@class = 'searching-results-title']";
    private static String resultsReplaced = "//span[@class = 'searching-results-text searching-results-text-replaced']";

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

}
