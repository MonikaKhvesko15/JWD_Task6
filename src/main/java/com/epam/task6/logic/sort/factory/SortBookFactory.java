package com.epam.task6.logic.sort.factory;

import com.epam.task6.logic.Field;
import com.epam.task6.logic.search.AuthorSearch;
import com.epam.task6.logic.search.NumbOfPagesSearch;
import com.epam.task6.logic.search.PriceSearch;
import com.epam.task6.logic.search.TitleSearch;
import com.epam.task6.logic.sort.*;

public class SortBookFactory implements CreateSort {
    @Override
    public SortBook createSortBook(Field sortField) {
        switch (sortField) {
            case TITLE:
                return new TitleSort();
            case AUTHOR:
                return new AuthorSort();
            case PAGES:
                return new NumbOfPagesSort();
            case PRICE:
                return new PriceSort();
            default:
                throw new IllegalArgumentException("unknown this field" + sortField);
        }
    }
}
