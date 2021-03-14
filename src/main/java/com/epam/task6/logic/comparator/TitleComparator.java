package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();
        return firstTitle.compareTo(secondTitle);
    }
}
