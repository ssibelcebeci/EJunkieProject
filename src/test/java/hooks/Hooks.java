package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseDriver;

public class Hooks extends BaseDriver {

    @Before
    public void beforeScenario() {
        setUp();
    }

    @After
    public void afterScenario() {
        tearDown();
    }
}
