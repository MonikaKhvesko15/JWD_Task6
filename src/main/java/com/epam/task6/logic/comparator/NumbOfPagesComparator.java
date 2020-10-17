package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class NumbOfPagesComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Integer.compare(firstBook.getNumbOfPages(), secondBook.getNumbOfPages());
    }
}
