package exam.by.wildberries_project.functional.entities.helpers;

import exam.by.wildberries_project.functional.entities.pages.WBHomePage;

public class WBHomeHelper extends AbstractHelper {
    private WBHomePage homePage = new WBHomePage();

    public WBHomeHelper navigateToHomePage() {
        System.out.println("Go to home page");
        homePage.navigateToHomePage();
        return this;
    }

    public WBSearchHelper searchViaBtn(String searchKey) {
        navigateToHomePage();
        homePage.fillSearchFld(searchKey).clickSearchBtn();
        return new WBSearchHelper();
    }

    public WBSearchHelper searchViaEnter (String searchKey) {
        navigateToHomePage();
        homePage.fillSearchFld(searchKey).pressEnterKey();
        return new WBSearchHelper();
    }
}