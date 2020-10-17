package com.epam.task6.view;

import com.epam.task6.data.DataException;
import com.epam.task6.model.Book;

import java.util.List;

public interface Printer {

    void printListBooks(List<Book> books, String filename) throws DataException;

}
