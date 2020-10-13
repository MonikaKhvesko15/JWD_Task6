package com.epam.task6.logic.sort;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.comparator.AuthorComparator;
import com.epam.task6.logic.comparator.Comparator;
import com.epam.task6.logic.comparator.TitleComparator;
import com.epam.task6.model.Book;

import java.util.*;

public class AuthorSort implements SortBook {

    @Override
    public Set<Book> sortBook(Set<Book> books) throws DataException {
        Comparator<Book> comparator = new AuthorComparator();
        List<Book> booksSorted = new ArrayList<>(books);

        Collections.sort(booksSorted, comparator);

        LinkedHashSet<Book> result = new LinkedHashSet<>(booksSorted);
        result.addAll(booksSorted);

        return result;
    }
}
