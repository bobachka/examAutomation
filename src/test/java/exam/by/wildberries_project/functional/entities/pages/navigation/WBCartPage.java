package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBCartPage extends AbstractPage {
    private static String cartPageLogo = "//h3[@class='bold']";
    private static String theoryInCart = "//span[(contains(text(),'Теория Всего'))]";

    public static WBCartPage getCartContantsPage() {
        WBCartPage cartPage = new WBCartPage();
        waitForElementVisible(getElementBy(cartPageLogo));
        System.out.println("Cart page is opened");
        return cartPage;
    }

    public boolean isTheoryOfEverythingPresent() {
        if (getElement(theoryInCart).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}
