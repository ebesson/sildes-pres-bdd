package org.ebesson.bookshop;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = { "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }, features = "classpath:org/ebesson/bookshop/step")
public class BasicRunner {

}
