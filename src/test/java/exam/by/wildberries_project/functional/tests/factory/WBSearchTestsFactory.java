package exam.by.wildberries_project.functional.tests.factory;

import exam.by.wildberries_project.functional.tests.WBSearchTests;
import org.testng.annotations.Factory;

public class WBSearchTestsFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                //new WBSearchTests("платье"), new WBSearchTests("юбка"), new WBSearchTests("брюки")
        };
    }

}

