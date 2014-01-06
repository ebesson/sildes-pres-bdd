/**
 *
 *
 * @author ebesson
 */
package org.ebesson.bookshop.step;

import org.ebesson.bookshop.page.BookFormPage;
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
public class BooksStep extends BaseStep {

    @Page
    private BookFormPage bookFormPage;

    @Page
    private HomePage homePage;

    @Given("^je suis sur la page d'accueil$")
    public void je_suis_sur_la_page_d_accueil() {
        start();
        goTo(homePage);
    }

    @When("^je clique sur le bouton d ajout$")
    public void je_clique_sur_le_bouton_d_ajout() {
        homePage.clicAjouterLivre();
    }

    @Then("^le forumlaire de creation est affichée$")
    public void le_forumlaire_de_creation_est_affiche() throws Throwable {
        Assert.assertTrue(pageSource().contains("New Book"));
    }

    @Before
    public void before() {

    }

    @After
    public void after() {
        this.quit();
    }
}
