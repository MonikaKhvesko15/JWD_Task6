package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Double.compare(firstBook.getPrice(), secondBook.getPrice());
    }
}
