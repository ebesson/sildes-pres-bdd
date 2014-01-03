package org.ebesson.bookshop.page;

import org.fluentlenium.core.FluentPage;

public class HomePage extends FluentPage {

    @Override
    public String getUrl() {
        return "http://localhost:8080/bookshop";
    }
}
