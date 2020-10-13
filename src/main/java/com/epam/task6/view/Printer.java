package com.epam.task6.view;

import com.epam.task6.model.Book;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface Printer {

    void printSetBooks(Set<Book> books, String filename) throws IOException, Exception;

}
