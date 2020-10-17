package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getAuthor().compareTo(secondBook.getAuthor());
    }
}
