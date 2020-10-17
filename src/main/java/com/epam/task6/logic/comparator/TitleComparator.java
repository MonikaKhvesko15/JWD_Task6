package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }
}
