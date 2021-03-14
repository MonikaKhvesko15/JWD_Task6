package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int firstPrice = (int) firstBook.getPrice();
        int secondPrice = (int) secondBook.getPrice();
        return Integer.compare(firstPrice, secondPrice);
    }
}
