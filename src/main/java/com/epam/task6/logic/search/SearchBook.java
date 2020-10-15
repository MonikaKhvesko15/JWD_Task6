package com.epam.task6.logic.search;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;

import java.util.List;
import java.util.Set;

public interface SearchBook {
    List<Book> findBook(String value, List<Book> books) throws DataException;
}
