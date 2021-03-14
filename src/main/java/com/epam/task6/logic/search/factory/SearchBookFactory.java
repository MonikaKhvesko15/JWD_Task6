package com.epam.task6.logic.search.factory;

import com.epam.task6.logic.Field;
import com.epam.task6.logic.search.*;

public class SearchBookFactory implements CreateSearch {
    @Override
    public SearchBook createSearchBook(Field searchField) {
        switch (searchField) {
            case TITLE:
                return new TitleSearch();
            case AUTHOR:
                return new AuthorSearch();
            case PAGES:
                return new NumbOfPagesSearch();
            case PRICE:
                return new PriceSearch();
            default:
                throw new IllegalArgumentException("unknown this field" + searchField);
        }
    }
}
