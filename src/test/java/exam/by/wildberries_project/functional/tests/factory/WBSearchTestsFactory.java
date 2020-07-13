package exam.by.wildberries_project.functional.tests.factory;

import org.testng.annotations.Factory;

public class WBSearchTestsFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new WBSearchTestForFactory("adidas"), new WBSearchTestForFactory("asos"), new WBSearchTestForFactory("nike")
        };
    }
}