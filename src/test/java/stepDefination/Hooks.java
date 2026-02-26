package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseClass;

public class Hooks {

    BaseClass baseClass=new BaseClass();

    @Before
    public void before()
    {
        baseClass.init();
    }

    @After
    public void after()
    {
        BaseClass.driver.quit();
    }
}
