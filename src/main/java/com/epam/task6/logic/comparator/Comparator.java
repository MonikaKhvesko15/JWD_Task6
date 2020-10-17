package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public interface Comparator<T> extends java.util.Comparator<T> {
    int compare(Book firstBook, Book secondBook);

    @Override
    int compare(T firstBook, T secondBook);

    @Override
    boolean equals(Object obj);
}
