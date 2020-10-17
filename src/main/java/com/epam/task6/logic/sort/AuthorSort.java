package com.epam.task6.logic.sort;

import com.epam.task6.logic.comparator.AuthorComparator;
import com.epam.task6.model.Book;

import java.util.*;

public class AuthorSort implements SortBook {

    @Override
    public List<Book> sortBook(List<Book> books) {
        Comparator<Book> comparator = new AuthorComparator();
        List<Book> booksSorted = new ArrayList<>(books);

        Collections.sort(booksSorted, comparator);

        return booksSorted;
    }
}
