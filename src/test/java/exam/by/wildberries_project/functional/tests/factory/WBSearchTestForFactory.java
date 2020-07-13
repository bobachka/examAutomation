package exam.by.wildberries_project.functional.tests.factory;

import exam.by.wildberries_project.functional.entities.helpers.WBHomeHelper;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class WBSearchTestForFactory {
    private WBHomeHelper homeHelper = new WBHomeHelper();
    private String searchKey = "jeans";

    public WBSearchTestForFactory(String searchKey) {
        this.searchKey = searchKey;
    }

    @Test
    @Description(value = "Тест проверяет поиск, используя factory")
    public void performSearchViaBtn() {
        int countPerPage = homeHelper.searchViaBtn(searchKey).getSearchResultsPerPage();
        System.out.println("Here are TestForFactory results for " + searchKey);
        Assert.assertTrue(countPerPage > 0, "Nothing is found: ");
    }

    @AfterSuite
    public void tearDown() {
        homeHelper.quit();
    }
}