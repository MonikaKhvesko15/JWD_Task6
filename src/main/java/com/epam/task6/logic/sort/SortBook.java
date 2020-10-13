package com.epam.task6.logic.sort;

import com.epam.task6.data.DataException;
import com.epam.task6.model.Book;

import java.util.Set;

public interface SortBook {
    Set<Book> sortBook(Set<Book> books) throws DataException;
}
