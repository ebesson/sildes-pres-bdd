package org.ebesson.bookshop.step;

import org.ebesson.bookshop.page.HomePage;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 *
 */

public class HomeStep extends BaseStep {

    @Page
    private HomePage page;

    @Given("^je demarre mon navigateur$")
    public void je_demarre_mon_navigateur() {
        start();
    }

    @When("^je vais sur la page d accueil$")
    public void je_vais_sur_la_page_d_accueil() {
        goTo(page);
        page.isAt();
    }

    @Then("^le titre est affichée$")
    public void le_titre_est_affichee() throws Throwable {
        Assert.assertTrue(title().contains("My Book Shop"));
    }

    @Before
    public void before() {

    }

    @After
    public void after() {
        this.quit();
    }
}
