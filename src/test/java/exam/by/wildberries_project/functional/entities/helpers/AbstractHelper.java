package exam.by.wildberries_project.functional.entities.helpers;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class AbstractHelper {
    AbstractPage abstractPage = new AbstractPage();

    public void quit(){
        abstractPage.getDriver().quit();
    }

}
