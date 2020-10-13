package com.epam.task6.logic.comparator;

import com.epam.task6.model.Book;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
