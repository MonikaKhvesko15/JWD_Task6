package com.epam.task6.logic.sort;

import com.epam.task6.logic.comparator.TitleComparator;
import com.epam.task6.model.Book;

import java.util.*;


public class TitleSort implements SortBook {
    @Override
    public List<Book> sortBook(List<Book> books) {
        Comparator<Book> comparator = new TitleComparator();
        List<Book> booksSorted = new ArrayList<>(books);

        Collections.sort(booksSorted, comparator);

        return booksSorted;
    }
}
