package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBAllBrandsPage;

public class WBAllBrandsHelper extends AbstractHelper {
    private WBAllBrandsPage allBrandsPage = new WBAllBrandsPage();

    public WBAdidasHelper goAdidasPage() {
        allBrandsPage.clickAdidasLink();
        return new WBAdidasHelper();
    }
}
