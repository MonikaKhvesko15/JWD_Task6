package com.epam.task6.logic.search.factory;

import com.epam.task6.logic.Field;
import com.epam.task6.logic.search.SearchBook;

public interface CreateSearch {
    SearchBook createSearchBook(Field searchField);
}
