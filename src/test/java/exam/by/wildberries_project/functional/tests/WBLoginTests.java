package exam.by.wildberries_project.functional.tests;

import exam.by.wildberries_project.functional.entities.helpers.WBHomeHelper;
import exam.by.wildberries_project.functional.entities.helpers.login.WBConfirmHelper;
import exam.by.wildberries_project.functional.entities.helpers.login.WBLoginHelper;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class WBLoginTests {
    private WBHomeHelper homeHelper = new WBHomeHelper();
    private WBLoginHelper loginHelper = new WBLoginHelper();
    private WBConfirmHelper confirmHelper = new WBConfirmHelper();

    @Test
    @Description(value = "Тест проверяет ввод валидных значений в поле 'Контактный телефон'")
    public void validInputInPhoneField() {
        int phoneKey = ((int) (Math.random() * 999_999_999) +100_000_000);
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(String.valueOf(phoneKey));
        System.out.println("Valid input in phone field test passed");
        Assert.assertTrue(confirmHelper.displayConfirmPage(), "Valid input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет ввод букв(латиницы)")
    public void latinInputInPhoneField() {
        String phoneKey = "qwertyu";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid letter in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Latin input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет ввод букв(кириллицы)")
    public void cyrillicInputInPhoneField() {
        String phoneKey = "привет";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid letter in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Cyrillic input failed: ");
    }
    @Test
    @Description(value = "Тест проверяет ввод короткого значения")
    public void shortInputInPhoneField() {
        String phoneKey = "12";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid input in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Short input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет ввод длинного значения")
    public void longInPhoneField() {
        String phoneKey = "301941595156548951568515655065140";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid long input in phone field test passed");
        Assert.assertTrue(confirmHelper.displayConfirmPage(), "Long input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет ввод спецсимволов")
    public void specialCharsInputInPhoneField() {
        String phoneKey = "!@#$%^&";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid symbols in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Special characters input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет пустой ввод")
    public void emptyInputInPhoneField() {
        String phoneKey = "";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid no input in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Empty input failed: ");
    }

    @Test
    @Description(value = "Тест проверяет ввод пробелов")
    public void spaceInputInPhoneField() {
        String phoneKey = "       ";
        homeHelper.navigateToHomePage();
        homeHelper.clickLoginBtn();
        loginHelper.fillInPhoneField(phoneKey);
        System.out.println("Invalid spaces input in phone field test passed");
        Assert.assertTrue(loginHelper.isErrorMessageDisplayed(), "Space input failed: ");
    }

    @AfterSuite
    public void tearDown() {
        homeHelper.quit();
    }
}
