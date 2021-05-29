package stepdefinitions;

import cucumber.api.java.After;
import utils.TodoUtil;

public class UIHooks {
    @After(value = "@UI")
    public void quitBrowser() {
        TodoUtil.driver.quit();
    }
}
