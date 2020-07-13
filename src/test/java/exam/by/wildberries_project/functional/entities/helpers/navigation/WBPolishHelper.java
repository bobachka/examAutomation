package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBPolishPage;

public class WBPolishHelper extends AbstractHelper {
    private WBPolishPage polishPage = new WBPolishPage();

    public boolean checkPolishLogo() {
        return polishPage.checkPageIsPolish();
    }
}
