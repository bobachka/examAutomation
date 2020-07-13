package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBAllBrandsPage extends AbstractPage {
    private static String allBrandsLogo = "//h2[@class='our-brands-title']";
    private static String adidasLink = "//img[@title='Страница adidas']";

    public static WBAllBrandsPage getWildberriesAllBrandsPage() {
        WBAllBrandsPage allBrandsPage = new WBAllBrandsPage();
        waitForElementVisible(getElementBy(allBrandsLogo));
        System.out.println("Wildberries all brands page is opened");
        return allBrandsPage;
    }

    public WBAdidasPage clickAdidasLink() {
        getElement(adidasLink).click();
        return WBAdidasPage.getWildberriesAdidasPage();
    }
}
