package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBTwitterPage;

public class WBTwitterHelper extends AbstractHelper {
    private WBTwitterPage twitterPage = new WBTwitterPage();

    public boolean checkTwitterLogo() {
        return twitterPage.isTwitterLogoPresent();
    }
}
