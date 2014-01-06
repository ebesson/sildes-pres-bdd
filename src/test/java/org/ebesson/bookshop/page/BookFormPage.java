/**
 *
 *
 * @author gboullanger
 */
package org.ebesson.bookshop.page;

/**
 *
 */
public class BookFormPage extends BasePage {

    @Override
    public String getUrl() {
        return new StringBuilder().append(BASE_PAGE).append("/#/book/list").toString();
    }

}
