package com.epam.task6.logic.sort;

import com.epam.task6.data.DataException;
import com.epam.task6.logic.comparator.Comparator;
import com.epam.task6.logic.comparator.PriceComparator;
import com.epam.task6.logic.comparator.TitleComparator;
import com.epam.task6.model.Book;

import java.util.*;

public class PriceSort implements SortBook {
    @Override
    public List<Book> sortBook(List<Book> books) throws DataException {
        Comparator<Book> comparator = new PriceComparator();
        List<Book> booksSorted = new ArrayList<>(books);

        Collections.sort(booksSorted, comparator);

        return booksSorted;
    }
}
