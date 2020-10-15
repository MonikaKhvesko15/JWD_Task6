package com.epam.task6.logic.sort;

import com.epam.task6.data.DataException;
import com.epam.task6.model.Book;

import java.util.List;
import java.util.Set;

public interface SortBook {
    List<Book> sortBook(List<Book> books) throws DataException;
}
