package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBTheoryOfEverythingPage;

public class WBTheoryOfEverythingHelper extends AbstractHelper {
    private WBTheoryOfEverythingPage theoryOfEverythingPage = new WBTheoryOfEverythingPage();

    public WBCartHelper addBook() {
        theoryOfEverythingPage
                .clickAddToCartButton()
                .clickCartIcon();
        System.out.println("Add book to a cart and go to cart page!");
        return new WBCartHelper();
    }
}
