package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBRentPage;

public class WBRentHelper extends AbstractHelper {
    private WBRentPage rentPage = new WBRentPage();

    public boolean checkRentLogo() {
        return rentPage.isWbRentPageLogoIsPresent();
    }
}
