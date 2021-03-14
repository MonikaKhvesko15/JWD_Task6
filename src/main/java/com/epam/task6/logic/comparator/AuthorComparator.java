package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();
        return firstAuthor.compareTo(secondAuthor);
    }
}
