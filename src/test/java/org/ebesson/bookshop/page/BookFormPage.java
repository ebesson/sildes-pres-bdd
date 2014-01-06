/**
 *
 *
 * @author gboullanger
 */
package org.ebesson.bookshop.page;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 */
public class BookFormPage extends BasePage {

    @FindBy(id = "book.title")
    private FluentWebElement title;

    @FindBy(id = "book.description")
    private FluentWebElement description;

    @FindBy(id = "save")
    private FluentWebElement save;

    @Override
    public String getUrl() {
        return new StringBuilder().append(BASE_PAGE).append("/#/book/new").toString();
    }

    /**
     * @param pTitle
     */
    public void setTitle(final String pTitle) {
        fill(title).with(pTitle);
    }

    /**
     * @param pDescription
     */
    public void setDescription(final String pDescription) {
        fill(description).with(pDescription);
    }

    public void save() {
        save.click();
    }

}
