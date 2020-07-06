package exam.by.wildberries_project.functional.entities.helpers;


import exam.by.wildberries_project.functional.entities.pages.WBSearchPage;

public class WBSearchHelper extends AbstractHelper{
    private WBSearchPage searchPage = new WBSearchPage();

    public int getSearchResultsPerPage() {
        return searchPage.getResultsPerPage();
    }

    public int getSearchResultsTotal() {
        return Integer.parseInt(searchPage.getResultsTotal().split(" ")[0]);
    }

    public boolean isResultsTitleExist() {
        return searchPage.isResultsTitleDisplayed();
    }

    public boolean isResultsReplacedExist() {
        return searchPage.isResultsReplacedDisplayed();
    }

    public int getSearchResultsTitleSize() {
        return searchPage.getResultsTitleSize();
    }
}
