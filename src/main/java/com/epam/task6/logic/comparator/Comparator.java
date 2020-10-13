package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public interface Comparator<T> extends java.util.Comparator<T> {
    public int compare(Book o1, Book o2);

    @Override
    int compare(T o1, T o2);

    @Override
    boolean equals(Object obj);
}
