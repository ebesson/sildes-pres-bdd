package org.ebesson.bookshop.page;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "button-add")
    private FluentWebElement createButton;

    @Override
    public String getUrl() {
        return BASE_PAGE;
    }

    public void clicAjouterLivre() {
        createButton.click();
    }
}
