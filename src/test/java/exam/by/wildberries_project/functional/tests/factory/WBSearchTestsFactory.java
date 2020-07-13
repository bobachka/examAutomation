package exam.by.wildberries_project.functional.tests.factory;

import org.testng.annotations.Factory;

public class WBSearchTestsFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new WBSearchTestForFactory("платье"), new WBSearchTestForFactory("юбка"), new WBSearchTestForFactory("брюки")
        };
    }
}