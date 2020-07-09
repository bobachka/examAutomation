package exam.by.wildberries_project.functional.tests;

import exam.by.wildberries_project.functional.entities.helpers.WBHomeHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WBSearchTests {
    private WBHomeHelper homeHelper = new WBHomeHelper();
    private String searchKey = "jeans";

    // конструктор для фабрики
    //public WBSearchTests(String searchKey) {this.searchKey = searchKey;}


    @Test
    @Description(value = "Тест проверяет поиск по кнопке 'Поиск'")
    public void performSearchViaBtn() {
        int countPerPage = homeHelper.searchViaBtn(searchKey).getSearchResultsPerPage();
        System.out.println("Here are results for " + searchKey);
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }

    @Test
    @Description(value = "Тест проверяет поиск клавишей 'Enter'")
    public void performSearchViaEnter() {
        int countPerPage = homeHelper.searchViaEnter(searchKey).getSearchResultsPerPage();
        System.out.println("Here are results for " + searchKey);
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }


    @Test
    @Issue(value = "COVID-19")
    @Description(value = "Тест проверяет смену раскладки при поиске'")
    public void searchNumbers() {
        String searchKey = "k.,jdm";
        boolean resultsTitle = homeHelper.searchViaBtn(searchKey).isResultsReplacedExist();
        Assert.assertTrue(resultsTitle, "Key word is not replaced, but shouldn't be:");
    }

    @Test
    @Description(value = "Тест проверяет поиск по пустому значению")
    public void searchEmpty() {
        String searchKey = "";
        boolean resultsTitle = homeHelper.searchViaEnter(searchKey).isResultsTitleExist();
        Assert.assertFalse(resultsTitle, "Something is found, but shouldn't be:");
    }

    @Test
    @Description(value = "Тест проверяет ограничение на длину значения в поле поиска")
    public void searchMaxAmount() {
        String searchKey = "qwertqwertqwertqwe20qwertqwertqwertqwe40qwertqwertqwertqwe60qwertqwertqwertqwe80qwertqwertqwertqw100qwertqwertqwertqw120qwertqwertqwertqw140qwertqwertqwertqw160qwertqwertqwertqw180qwertqwertqwertqw200qwertqwertqwertqw220qwertqwertqwertqw240qwertqwertqwertqw220qwertqwertqwertqw280qwertqwertqwertqw300qwertqwertqwertqw320qwertqwertqwertqw340";
        int resultsTitleSize = homeHelper.searchViaEnter(searchKey).getSearchResultsTitleSize();
        Assert.assertEquals(resultsTitleSize, 300, "Search result key is not cropped to 300 chars:");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}
