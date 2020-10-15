package com.epam.task6.logic.search;

import com.epam.task6.data.DataAcquirer;
import com.epam.task6.data.DataException;
import com.epam.task6.logic.Field;
import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbOfPagesSearch implements SearchBook {

    @Override
    public List<Book> findBook(String value, List<Book> books) throws DataException {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            String str = Integer.toString(book.getNumbOfPages());
            if (str.equalsIgnoreCase(value)) {
                result.add(book);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new DataException("not found");
    }
}
