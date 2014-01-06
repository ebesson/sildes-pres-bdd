package org.ebesson.bookshop.step;

import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.cucumber.adapter.util.SharedDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 */
@SharedDriver(type = SharedDriver.SharedType.PER_SCENARIO)
public class BaseStep extends FluentTest {

    void start() {

        this.initFluent(new FirefoxDriver());
        this.initTest();
    }
}
