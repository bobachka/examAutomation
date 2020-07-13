package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBCartPage;

public class WBCartHelper extends AbstractHelper {
    private WBCartPage cartPage = new WBCartPage();

    public boolean checkTheoryOfEverythingPresentInCart() {
        return cartPage.isTheoryOfEverythingPresent();
    }
}
