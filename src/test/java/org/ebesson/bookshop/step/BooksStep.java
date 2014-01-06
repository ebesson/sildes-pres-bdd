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
import cucumber.api.java.en.And;
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

    @Before
    public void before() {

    }

    @After
    public void after() {
        this.quit();
    }

    /*
     * Scenario: Affichage du formulaire de création d'un livre
     */

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

    /*
     * Scenario: Création d'un livre
     */
    @Given("^je suis sur le formulaire de création d'un livre$")
    public void je_suis_sur_le_formulaire_de_creation() {
        start();
        goTo(bookFormPage);
    }

    @When("^je saisi un titre$")
    public void je_saisi_un_titre() {
        bookFormPage.setTitle("Essai");
    }

    @And("^je saisi un titre une description$")
    public void je_saisi_une_description() {
        bookFormPage.setDescription("Desc");
    }

    @And("^que je valide$")
    public void je_valide() {
        bookFormPage.save();
    }

    @Then("^le livre est cree$")
    public void le_livre_est_cree() throws Throwable {
        Assert.assertTrue(getDriver().getPageSource().contains("List of books"));
    }
}
