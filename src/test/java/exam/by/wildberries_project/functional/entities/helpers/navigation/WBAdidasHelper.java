package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBAdidasPage;

public class WBAdidasHelper extends AbstractHelper {
    private WBAdidasPage adidasPage = new WBAdidasPage();

    public boolean checkAdidasLogo() {
        return adidasPage.isAdidasLogoPresent();
    }
}
