package org.ebesson.bookshop.step;

import org.ebesson.bookshop.page.HomePage;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.cucumber.adapter.util.SharedDriver;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 *
 */
@SharedDriver(type = SharedDriver.SharedType.PER_SCENARIO)
public class HomeStep extends FluentTest {

    @Page
    HomePage page;

    @Before
    public void before() {
        this.initFluent(new FirefoxDriver());
        this.initTest();
    }

    @Given("^je demarre mon navigateur$")
    public void je_demarre_mon_navigateur() {

    }

    @When("^je vais sur la page d accueil$")
    public void je_vais_sur_la_pag_d_accueil() {
        goTo(page);
    }

    @Then("^le titre est affichee$")
    public void le_titre_est_affichee() throws Throwable {
        Assert.assertTrue(title().contains("My Book Shop"));
    }

    @After
    public void after() {
        this.quit();
    }
}
