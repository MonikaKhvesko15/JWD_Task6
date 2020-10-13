package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class NumbOfPagesComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getNumbOfPages(), o2.getNumbOfPages());
    }
}
