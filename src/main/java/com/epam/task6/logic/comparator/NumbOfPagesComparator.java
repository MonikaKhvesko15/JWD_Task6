package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class NumbOfPagesComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        int firstPages = firstBook.getNumbOfPages();
        int secondPages = secondBook.getNumbOfPages();
        return Integer.compare(firstPages, secondPages);
    }
}
