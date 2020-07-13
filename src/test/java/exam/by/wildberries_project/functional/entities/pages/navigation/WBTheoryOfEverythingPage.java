package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBTheoryOfEverythingPage extends AbstractPage {
    private static String theoryLogo = "//span[@class='name']";
    private static String addToCart = "//button[@class='c-btn-main-lg-v1 j-add-to-card']";
    private static String cart = "//a[@class='my-basket']";

    public static WBTheoryOfEverythingPage getTheoryOfEverythingPage() {
        WBTheoryOfEverythingPage theoryOfEverythingPage = new WBTheoryOfEverythingPage();
        waitForElementVisible(getElementBy(theoryLogo));
        System.out.println("Theory of everything page is opened");
        return theoryOfEverythingPage;
    }

    public WBTheoryOfEverythingPage clickAddToCartButton(){
        getElement(addToCart).click();
        return getTheoryOfEverythingPage();
    }

    public WBCartPage clickCartIcon(){
        getElement(cart).click();
        return WBCartPage.getCartContantsPage();
    }
}
