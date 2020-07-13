package exam.by.wildberries_project.functional.entities.helpers.login;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.login.WBConfirmPage;

public class WBConfirmHelper extends AbstractHelper {
    WBConfirmPage confirmPage = new WBConfirmPage();

    public boolean displayConfirmPage() {
        System.out.println("Confirm page is opened!");
        return confirmPage.getWbConfirmPage();
    }
}
