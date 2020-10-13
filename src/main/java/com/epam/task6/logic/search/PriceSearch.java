package com.epam.task6.logic.search;

import com.epam.task6.data.DataAcquirer;
import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PriceSearch implements SearchBook {

    @Override
    public Set<Book> findBook(String value, Set<Book> books) throws DataException {
        Set<Book> result = new HashSet<>();
        for (Book book : books) {
            String str = String.valueOf(book.getPrice());
            if (str.equalsIgnoreCase(value)) {
                result.add(book);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new DataException("not found");
    }
}